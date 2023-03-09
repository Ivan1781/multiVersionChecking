# multiVersionChecking

1) The repository is split into several packages, each containing samples of code for a particular version of Java. As an example, the repository contains code samples for Java releases 7, 8, 9, 10, 12
2) The test plan is presented in the form of a table and a template. Each column of the table corresponds to the Java version and contains new features of that version. Each feature has a sequence number in the format n_x, where n is Java version number, and x is the sequence number of the feature in the table.    
3) To check Java language level definition in IntelliJ IDEA, parent-child module structure is used. Each folder contains pieces of code for a particular version of the language. The following configuration types are checked: configuration inheritance from one module to another, without configuration inheritance and default language level definition - in case if no language version is defined in the modules. 
4) The template describes the general structure of the test case and uses the following steps: 
- A project is opened in IntelliJ IDEA of a particular version. 
- Then an appropriate package, such as level 8, is opened to test the identification of the language level of a particular version.  
- The sequence of checks can be any: first you specify the configuration of the language in the child pom, do not specify in the parent. Then the java languae level is specified in a parent pom, but not in child pom. The version of the language is specified by 1 less than the one checked in each case (in this case it would be 8-1=7). Then check the default state by removing the language version from child and parent poms. 
- In each case, check if IntelliJ IDEA correctly prompts you to switch the language version  by showing a tooltip window or sets it correctly in the settings.  
