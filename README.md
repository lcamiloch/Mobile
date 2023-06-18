
# Project automation of Conduit App

This project provides for the execution of tests on Conduit app
* Login successful
* Login failed

### Environment
* Java 1.8
* Maven 3.8.1

###Download project
```
$ git clone https://github.com/lcamiloch/Mobile.git
```

###Run project
* You need to have Appium server running and an Android mobile emulator with android version 10


* Run all scenarios
```
$ mvn clean verify
```
* Run with tags
```
$ mvn clean verify -Dtags="{tag name}"
```

###Demo video
https://drive.google.com/file/d/18v4aMYTIdl3XrAvc8_9fhFwD8AJtr8cq/view?usp=sharing