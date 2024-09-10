# Login Functionality Test Automation

This project automates the testing of the login functionality of the **Germany is Calling** web application using **Selenium** and **TestNG** in Java.

## Prerequisites

1. **Java JDK** installed (version 8 or above).
2. **Eclipse IDE** Download and install Eclipse IDE for Java Developers from Eclipse official site.
3. **Maven** installed for dependency management.
4. **Google Chrome** browser installed and the **ChromeDriver** in your PATH.
5. **Selenium WebDriver** and **TestNG** set up in the project dependencies.

# Set Up Eclipse for Selenium and TestNG
1. **Install Eclipse IDE** After downloading, install Eclipse and start it.

2. **Install TestNG in Eclipse**
Go to Help > Eclipse Marketplace.
In the "Find" box, search for TestNG.
Click Go and install TestNG.
Restart Eclipse if prompted.

3. **Create a New Maven Project**
Go to File > New > Maven Project.
Select Create a simple project (skip archetype selection) and click Next.
Provide a Group ID (e.g., com.example.test) and Artifact ID (e.g., LoginAutomation).
Click Finish.

4. **Add Dependencies in pom.xml**
Open the pom.xml file (located under the root folder in the Project Explorer).
Add the necessary dependencies for Selenium, TestNG, and ExtentReports

# View the Test Report
After the test execution, navigate to target/surefire-reports/ and open index.html in your browser to view the default TestNG report.
Alternatively, if you are using ExtentReports, open emailable-Report.html in your project folder to view the customized test report.

# Additional Information
# Limitations
These tests are limited to the login functionality. Other parts of the application, such as user registration, forgot password, or user sessions, are not covered.
Tests may need to be updated if the structure or layout of the login page changes.

# Challenges
Handling dynamic elements or elements that load with a delay may require implementing explicit waits to ensure proper test execution.
