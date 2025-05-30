# Jovian-Database

## Team Members  
Avin Mendiratta  
Kunal Kulkarni  
Moinak Mondal 

## Project Description
The project shows how a database can be leveraged in Java Application to handle magnitude and variety of information pertaining to the qualitative and quantitative  aspects of a real or fictional objects. 
In our case we have taken the example of tabulating the characteristics of a species in a database containing metrics describing multiple alien species.

**User Interface**  
JavaFX tools were implemented in a Maven project. The scenes were built using xml code in an fxml file. 
Then aesthetic styling was applied on the classes and/or particular objects using CSS.

**Database Implementation**  
The persistent database was primarily implimented using MySQL Workbench. Tables were created with various extractable fields so as to display relevant information about each of the species on the page. Several datatypes like variable characters, text, integers and blobs (images) were used to make the data more interesting. Graphs were created using the population data of each species stored in a seperate table which was grouped by alien id. The data was added to the database by the use of SQL command prompts and images were loaded into the database by the load from file functionality.

**UI logic**  
The main class was implemented using various JavaFX libraries' classes such as Application, FXMLloader, Scene and Stage.  
The user interaction was implemented using various JavaFX libraries' classes such as those described above and including Event class and Control class objects like buttons, labels and Menu items.  
For example a button click by the user prompts a method in the controller class that produces a predefined result such change of scene, displaying the database metrics' values etc.  

**Individual Contribution**  

Avin Mendiratta : Contributed to UI logic and elements, and helped in the integration of database with the application  
Kunal Kulkarni : Contributed to development of DBMS in MySQL and integration of database with the application  
Moinak Mondal : Contributed to development of UI elements and application of Cascading Style Sheets on fxml files
