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
4. **Explore the API**: Access the documentation [here](https://github.com/Aleixdiazzz/motorBikeCollectionApi/blob/main/motorbikecollectionapi/apiDocumentation.md) to explore how to interact with the API endpoints.

## API Endpoints 📡
The API provides the following endpoints:

- **/motorbikes**: CRUD operations for managing and comparing motorcycles.
- **/owners**: CRUD operations for managing owners and comparing collections.


# Motorcycle API Documentation


## Base URL🔗
The base URL for motorcycle endpoints is `http://localhost:8080/motorbikes` and `http://localhost:8080/owners` for owner endpoints.

## Endpoints For MotorCycle related operations:

### 1. Get All Motorcycles📋
- **URL:** `/motorbikes`
- **Method:** GET
- **Description:** Retrieves a list of all motorcycles.
- **Response:** List of Motorbike objects.

### 2. Get Motorcycle by ID🔍
- **URL:** `/getBike/{id}`
- **Method:** GET
- **Description:** Retrieves a motorcycle by its ID.
- **Parameters:** `id` - ID of the motorcycle to retrieve.
- **Response:** Motorbike object.

### 3. Compare Motorcycles🔄
- **URL:** `/compare/{bikeOneId}/{bikeTwoId}`
- **Method:** GET
- **Description:** Compares two motorcycles and returns a comparison result.
- **Parameters:** `bikeOneId`, `bikeTwoId` - IDs of the motorcycles to compare.
- **Response:** Comparison result as a String.

### 4. Get Motorcycles by Collection📦
- **URL:** `/collection/{collectionId}`
- **Method:** GET
- **Description:** Retrieves motorcycles belonging to a specific collection.
- **Parameters:** `collectionId` - ID of the collection.
- **Response:** List of Motorbike objects.

### 5. Update Motorcycle🛠️
- **URL:** `/{id}`
- **Method:** PUT
- **Description:** Updates an existing motorcycle.
- **Parameters:** `id` - ID of the motorcycle to update.
- **Request Body:** Motorbike object with updated details.
- **Response:** Updated Motorbike object.

### 6. Add New Motorcycle➕
- **URL:** `/`
- **Method:** POST
- **Description:** Adds a new motorcycle to the collection.
- **Request Body:** Motorbike object with details of the new motorcycle.
- **Response:** New Motorbike object added to the collection.

### 7. Delete Motorcycle❌
- **URL:** `/deleteBike/{id}`
- **Method:** DELETE
- **Description:** Deletes a motorcycle from the collection.
- **Parameters:** `id` - ID of the motorcycle to delete.
- **Response:** Success message confirming the deletion.

### 8. Delete Collection❌
- **URL:** `/deleteCollection/{collectionId}`
- **Method:** DELETE
- **Description:** Deletes a collection of motorcycles.
- **Parameters:** `collectionId` - ID of the collection to delete.
- **Response:** Success message confirming the deletion.

## Motorcycle Object Would look like this :
```Json
{
"brand" : "Honda",
"model" : "vfr",
"year" : 1999,
"horsePower" : 120,
"cubicCentimeters" : 750,
"collectionId" : 1
}
```

## Endpoints For Owner related operations:

### 1. Get All Owners📋
- **URL:** `/owners`
- **Method:** GET
- **Description:** Retrieves a list of all owners.
- **Response:** List of Owner objects.

### 2. Get Owner by ID🔍
- **URL:** `/findById/{id}`
- **Method:** GET
- **Description:** Retrieves an owner by their ID.
- **Parameters:** `id` - ID of the owner to retrieve.
- **Response:** Owner object.

### 3. Compare Collections🔄
- **URL:** `/compareCollection/{ownerOne}/{ownerTwo}`
- **Method:** GET
- **Description:** Compares collections of two owners and returns a comparison result.
- **Parameters:** `ownerOne`, `ownerTwo` - IDs of the owners to compare.
- **Response:** Comparison result as a String.

### 4. Update Owner🛠️
- **URL:** `/{id}`
- **Method:** PUT
- **Description:** Updates an existing owner.
- **Parameters:** `id` - ID of the owner to update.
- **Request Body:** Owner object with updated details.
- **Response:** Updated Owner object.

### 5. Add New Owner➕
- **URL:** `/`
- **Method:** POST
- **Description:** Adds a new owner to the system.
- **Request Body:** Owner object with details of the new owner.
- **Response:** New Owner object added to the system.

### 6. Delete Owner❌
- **URL:** `/{id}`
- **Method:** DELETE
- **Description:** Deletes an owner from the system.
- **Parameters:** `id` - ID of the owner to delete.
- **Response:** Success message confirming the deletion.

## Owner Object Would look like this :
```Json
{
    "name": "Aleix",
    "surname": "Diaz Llabres",
    "age": 22,
    "phone": 666666666,
    "email": "aleix@domain.com"
}
```



## Contributing 🤝
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.
