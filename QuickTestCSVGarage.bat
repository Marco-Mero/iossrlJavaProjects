@echo off
if not exist bin ( mkdir bin ) 
javac -cp src -d bin src/iossrl/csvgarage/TestGarage.java src/iossrl/csvgarage/models/*.java src/iossrl/csvgarage/csvhandler/*.java


echo. && echo. Test del progetto CSVGarage, per gestire un CSV che registra auto e moto.


echo ~~~ ~~~ ~~~ ~~~ ~~~ 
    echo. ~$ running: java -cp src iossrl.csvgarage/TestGarage.java
echo ~~~ ~~~ ~~~ ~~~ ~~~ 

java -cp bin iossrl/csvgarage/TestGarage

echo.
echo. ~~~ ~~~ ~~~ Utilizzo:
    echo.~~~ Singola Stringa:
    echo.- Prezzi esatti con una posizione decimale e $ (e.g. 0.0$).
    echo.- Targhe esatte.
    echo.- "Moto" visualizza i ciclomotori nel csv.
    echo.- "Auto" visualizza le macchine nel csv.
    echo.- "Reset--hard" ricrea il file CSV d'esempio.  && echo.
    echo.
    echo.~~~ Inserimento di Veicoli: 
    echo.Multiple stringhe CSV ben formate indicheranno inserimento di veicoli.
    echo.Il programma si occupa di validazione minima con warning su prezzo e targa.
    echo.Duplicati o veicoli con campi errati, prezzi o un numero di ruote invalidi saranno rifiutati.

:start

if not "%arg%"=="" (
    echo.~~~ ~~~ ~~~
        echo. Ultimo comando: java -cp bin iossrl/csvgarage/TestGarage %arg% 
    echo.~~~ ~~~ ~~~ 
)
    echo.
    echo.Test String[]: "Lamborghini;Murcielago;1000000;co670sa;4" "Mustang;Elon;12312;ta354to;4"
    echo Inserire gli argomenti del programma : && echo.
    set /p arg= 
    java -cp bin iossrl/csvgarage/TestGarage %arg% 
goto start