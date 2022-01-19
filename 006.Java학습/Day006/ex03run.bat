rem @echo off
mkdir bin
javac -d bin src\com\hi\Ex03.java
cd bin
java com.hi.Ex03
cd ..
rmdir /S /Q bin
pause