@echo off
if not exist bin ( mkdir bin ) 
javac -d bin src/iossrl/findmin/*.java

echo ~~~ ~~~ ~~~ ~~~ ~~~ 
    echo ~$ running: java -cp bin iossrl.findmin.TestMin 
echo ~~~ ~~~ ~~~ ~~~ ~~~ 

java -cp bin iossrl.findmin.TestMin 
echo. && echo.
    echo.     premere un tasto per uscire.
pause > nul
