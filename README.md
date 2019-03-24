# Digit Game
Digital game implemented with basic java 

##Build info

[![JDK](http://img.shields.io/badge/JDK-v8.0-yellow.svg)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
[![Build](http://img.shields.io/badge/Build-Maven_3-green.svg)](https://maven.apache.org/)

##Rules defined as follow:

Rule name           |  Priority             |  Next rule
-------------------|-----------------|----------------
FizzGameRule       | digit is dividable by 3, transfer to 'Fizz'           | BuzzGameRule        
BuzzGameRule       | digit is dividable by 5, transfer to 'Buzz' | DefaultGameRule               
DefaultGameRule    | transfer integer to string in case that no other rules applied           | NONE


##Note:
- Application main class: com.harbor.digit.game.GameApplication
- UT test suite class: com.harbor.digit.game.TestGameApplication