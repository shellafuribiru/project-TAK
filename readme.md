# TAK - Automation Testing Project for BookCart

## Overview
This project is an automation testing suite for the [BookCart website](https://bookcart.azurewebsites.net/). It is built using **Katalon Studio** with a modular structure to ensure reusability, scalability, and ease of maintenance.

## Project Structure
The project is organized as follows:

### **1. Test Cases**
- **Blocks**: Contains reusable modular test cases:
  - **Browser Management**
    - `Open Browser`: Initializes and opens the browser.
    - `Close Browser`: Closes the browser after the test execution.
  - **Cart Management**
    - `Add Item to Cart`: Adds a specific product to the shopping cart.
    - `Remove Item from Cart`: Removes a specific product from the cart.
    - `Clear Cart`: Removes all product from the cart.
    - `Go to Cart Page`: Navigates to cart page
    - `Empty State Cart`: Checks the cart when it is empty.
  - **Product Management**
    - `Go to Product Detail`: Navigates to product detail page
    - `Verify Product Details`: Verify all attributes on product details
  - **Menu Management**
    - `Click Menu`: Verify user can click menu on beranda page
  - **User Authentication**
    - `Login Valid`: Tests successful login with valid credentials.
    - `Login Invalid`: Tests login with invalid credentials.
    - `Register Valid`: Tests successful user registration.
    - `Register Invalid`: Tests registration with invalid inputs.
   
    
    
    
- **Scenarios**: Contains end-to-end test cases simulating user workflows:
  - **Keranjang**
    - Validates removing items and cart behavior
    - Validates empty cart state.
  - **Product Detail**
    - Validates the display of the product detail page.
  - **Register**
    - Tests the registration process (successful and failed scenarios).
  - **Login**
    - Tests the login process (successful scenarios).
  - **Logout**
    - Tests the logout process (successful scenarios).
      

---

### **2. Object Repository**
Stores all the web elements categorized by their respective pages:
- **Beranda Page**: Objects related to the homepage.
- **Keranjang Page**: Objects related to the cart page.
- **Login Page**: Objects related to the login page.
- **Product Detail Page**: Objects for the product detail page.
- **Register Page**: Objects for the registration page.

Link Google Drives : https://drive.google.com/file/d/1-1H3u86qaM_TYTaL6OEb2ni2M3TAPgOt/view?usp=drive_link
