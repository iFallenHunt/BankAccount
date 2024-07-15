[🇧🇷️](Readme-PTBR.md)

# Bank Account Project

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
    - [Model Package](#model-package)
    - [Service Package](#service-package)
    - [View Package](#view-package)
    - [Main Class](#main-class)
- [Future Improvements](#future-improvements)
- [Contributing](#contributing)
- [License](#license)

## Overview
The **Bank Account Project** is a simple banking application that allows users to create and manage bank accounts, including checking and savings accounts. It offers functionalities such as viewing balance, transaction history, and updating account settings, all with a graphical user interface (GUI) using `JOptionPane`.

## Project Structure
The project is structured into several packages to maintain a clean and organized codebase:

```plaintext
com.bankaccount
├── Main.java
├── model
│   ├── Account.java
│   ├── CheckingAccount.java
│   ├── SavingsAccount.java
│   ├── Client.java
│   ├── Bank.java
├── service
│   ├── IAccount.java
├── view
│   ├── LoginScreen.java
│   ├── CreateAccountScreen.java
│   ├── BalanceScreen.java
│   ├── TransactionHistoryScreen.java
│   ├── AccountSettingsScreen.java
│   ├── MainMenu.java
```

## Features
- **Create Accounts**: Users can create checking or savings accounts.
- **View Balance**: Users can view the balance of their accounts.
- **Transaction History**: Users can view their transaction history.
- **Update Account Settings**: Users can update their account information.
- **Login**: Basic login functionality to simulate user authentication.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Lombok library

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/bank-account-project.git
    ```
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Ensure Lombok is properly set up in your IDE.
4. Build and run the project.

## Usage
1. Run the Main class located in the com.bankaccount package.
2. Use the GUI to interact with the application:
    - **Login**: Enter username and password (user / password).
    - **Create Account**: Select the type of account and enter the client's name.
    - **View Balance**: View the balance of the created account.
    - **Transaction History**: View the transaction history.
    - **Account Settings**: Update the client's name.
    - **Exit**: Close the application.

## Code Explanation

### Model Package
- **Bank.java**: Represents the bank with a name.
- **Client.java**: Represents a client with a name.
- **Account.java**: Abstract class representing a generic bank account.
- **CheckingAccount.java**: Represents a checking account.
- **SavingsAccount.java**: Represents a savings account.

### Service Package
- **IAccount.java**: Interface defining basic account operations.

### View Package
- **LoginScreen.java**: Handles user login.
- **CreateAccountScreen.java**: Handles account creation.
- **BalanceScreen.java**: Displays account balance.
- **TransactionHistoryScreen.java**: Displays transaction history.
- **AccountSettingsScreen.java**: Handles account settings updates.
- **MainMenu.java**: Main menu for navigating through the application.

### Main Class
- **Main.java**: Entry point of the application, initializes the main menu.

## Future Improvements
- Implement more robust authentication and authorization mechanisms.
- Add more detailed transaction history with timestamps and descriptions.
- Enhance the GUI with better design and usability.
- Integrate a database to persist account and transaction data.

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
