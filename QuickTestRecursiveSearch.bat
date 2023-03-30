@echo off

if not exist bin ( mkdir bin )
javac -d bin src/iossrl/isbeforemax/*.java

echo ~~~ ~~~ ~~~ ~~~ ~~~ 
    echo ~$ running: java -cp bin iossrl.isbeforemax.TestRecursiveSearch
echo ~~~ ~~~ ~~~ ~~~ ~~~ 

java -cp bin iossrl.isbeforemax.TestRecursiveSearch

echo. && echo.
    echo.     premere un tasto per uscire.
pause > nul
