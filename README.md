# CovidTracker

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=Thymeleaf&logoColor=white)](https://www.thymeleaf.org/)

## Overview
CovidTracker is a simple web application developed using Java, Spring Boot, and Thymeleaf. The application fetches real-time COVID-19 data from an open-source API and displays it on a web page.

## Features
- **Fetch Real-Time Data:** The application retrieves up-to-date COVID-19 data from an open-source API.
- **Render Data Using Thymeleaf:** The fetched data is rendered and displayed in a clean HTML format using Thymeleaf templates.
- **Simple Interface:** The application provides an easy-to-understand interface for viewing COVID-19 statistics.

## How It Works
1. **API Integration:** The application integrates with an open-source COVID-19 API to fetch real-time data.
2. **Data Processing:** The data is processed in the backend using Java and Spring Boot.
3. **Display:** The processed data is then rendered and displayed on the webpage using Thymeleaf templates.

## Endpoints
- **Home:** Access the tracker at `http://localhost:8080/tracker`

## Prerequisites
- Java 11 or higher
- Maven
- Spring Boot

## Getting Started
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/git-arpit/covidtracker.git
   cd covidtracker
2. **Build the project**
   ```bash
     mvn clean install
   ```
3. **Run the application**
   ```bash
     mvn spring-boot:run
   ```
4. **Access the application**
   ```bash
     http://localhost:8080/tracker
   ```
