<!-- COMPILE -->
javac -d out $(find src -name "*.java")

<!-- EXECUTE -->
java -cp out menu.Menu
