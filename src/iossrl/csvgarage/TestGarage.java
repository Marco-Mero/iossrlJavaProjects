package iossrl.csvgarage;

import iossrl.csvgarage.models.Car;
import iossrl.csvgarage.models.Moto;
import iossrl.csvgarage.models.Vehicle;
import iossrl.csvgarage.csvhandler.CSVUtils;

import java.util.ArrayList;

public class TestGarage {

    private static void printArrayList(ArrayList<String> recordList) {
        for (String singleRecord : recordList) {
            System.out.println(singleRecord.replaceAll(";", " "));
        }
    }

    private static void printVehicleList(ArrayList<Vehicle> vehicleList) {
        for (Vehicle singleVehicle : vehicleList) {
            System.out.println(singleVehicle.toCSVRecord().replaceAll(";", " "));
        }
    }

    private static void selectProgram(String choice) {
        switch (choice) {

            case "Moto":
                System.out.println("\nMoto nel file:");
                printArrayList(CSVUtils.listFromCSVByWheelNumber(2));
                break;
            case "Auto":
                System.out.println("\nMacchine nel file:");
                printArrayList(CSVUtils.listFromCSVByWheelNumber(4));
                break;
            case "Help":
                System.out.println("~~~ ~~~ ~~~ Utilizzo:");
                System.out.println("~~~ Singola Stringa:");
                System.out.println("- Prezzi esatti con una posizione decimale e $ (e.g. 0.0$).");
                System.out.println("- Targhe esatte.");
                System.out.println("- \"Moto\" visualizza i ciclomotori nel csv");
                System.out.println("- \"Auto\" visualizza le macchine nel csv.");
                System.out.println("- \"Reset--hard\" ricrea il file CSV d'esempio.");
                break;
            case "StandardTest.123":
                Vehicle fiesta = new Car("ford", "fiesta", 1233, "pl473id");
                Vehicle harley = new Moto("harley", "moto", 1233, "pl47id");
                standardTest(fiesta, harley, "io000sr", "1233.0");
                break;
            case "Reset--hard":
                CSVUtils.hardResetToExampleFileProvided();
                break;
            default:
                if (choice.length() == 0) {
                    System.out.println("    ~ Contenuto del file CSV:");
                    CSVUtils.printAllVehicles();
                }
                if (choice.charAt(choice.length() - 1) == '$') {
                    String price = choice.replaceAll("\\$", "");
                    printArrayList(CSVUtils.listFromCSVByPrice(price.toString()));
                } else {
                    System.out.println("\nRecord CSV e linea del file corrispondenti alla targa \"" + choice + "\" :");
                    System.out.println(CSVUtils.findVehicleCSVRecord(choice));
                }
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("~ Test funzioni:");
            System.out.println("| Aggiunta veicoli via input utente in CSVGarage.csv");
            System.out.println("| Ricerca e stampa di liste divise per tipo di veicolo.");
            System.out.println("| Ricerca veicolo via targa con stampa in console.");
            System.out.println("| Ricerca veicolo via prezzo con stampa in console.\n");
            System.out.println("    ~ Contenuto del file CSV:");
            CSVUtils.printAllVehicles();
        }

        if (args.length == 1) {
            selectProgram(args[0]);
        }

        if (args.length > 1) {
            for (int i = 0; i < args.length; i++) {
                CSVUtils.addVehicleToCSV(args[i]);
            }
        }

        System.out.println();
    }

    private static void standardTest(Vehicle vehicle1, Vehicle vehicle2, String plateToFind, String priceToFind) {
        System.out.println("~ Test standard ~");
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>() {
            {
                add(vehicle1);
                add(vehicle2);
            }
        };
        System.out.println("\n ~ Aggiungo i veicoli :");
        printVehicleList(vehicleList);

        System.out.println("al file .csv:");
        CSVUtils.addVehiclesToCSV(vehicleList);

        System.out.println("\nCerco il veicolo con targa: " + plateToFind);
        System.out.println(CSVUtils.findVehicleCSVRecord(plateToFind).replace(";", " "));

        System.out.println("\nCerco tutti i veicoli con prezzo: " + priceToFind);
        printArrayList(CSVUtils.listFromCSVByPrice(priceToFind));
    }

}
