## This repo Translates the Creation account recorded in Genesis 1 
_in the Bible into an interactive visual code.
The code was Implemented by using the concepts of classes and abstract data types, data structures such as a Lists and Maps to keep the days for the events in their correct order. 
As well as a json file to store the verses
The code provides an output of the corresponding verse 
and include visual elements such as emojis to represent the themes in the creation_

* The program starts by declaring a {**Map**} called {**creationDays**} to store CreationDay objects, and a Scanner object called **scanner** to read user input.
* The **main**() function is the entry point of the program.
* It calls two other functions: **initializeCreationDays**() and **promptUser**().
* The **initializeCreationDays**() function is responsible for reading the **creation_data**.json file
* and populating the **creationDays** map with **CreationDay** objects.
* It creates a **Gson** object to parse the JSON data, reads the file,
* and converts the data into a **list** of CreationData objects.
* It then iterates over the list,
* creates a **CreationDay** object for each **CreationData** object,
* and adds it to the **creationDays map** with the day number as the **key**.
* The **promptUser**() function prompts the user to enter a day number between 1 and 7.
* It reads the user input using the **scanner** object.
* If the input is a valid day number,
* it retrieves the corresponding **CreationDay object** from the **creationDays** map
* and calls its **displayDay**() method to print the verse, description, and visual elements.
* If the input is invalid, it prints an error message.
* The **_CreationData class_** represents the _**data structure**_ for each day of creation,
* as defined in the **_creation_data.json_** file.
* It has three fields:
* {
* **_verse**_ (a string representing the Bible verse), 
* **description** (a string describing the creation events), 
and **visualElements** (a list of strings representing the visual elements associated with that day).
* }
* The CreationDay class is responsible for displaying the information for a specific day of creation. 
* It has three fields: _**verse, description, and visualElements**_.
* The **displayDay**() method prints the verse, description, and visual elements for that day.