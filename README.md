Hybrid Automation Framework Design

1. Project Overview
This is a Test Automation Framework built using:
* Java (programming language) and using Java Libraries
* TestNG (test execution & reporting frameworks)
* Selenium WebDriver (for browser automation)
* Maven (dependency using POM.xml & build management)
* Page Object Model (POM)(design pattern for maintainability)

Covered Functionality: Automate functional test cases for the DemoBlaze web application, Signup, and Login/Logout.).

2. Project Structure Design and Actual Structure

* src/test/java
  This is where my automation script is stored and it is also divided into two packages (“pagaObject” and “testcases”).

* PageObjects  - This contains different classes that represent each page of the application, and each class stores  the variable locators of all elements  and also the page actions method of each element.

* Explanation of test logic from UI locators, making the framework maintainable and reusable.
    * DemoBlazeHomepage.java - This home page class is where you can initiate/invoke or to interact with the modal page for the (sign up and Login page).
    * LoginPage.java -  These methods where you can initiate to enter string text for  username, password, and clicking login button.
    * Logout.java -  This method where you can perform the successful logout in the application..
    * SignUpPage.java -  This is where you can handle registration and can initiate to enter string text for  username, password, and clicking Signup button..
    * BasePage.java  - parent class with common utilities (e.g., waits, click, sendKeys).
    * This is where  all common utilities are being stored and usually used for every page object classes by using or declaring as a java class with inheritance. (extends basepage)


* TestCases Layer - This is where all my test cases scripts functionality are stored and for each class it also maps to a certain test scenario.
    * TC001_SingUpRegistration.java - validates user signup
    * TC002_Valid_Login_Testing.java - checks login with valid credentials
    * TC003_Invalid_Login_Scenario1.java -  invalid login test
    * TC004_Invalid_Login_Scenario2.java -  another invalid case
    * TC005_Invalid_Login_Scenario3.java - another invalid case
    * TC006_Logout_Testing.java - logout functionality
* Also Includes:
    * I also use some TestNg annotations to control some test execution flow to my project.
        - @BeforeClass and @afterClass - to set up and close browser sessions.
        - @BeforeMethod and @AfterMethod - to run preconditions and postconditions for my login and logout test cases.
        - @Test - to mark actual test methods to all my test cases package.
    * BaseClass.java
        - Test setup & teardown (browser launch, close)
        - WebDriver initialization
        - Common configurations (timeouts, reports, logs).
        - I also inherited the methods under  baseClass to all my test scripts.(Java Inheritance) 

* Execution of testing
    * I used testNG XML to run my automation
      	Capability using testNG.xml
          - You can define which suite you want to run and you can also set the groupings and prioritization for parallel execution testing.

* Pom.xml
    * This is where I save or import all dependencies that I’ve used to my project.
    * Contains dependencies:
          - Selenium
          - TestNG
          - WebDriverManager
          - Extend Reports

   
