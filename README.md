# Demography
Demography is the statistical study of populations, especially human beings. 
This projects is a management software for keeping the demographic details for
being enable the future analysis.

# Technology used
    1) Java 8
    2) Spring Boot (v1.5.2)
    3) Thymeleaf (v2.1.5)
    4) Spring MVC (4)
    5) Spring Data JPA
    6) H2 database
    7) Intellij Idea (Community edition)
    8) Maven (3.3.9)
    
# Getting Started
    1) git clone https://github.com/mahedi-kaysar/demography.git
    2) cd demography
    3) mvn package && java -jar target/demography-1.0-SNAPSHOT.jar
    4) Open the bellow link browser. Please use google chrome 
        as the project was tested in that browser only. The datepicker may not work in other browser
        as I have used html5 input type 'date'.
    
        http://localhost:8080/
    5) please raise issue in github if you found and feedback is appricited.
# Features developed
    1) Total 3 pages 
    2) Homepage: contains 2 links including (i) add new record and (ii) person list
    3) First link contains a form, anyone can put details. After submitting it retrun 2nd link with the new record
    4) Second one shows the list of persons.
# Some snapshots 
   ![Person Form](/docs/images/personform.PNG?raw=true) |
   ![Form Validation](/docs/images/formvalidation.PNG?raw=true)
   ![Person List](/docs/images/person-list.PNG?raw=true)

# Technical difficulties covered (with addition to previous versions)
    1) Thymeleaf form binding, Java 8 TimeDialect.
    2) Spring MVC, Dependency Injection, Autowire, Annotations,
    4) Multiple controllers have been used
    5) Custom annotations have been created for contraint validations
    6) Added in memory data base support with Spring Data JPA implementaion
    7) Successfully created Person table with JPA annotations
    
# TODO
    1) Unit and Integration testing
    2) Checking the code reusablity and upating properly
    3) Nice UI design.
     
# Conclusion
Enjoy Demographic Analytics! New features are coming.