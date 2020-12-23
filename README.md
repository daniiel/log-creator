# log-creator
Spring Boot Application to generate Logs using a Rest Controller


## Steps to run the application

1. `gradle clean build`
2. Run the application `java -jar ./build/libs/log-creator-0.0.1-SNAPSHOT.jar`
3. Enter to the URL `localhost:8080/test`, it will show an INFO, ERROR and WARN log
4. Enter to the URL `localhost:8080/metric`, it will show a JSON format log