###### Note:

- La mancanza di Javadoc è da considerarsi in ottemperanza con la direttiva di evitare commenti.
- Le cartelle dei progetti sono in src/iossrl.
- I file .bat compilano il relativo progetto nella cartella bin /iossrl/\*
- Il file UtilsArrayTesting è duplicato per comodità di test.
- CSVGarage accenna un interfaccia di comunicazione Database SQL tramite modelli, ma incompleto.
- Primo progetto Java su Git.

---

# Consegne - 1.0.4

## Requisiti Fondamentali Generici

0. Le consegne, specialmente i requesiti richiesti, vanno rispettati per tutto il progetto.
1. Ogni esercizio dovrà essere un progetto indipendente.
2. La leggibilità del codice, al netto del clean code, è data dalla suddivisione delle funzionalità nelle classi adeguate.
3. L'obiettivo generale degli esercizi è anche valutare la capacità di gestire in maniera corretta la suddivisione delle varie classi nei package adeguati.
4. Richiediamo un utilizzo delle risorse ottimizzate riducendo i cicli di clock usati e ridurre al minimo le allocazioni in memoria, evitare quindi di aggiungere overhead sia come implementazione di codice sia come importazione di librerie o framework esterni salvo sia strettamente necessario.

---

## Requisiti Fondamentali Java

1. Utilizzo di [Oracle Java JDK 8](https://www.oracle.com/it/java/technologies/javase/javase8-archive-downloads.html) oppure [OpenJDK 8](https://openjdk.org/projects/jdk8/)
2. Il corretto utilizzo della classe che contiene il metodo main.
3. Visibilità degli oggetti e delle variabili.
4. Corretto utilizzo dei costruttori.
5. Suddivisione di un progetto come richiesto da una buona programmazione ad oggetti.
6. I commenti non servono in un progetto del genere. Non sono presenti logiche complesse che necessitano l'utilizzo di commenti.
7. L'implementazione di nuove funzioni è corretta però senza dimenticare la qualità del codice.

---

### **1) Unione Array**

**Obiettivo:** Attestare la capacità logica dello sviluppatore, la sua capacità di ottimizzazione e di pulizia del codice.

**Requisiti:** In questo esercizio non è possibile utilizzare nessuna classe, proprietaria di Java, che richieda di essere istanziata (es. no ArrayList, ecc).

**Consegna:**
Scrivere un metodo che in input riceva 2 array e restituisca l'unione dei 2 array. Il metodo deve essere in grado di gestire array in input di qualunque dimensione.
I valori all' interno dell'array unito non devono essere ripetuti.

```
Es:
A = [3, 2, 4, 7, 4, 5]
B = [3, 1, 9]
Risultato:
[3, 2, 4, 7, 5, 1, 9]
```

---

### **2) Ricorsione**

**Obiettivo:** Attestare la capacità logica dello sviluppatore, la sua capacità di ottimizzazione e di pulizia del codice.

**Requisiti:** In questo esercizio non è possibile utilizzare nessuna classe, proprietaria di Java, che richieda di essere istanziata (es. no ArrayList, ecc), **NB.** fatta eccezione per le classi necessarie a creare numeri randomici.

**Consegna:**
Scrivere un metodo ricorsivo di ricerca del valore minimo su un array di almeno 20 elementi riempito randomicamente con numeri compresi tra 1 e 1000.

```
Es:
A = [10, 122, 99, 67, 435, 100, 68, 94, 23, 14, 78, 828, 918, 36, 63, 102, 982, 104, 189, 1000]
Risultato:
10
```

---

## **3) Gestione Veicoli**

**Obiettivo:** il programmatore deve dimostrare le competenze sulla OOP.

**Requisiti:** Allo sviluppatore è concesso usare qualsiasi classe del framework/libreria Java e qualsiasi competenza in materia di programmazione ad oggetti (classi astratte, interfacce...).

**Consegna:**
Progettare un programma in grado di leggere da un file CSV un elenco di veicoli misti (auto o moto).

Il programma deve avere le seguenti funzionalità:

- Aggiunta di un nuovo veicolo prendendo in input da utente i dati e inserendoli nel file.
- Ricerca dei veicoli appartenenti alla tipologia auto o moto e stampa in console.
- Ricerca di un veicolo data la targa e stampa in console.
- Ricerca di un veicolo dato il prezzo e stampa in console.

```csv
Esempio CSV:
marca;modello;prezzo;targa;numero_ruote
fiat;panda;14000;pd000xy;4
ducati;monster;12000;dt000rr;2
iveco;aaa;100000;iv9999dt;4
ford;focus;35000;io000sr;4
honda;hornet;5000;ho987dg;2
```

# Esercizi di riserva - 1.0.1

## Per requisiti fare rifermento a [esercizi_candidato.md](https://github.com/Italia-On-Site/accademia_ios/blob/main/esercizi_candidato.md)

### Esercizio logico - [requisiti](https://github.com/Italia-On-Site/accademia_ios/blob/main/esercizi_candidato.md#2-ricorsione)

Usare la ricorsione per realizzare un metodo booleano in grado di verificare se un valore intero, preso in input dall'utente, sia contenuto in un array di valori creato staticamente. Se il valore massimo viene trovato prima del valore da cercare il metodo deve fermarsi restituendo FALSE, altrimenti il metodo dovrà restituire TRUE e dovrà stampare il numero di volte che il valore cercato compare all'interno dell'array.

```
Es.
input:
    valore da cercare: 2
    A = [1, 2, 3, 4, 2]

logica:
    // cerco il valore massimo all'interno dell'array
    4 -> A[3] // il valore massimo è 4 e si trova in posizione 3 dell'array
    4 sta prima di 2? No, quindi conto il numero di iterazione del valore da cercare

output:
    TRUE // ho trovato il valore e ho finito di ciclare l'array
    numero di iterazioni: 2 // stampo il numero di volte che il valore da cercare compare nell'array
```

```
Es.
input:
    valore da cercare: 2
    A = [1, 4, 2, 3, 2]

logica:
    // cerco il valore massimo all'interno dell'array
    4 -> A[1]  // il valore massimo è 4 e si trova in posizione 1 dell'array
    4 sta prima di 2? Sì, quindi mi fermo e restituisco FALSE

output:
    FALSE // il valore massimo risulta prima di una qualunque iterazione del valore da cercare
```

### Esercizio OOP - [requisiti](https://github.com/Italia-On-Site/accademia_ios/blob/main/esercizi_candidato.md#3-gestione-veicoli)

Creare un programma in grado di giocare a sasso, carta, forbici. L'utente deve, in fase di runtime, inserire la propria mossa e giocare contro il pc o contro un altro utente. Il computer dovrà scegliere la mossa in maniera randomica. Il programma termina quando uno dei due giocatori raggiunge il risultato di 3 vittorie o se viene scelto di interromperlo prima in maniera non forzata. Dovrà essere presenta una classe enumerativa per la gestione delle mosse.

---

## Bibliografia

- Clean code:
  - [Spunti online per il Clean Code](https://ddelfio.medium.com/cosa-ho-imparato-leggendo-il-libro-clean-code-di-robert-c-martin-87ebdd6290f0).
  - [Clean code. Guida per diventare bravi artigiani nello sviluppo agile di software](https://www.apogeonline.com/libri/clean-code-robert-c-martin/).
- Java:
  - [Il nuovo Java. Guida completa alla programmazione moderna](https://www.hoepli.it/libro/il-nuovo-java/9788820399306.html).
