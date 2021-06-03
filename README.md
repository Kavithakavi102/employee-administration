# employee-administration
Reads a json file and uploads in DB

# Running the application locally
Download intelIJ

Place the json file which needs to be read in resources folder.

Change the DB configurations in application.properties file

To build : ./gradlew clean build

To run   : ./gradlew bootRun

Hit the POST request to create an employee

POST Req : http://localhost:8080/employees/fileName

Note: Give the fileName which needs to be executed in the url

Execution Time: 1317ms