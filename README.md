# Adactin Hotel Application Tests

## Description

A Java UI automation project for testing the Adactin Hotel Application. It uses Selenium WebDriver to automate login and registration-page interactions, with TestNG for organizing and running tests. Screenshots are saved under `target/Screenshots`.

## Framework and project structure

The project follows the Page Object Model (POM): page classes hold UI elements and actions, test classes run the scenarios, and utilities handle browser startup and screenshots.

# Adactin Hotel Application Tests

## Description

A Java UI automation project for testing the Adactin Hotel Application. It uses Selenium WebDriver to automate login and registration-page interactions, with TestNG for organizing and running tests. Screenshots are saved under `target/Screenshots`.

## Framework and project structure

The project follows the Page Object Model (POM): page classes hold UI elements and actions, test classes run the scenarios, and utilities handle browser startup and screenshots.


## Dependencies and requirements

- Java 21
- Maven
- Selenium Java 4.52.0
- TestNG 7.12.0
- Apache POI OOXML 6.0.0 (declared in the project; spreadsheet functionality is not currently used)

Browser startup is configured to use Microsoft Edge. `BrowserFactory` also supports Chrome and Firefox. Install a supported browser before running the tests; Selenium Manager may manage the matching driver.

## Run the tests

From the project root:

```bash
mvn test