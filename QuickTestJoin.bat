@echo off
if not exist bin ( mkdir bin )
javac -cp src -d bin src/iossrl/arrayjoiner/*.java

echo. && echo.  Quattro test dell'algoritmo per unire due array con casi limite (array vuoti o stringhe da riformattare)
echo.  Premere un tasto alla fine di ogni test per continuare.

echo.
    echo.~~~ ~~~ ~~~ ~~~ ~~~ 
    echo. Caso 1: array in esempio.
    echo.    ~$ running: java -cp bin iossrl.arrayjoiner.TestJoinArrays "[3, 2, 4, 7, 4, 5]" "[3, 1, 9]"
    echo.~~~ ~~~ ~~~ ~~~ ~~~ && echo.
echo.
    java -cp bin iossrl.arrayjoiner.TestJoinArrays "[3, 2, 4, 7, 4, 5]" "[3, 1, 9]"
echo.&& pause >nul

echo.
    echo.~~~ ~~~ ~~~ ~~~ ~~~ 
    echo. Caso 2: array vuoti.
    echo.    ~running: java -cp bin iossrl.arrayjoiner.TestJoinArrays  "[ ]" "[ ]"
    echo.~~~ ~~~ ~~~ ~~~ ~~~ && echo.
echo.
    java -cp bin iossrl.arrayjoiner.TestJoinArrays  "[ ]" "[ ]"
echo. && pause >nul

echo.
    echo.~~~ ~~~ ~~~ ~~~ ~~~ 
    echo. Caso 3: singola stringa.
    echo.    ~$running:   java -cp bin iossrl.arrayjoiner.TestJoinArrays  "[ 1]" 
    echo.~~~ ~~~ ~~~ ~~~ ~~~ && echo.
echo.
    java -cp bin iossrl.arrayjoiner.TestJoinArrays  "[ 1]" 
echo.&& pause >nul


echo.
    echo.~~~ ~~~ ~~~ ~~~ ~~~ 
    echo. Caso 4: tre stringhe.
    echo.    ~$ running:   java -cp bin iossrl.arrayjoiner.TestJoinArrays " 2 23  12 123  q" " -2 - 13  2123 " " "
    echo.~~~ ~~~ ~~~ ~~~ ~~~ && echo.
echo.
    java -cp bin iossrl.arrayjoiner.TestJoinArrays " 2 23  12 123  q" " -2 - 13  2123 " " "
echo.
    echo. && echo. ~~~ ~~~ ~~~ ~~~ ~~~ 
    echo.  Test funzioni terminato, 
    echo.     premere un tasto per uscire.
    echo ~~~ ~~~ ~~~ ~~~ ~~~ 
pause > nul

