# WhistleblowerApplication

The "Whistleblower" project is a `Restful` service.

A `whistleblower` platform involves various components, including a `web` application for reporting, a database to store information securely, 
and backend logic to handle submissions. Below is a simplified example of a `whistleblower` platform using `Java` with `Spring Boot`, a popular 
`Java` framework.

**Note:** This example assumes you have some familiarity with `Java`, `Spring Boot`, and `web development`.

The service will enable to:
----------------
- to get all reports from the system;
- to submit report to the system;
- to show the dashboard of the system.

**Technology stack:**
---------------- 
* Java `17`
* Spring Boot Starter `3.1.2`
* Spring Boot Starter Data JPA `3.1.2`
* Spring Boot Starter Thymeleaf `3.1.2`
* Spring Boot Starter Web `3.1.2`
* MySQL `8.0.20`
* Jakarta Persistence API `3.1.0`
* JUnit `4.13.2`
----------------
Installing
----------

Clone this repository to your local machine using:

```shell
git clone https://github.com/invzbl3/WhistleblowerApplication.git
```
Create a database by specifying URL for connection:

```
jdbc:mysql://localhost/whistleblower_db?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false&useUnicode=true&serverTimezone=UTC&characterEncoding=UTF8
```
using own `datasource` username & password

**Run the Application:**

Run your `Spring Boot` application, and it will start a server on `localhost:8080`
or accordingly as: 
- http://localhost:8080/api/reports/dashboard;
- http://localhost:8080/api/reports;
- http://localhost:8080/favicon.ico.

# REST Endpoints for WhistleblowerApplication

### Report Controller
| HTTP Method | REST Endpoint                     | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|-------------|-----------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| 
| `GET`       | `/api/reports/dashboard`                                | `show the dashboard of the system`
| `GET`       | `/api/reports` | `get all reports from the system`
| `GET`       | `/api/favicon.ico`     | `display favicon to the user`
---------------- 
To run `Maven` lifecycle command under the option `"Run"`, 
you need to add the following command as:

`clean install -U`

---------------- 
To run `Spring Boot` application, 
you need to add inside `Environment variables` as:

`DB_PASSWORD=...`

![WhistleblowerApplication(3)](https://github.com/invzbl3/WhistleblowerApplication/assets/24904825/5505f6e2-d798-4696-a1a8-58ad9542b2a2)

All these REST endpoints are intended for use in the application.