# World Restaurants
World Restaurants 


### Requirements:
> mysql (with DB name worldRestaurant)
(For seed data, please refer resouces/seed_data/restaurants.sql)

###TechStack:
> Spring - REST API framework.
> Flyway - for automatic schema creation and tracking schema changes.
> Swagger - For API documentation and testing from browser.
> Dozer  -  For DeepCloning objects. (Entity to POJOs)
> Lombok   -  Utility library to reduce boiler plate code (Auto Generation of Setter/Getter and Constructor)
> ES6
> ReactJS
> Axios
> Babel   — Transpiler (from ES6 to ES5 — most compatible)
> WebPack

### USAGE:

To build the project; use this command inside main directory
> mvn clean install

To Run the project; use this command inside main directory
> mvn spring-boot:run -Dspring.config.location=src/main/resources/ -Duser.timezone=GMT

To Access the SwaggerAPI documentation :
> http://localhost:8080/swagger-ui.html


### PS :
> All the APIs are under Authentication API Key. (Key with HeaderName can be found in application.properties)
> Implemented API
    >getRestaurants(cuisines,sortBy,order,restaurantName,pageNumber,pageSize)
     This API should take  
        cuisines as array of string (default - empty),
        sortBy - column name by which we want to sort (default - name),
        order - sorting order - ASC/DESC (default - ASC),
        restaurantName - searhed by column name (default - empty),
        pageNumber - Pagination page number (default - 0),
        pageSize - number of eleents on particular page (default - 100)
        as the input and retrieve extensive data about that player from the database.
     The output data will contain all restaurant and its address related information.

