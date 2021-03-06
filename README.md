# Project for practising different Selenium Techniques

## General Project Structure


```
+---.idea
|   \---libraries
+---bin
|   +---.idea
|   |   \---libraries
|   +---src
|   |   +---main
|   |   |   \---java
|   |   |       +---CommomUtil
|   |   |       +---META-INF
|   |   |       \---PageObjects
|   |   \---test
|   |       \---java
|   \---target
|       +---classes
|       |   +---CommomUtil
|       |   \---PageObjects
|       \---generated-sources
|           \---annotations
\---src
    +---main
    |   \---java
    |       +---CommomUtil
    |       +---META-INF
    |       \---PageObjects
    \---test
        \---java
            +---Common
            \---Tests
```

## Things Used
1. Different WebDriver Methods
2. Different Locator Techniques
3. Use of Implicit and Explicit Wait 
4. Use of Multiple Windows -> MultipleWindows Class
5. Use of Selenium Grid -> SeleniumGrid Class
6. Implementation of Partial ScreenShot Mechanism -> PartialScreenshot Class
7. Implementation of Fluent Wait -> Fluent Wait Class
8. Implementation of UX Validations using Selenium Width/Height Method -> UXValidations Class
9. Passed parameters from pom.xml / testng / data.properties file to test classes
10. Set Default Parameter(browser) in pom.xml and using that directly in test class. Will pass the browser value at the runtime by using command mvn clean test -Dbrowser=chrome . If no value is pass from command line, then the default value present in pom.xml will be used.
 

## TestNG
1. Implemented TestNG.xml file to run different TestCases
2. Implemented **@BeforeTest**/**@Test**/**@AfterTest** annotation to run the tests
3. Implemented @DataProvider Annotation
4. Implemented Parameterization mechanism where global values are passing from testng.xml to test methods
5. Implemented TestNg Listener -> ITestListener
6. Implemented Parallel Test Execution by Mentioning parallel thread count in testng.xml
7. Accessed methods of base class directly by inheriting the base class
8. Accessed methods of base class by making an object of base class


## Cucumber
1. To run the Cucumber Tests using tags mechanism from command line. Use this command  
**mvn clean test -Dcucumber.filter.tags="@QAClickAcademy or @Amazon"** 




