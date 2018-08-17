# QuickStack

## Introduction
QuickStack is a platform-as-a-service which provides online learning portal. It is built on top of OpenStack and uses both of its controlling interfaces: Rest API and Command Line Interface. The user logs in and views the catalog of available training labs. When the user selects the lab and starts it, the application builds infrastructure dynamically based on the user’s request using OpenStack services.

## Technology used
1. Quick Stack Project is built on top of OpenStack and uses both of its controlling interfaces: Rest API and Command Line Interface.
2. OpenStack Ocata version is used in the project and is customized to be used in lab environment and so far, can only be run with one compute node.
3. Server Side: Spring MVC, Java, OpenStack4j, Apache commons
a. Spring 4 is used to develop the web application with AngularJS and HTML5 to render views and JAVA
REST APIs with JAVA POJO as the controller and model.
b. Restful APIs are developed to login, GET user data, POST user data.
c. OpenStack4j is used as the OpenStack SDK for Java to provision and control the OpenStack system
from backend.
4. Client Side: HTML5, AngularJS, Bootstrap
a. HTML5 along with Bootstrap to render application screens
Quick Stack Project Report
Page 4
b. AngularJS is used to route across pages also, to invoke the backend REST APIs. 5. Database: Mongo DB
6. Build Tool: Maven
a. Maven is used as the build tool and all the dependencies are provided in pom.xml. 7. Web Server: Apache Tomcat 8.5
a. Apache Tomcat is used to run the Quick Stack application on local host.


## Project Overview
![image](https://user-images.githubusercontent.com/32632834/42430559-e25a3a86-82f4-11e8-99ef-a7fec42ad418.png)

## Application Features

### Create Servers
![image](https://user-images.githubusercontent.com/32632834/42430792-4195f930-82f6-11e8-84fc-148a2e728cf5.png)

### Create Snapshot and Restore
![image](https://user-images.githubusercontent.com/32632834/42430613-1d59d1dc-82f5-11e8-90cb-d38a21e71c98.png)

### Monitoring Server metrics
![image](https://user-images.githubusercontent.com/32632834/42430651-5c06c3b8-82f5-11e8-872c-60c0b694e57d.png)

### CLI Output
![image](https://user-images.githubusercontent.com/32632834/42430639-4156d864-82f5-11e8-8bb6-0b4da8a476d0.png)



