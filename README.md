# multiVersionChecking

1) The repository is split into several packages, each containing samples of code for a particular version of Java. As an example, the repository contains code samples for Java releases 7, 8, 9, 10, 12
2) The test plan is presented in the form of a table and a template. Please open https://miro.com/app/board/uXjVMfnrZL0=/ 
Each column of the table corresponds to the Java version and contains new features of that version. Each feature has a sequence number in the format n_x, where n is Java version number, and x is the sequence number of the feature in the table.    
3) To check Java language level definition in IntelliJ IDEA, parent-child module structure is used. Each folder contains samples of code for a particular version of the  language. The following configuration types are checked: configuration inheritance from one module to another, without configuration inheritance and default language level definition - in case if no language version is specified in the modules. 
4) The template describes the general structure of the test case and uses the following steps: 
- A project is opened in IntelliJ IDEA of a particular version. 
- Then an appropriate package of project (for example level 8) is opened to test the identification of the language level of a particular version.  
- Checks for each language feature are of three types: first one is the specifying of the language level in the child pom and no specifying in the parent. Second one is  specifying of java language level in a parent pom and no specifying in child pom. The third one is to check the default value of language level by removing it the language version from child and parent poms.  The version of the language is specified by 1 less than the one checked in each case (for example level 8-1=7). 
- In each case, check if IntelliJ IDEA correctly prompts you to switch the language version  by showing a tooltip window or sets it correctly in the settings.
  
Preconditions: installed IntelliJ IDEA (in this project was used 2022.3.2 Community Edition), Maven (in this project was used Bundled Maven), JDK (in this project was used openjdk-19.0.2).  
Checks should be performed on different kinds operating systems such as Linux, Windows, MacOS
