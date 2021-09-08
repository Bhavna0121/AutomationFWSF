<!-- PROJECT LOGO -->
<br />
<p align="center">
  <h3 align="center">README-Template</h3>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#More-Scope">More Scope</a>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
This dummy framwork defines the basic of Automation Framework. In this framework I have used the concept of Page Object Model, we can also use Page Factory. But for now implemented with POM.
In this, it justifies multiple testcases those are as below :
* Test Case 1: Try to submit without filling required fields and "Labels" of all the required fields printed on Console. 
<br />
ClassName -> TestCase1.java
<br />
Run mode - Jave application
<br />
Use testdata1.properties
<br />
* Test Case 2: Verify all input fields using Soft assertions. 
<br />
ClassName -> TestCase2.java
<br />
Run mode - with TestNg 
<br />
Use testdata2.properties
<br />
* Test Case 3: Verify all input fields using Hard assertions.
<br />
ClassName -> TestCase3.java
<br />
Run mode - with TestNg
<br />
Use testdata2.properties
<br />
* Test Case 4: Submit the form after filling all details properly by using XPath only. 
<br />
ClassName -> TestCase4.java
<br />
Run mode - with Java application
<br />
Use testdata2.properties
<br />
* Test Case 5: Verify DB entry after submitting the form using JDBC connection.
<br />
ClassName -> TestCase5.java
<br />
Run mode - Not executable for now as dummy 
<br />
Use testdata2.properties
<br />
* Test Case 6: Verify Email is triggered or not after submitting the form using assertion on DB considering an email trigger column as email_sent.  
<br />
ClassName -> TestCase6.java
<br />
Run mode - Not executable for now as dummy
<br />
Use testdata2.properties
<br />


Of course, no one template will serve all projects since your needs may be different. So I'll be adding more in the near future. You may also suggest changes by forking this repo and creating a pull request or opening an issue. Thanks to all the people have contributed to expanding this template!

A list of commonly used resources that I find helpful are listed in the acknowledgements.

### Built With

This section should list any major frameworks that you built your project using. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.
* [Core Java]
* [Selenium]
* [TestNg]

### More Scope
* [Extent Reporting]
* [Parallel Execution]
* [Page Factory Model]
And many more.

