# Busticket-booking-java

### Bus ticket reservation system using javaFX - Deployment

1. Download Java SDK and MySQL
2. Configure MySQL and open MySQL Workbench. Import the database 'bus'
3. Add mysql connector jar file can be found in the lib db folder.
4. Open the project in IDE (Visual Studio Code). Go to File -> Project Structure ->
Project and set your project SDK to the JavaFX SDK you downloaded.
5. Then go to File -> Project Structure -> Libraries and add the JavaFX SDK as a
library to the project. Point to the lib folder of the JavaFX SDK. Also add the MySQL
connector jar file to the project.
6. Add VM options. click on Run -> Edit Configurations and add these VM
options 
```
“"vmArgs": "–module-path C̈:/Program Files/Java/javafx-sdk-17.0.6/lib-̈-add-
modules javafx.controls,javafx.fxml"
```
7. Run the application (Main.java)