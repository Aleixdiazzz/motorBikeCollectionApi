# Motorcycle Collection Management API 🏍️

The Motorcycle Collection Management API is a Java-based web application built using Spring Boot framework and PostgreSQL database. This API allows users to manage motorcycle collections, compare bikes, manage owners, and compare their collections.

## Features ✨

### 1. Motorcycle Management
- **Add Bikes**: Users can add new motorcycles to their collection, specifying details such as brand, model, year, horsepower, and cubic centimeters.
- **Update Bikes**: Users can update existing motorcycle details, such as model year, horsepower, etc.
- **Delete Bikes**: Users can remove motorcycles from their collection.

### 2. Comparison
- **Compare Bikes**: Users can compare details of two or more motorcycles side by side.

### 3. Owner Management
- **Add Owners**: Users can add new owners to the system, providing details like name, surname, age, phone number, and email.
- **Update Owners**: Users can update owner details, such as phone number or email address.
- **Delete Owners**: Users can remove owners from the system.

### 4. Collection Comparison
- **Compare Collections**: Users can compare collections of different owners.

## Technologies Used 🛠️
- **Java**: Core programming language.
- **Spring Boot**: Framework for building Java-based applications, simplifying setup and development.
- **PostgreSQL**: Relational database management system used for data storage.
- **Maven**: Dependency management tool for Java projects.

## Getting Started 🚀
1. **Clone the Repository**: Clone the repository to your local machine.
2. **Configure PostgreSQL**: Set up a PostgreSQL database and configure the application.properties file with the appropriate database connection details.
3. **Build and Run**: Build and run the application using Maven or your preferred IDE.
4. **Explore the API**: Access the Documentation in the Documentation Folder to explore how to interact with the API endpoints.

## API Endpoints 📡
The API provides the following endpoints:

- **/motorbikes**: CRUD operations for managing and comparing motorcycles.
- **/owners**: CRUD operations for managing owners and comparing collections.


## Contributing 🤝
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.
