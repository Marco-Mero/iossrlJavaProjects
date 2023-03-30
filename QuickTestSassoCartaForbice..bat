@echo off

if not exist bin ( mkdir bin )
javac -d bin src/iossrl/sassocartaforbice/*.java

echo ~~~ ~~~ ~~~ ~~~ ~~~ 
    echo ~$ running: java -cp bin iossrl.sassocartaforbice.GameStart
echo ~~~ ~~~ ~~~ ~~~ ~~~ 

java -cp bin iossrl.sassocartaforbice.GameStart

echo.
    echo.     premere un tasto per uscire.
pause > nul
