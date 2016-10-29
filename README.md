# VodafoneLoginBDD

This readme is about the Java/selenium test case created to check the Login functionality on the MyVodafone webpage using Cucumber and Maven.

# Repository

This repository consists of the application code kept in 'src' folder.The 'Feautre' folder includes the BDD scenario written using Gherkin.

Files included in the repository:
- src folder
    - Test_Steps.java
    - TestRunner.java
- PageObjects folder
    - MyVodafone_First.java
    - MyVodafone_Second.java
    - MyVodafone_LoginPage.java
- Feature folder
    - Invalid_Login.feature
- pom.xml

The below softwares were used to complete this task:
- Eclipse IDE
- Java
- Cucumber
- Selenium WebDriver
- Maven

# Pre Conditions

- Java must be installed
- Eclipse IDE must be installed
- Configure Eclipse with Selenium Webdriver 
- Install Cucumber Eclipse Plug and configure Eclipse with Cucumber
- Install Maven in Eclipse IDE

# Design and Working

- Once all the installations are complete, a Maven project is created in Eclipse and the project consists of 'src' folder and pom.xml file
- Under the src folder, test.java package is created under which the actual code is written
- Another folder 'Feature' is created under which the BDD scenario script is written using Gherkin. The extension of this file is '.feature'
- The actual code is then written under the src folder using annotations for each statement mentioned in the BDD scenario script
- The pom.xml is the file which is used to execute the scripts. The dependancies are added in the pom.xml file to help in the execution.




