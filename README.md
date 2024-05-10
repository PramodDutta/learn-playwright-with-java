# Playwright with Java - TheTestingAcademy

This repository is dedicated to demonstrating the use of Playwright with Java for end-to-end testing. Playwright provides powerful browser automation and testing capabilities, supporting all modern rendering engines and allowing tests on various platforms.

## What is Playwright?

Playwright is an open-source Node.js library developed by Microsoft that enables interaction with Chromium, Firefox, and WebKit with a single API. It is designed for creating reliable and robust tests for modern web applications.

## Key Features

- **Multi-browser Support:** Tests can run on Chromium, Firefox, WebKit, and on platforms like Windows, Linux, and macOS.
- **Device Emulation:** Supports testing on different devices and screen sizes.
- **Advanced Features:** Includes native event handling, network request interception, and parallel test execution.
- **Community and Support:** Backed by a robust community and comprehensive documentation.

## Architecture

Playwright uses a client/server model where the Node.js library (client) communicates with a BrowserServer process. This architecture allows direct communication with the browser via the Chrome DevTools Protocol, enabling detailed control and monitoring of browser behavior.

## Prerequisites

- Java JDK 11+
- IntelliJ IDEA
- Maven

## Installation

1. **JDK Installation:**
   - Download and install the JDK from [Oracle's official site](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Set the `JAVA_HOME` environment variable according to your operating system instructions.

2. **Maven and IntelliJ:**
   - Install Maven and IntelliJ IDEA to handle project dependencies and provide a powerful coding environment.

## Quick Start Guide

1. **Set Up Your Environment:**
   Ensure that Java JDK and Maven are properly installed and configured.

2. **Create a New Java Project:**
   - Open IntelliJ IDEA and create a new project specifying Maven as the project manager.

3. **Add Playwright Dependencies:**
   Include Playwright dependencies in your `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.microsoft.playwright</groupId>
       <artifactId>playwright</artifactId>
       <version>1.15.3</version> <!-- Use the latest version -->
   </dependency>

<img width="826" alt="Screenshot 2024-05-10 at 1 12 34 PM" src="https://github.com/PramodDutta/learn-playwright-with-java/assets/1409610/bab46935-bcea-4f80-af49-df2a5db80bad">


```markdown
- **What is Playwright?**
  - Created for end-to-end testing needs
  - Supports all modern rendering engines: Chromium, WebKit, Firefox
  - Can be used on various platforms: Windows, Linux, macOS
  - Features context isolation and runs multiple browser configurations

- **Playwright vs. Selenium vs. Cypress**
  - New projects are increasingly choosing Playwright over Selenium

- **Key Features of Playwright**
  - Supports all major browsers: Chrome, Edge, Firefox, Safari
  - Emulates different devices
  - Reusable "logged-in" sessions
  - Browser contexts for isolating state
  - Simultaneous testing across multiple domains and pages
  - Advanced selector capabilities
  - File handling (downloads, uploads) and environment emulation (geolocation, permissions)

- **Why Use Playwright with Java?**
  - Advanced features for robust test suites
  - High performance and reliable execution
  - Strong community support and extensive documentation

- **Playwright Architecture**
  - Client/server architecture using Node.js and BrowserServer
  - Utilizes the Chrome DevTools Protocol
  - Isolates state with BrowserContexts
  - Supports both headless and headful modes

- **Websocket Communication**
  - Enables real-time, full-duplex communication over TCP

- **Prerequisites for Using Playwright with Java**
  - Java, JDK 11+
  - IntelliJ IDEA
  - Maven

- **Installation Guide**
  - Setting up JAVA_HOME on different operating systems
  - Detailed steps for JDK, Maven, and IntelliJ installation

- **Running Your First Playwright Test**
  - Environment setup
  - Project and dependency configuration
  - Writing and running a simple Playwright test

- **Locator Strategies**
  - Various locator types for robust element selection
  - Using locators in testing scripts



- **Advanced Topics**
  - Auto-waiting features
  - Handling alerts, popups, and multiple windows
  - Working with Shadow DOM and SVG
  - Calendar interactions and executing JavaScript
  - Test assertions, screenshots, video capture, and trace viewing
  - API testing and mock APIs
  - Integrating with Allure for reporting
  - Threading and parallel test execution
  - Reusable test states and data-driven testing
  - Implementing Page Object Model (POM)
  - Continuous integration and deployment with Jenkins
```

<img width="1009" alt="Screenshot 2024-05-10 at 1 12 10 PM" src="https://github.com/PramodDutta/learn-playwright-with-java/assets/1409610/16525adc-766b-41b6-b6bd-d4e4c8141aa1">

