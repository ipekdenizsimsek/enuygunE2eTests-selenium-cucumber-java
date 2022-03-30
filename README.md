# Automated test example in Java with Cucumber and Selenium WebDriver
This project is an example of UI automated functional test for https://www.enuygun.com/ and create a reservation using Selenium and Cucumber.

Test scenarios are described in the feature files located here ./src/test/resources/com/enuygun/reservation.


## Installation
You need to have Java 1.8 JDK installed along with maven.

To run the tests locally with Chrome, install ChromeDriver from here, add its location to your system PATH and add webdriver.chrome.driver=path/to/the/driver to your local variables.

To install all dependencies, run
> <code>$ mvn clean install</code>
## Running tests
 > <code>$ mvn test</code>
<p>By default, tests will run on Chrome. If you haven't added the chrome driver path to your local variables, you can add it directly in the run command with the option -Dwebdriver.chrome.driver=path/to/the/driver.</p>
