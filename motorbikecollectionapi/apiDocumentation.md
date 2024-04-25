# Motorcycle API Documentation

## Descriptionℹ️
This API provides endpoints to manage motorcycle data, including adding, updating, deleting motorcycles, comparing motorcycles, managing collections and owners.

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


