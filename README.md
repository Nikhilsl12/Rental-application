# Rental Application

## Description
The Rental Application is a comprehensive platform designed to facilitate the rental process for both property owners and tenants. It allows property owners to list their rental properties and manage tenants, while providing tenants with an easy way to find and apply for rental properties.

### Key Features
- **Property Listing:** Property owners can create and manage listings with detailed information including images, rent amount, and availability.
- **Tenant Management:** Owners can view and manage tenant applications, approve or reject applicants, and keep track of tenant information.
- **Application Process:** Tenants can apply for properties directly through the platform, providing necessary details and documents.
- **User Profiles:** Both property owners and tenants can manage their profiles, including contact information and preferences.

### Project Structure
The project is structured as follows:

- **`pom.xml`**: Maven configuration file.
- **`src/main/java/com/rentalappapi/api/`**: Base package for the application.
  - **`RentalappApplication.java`**: Main application class.
  - **`config/`**: Configuration classes.
    - **`JwtAuthenticationEntryPoint.java`**
    - **`JwtRequestFilter.java`**
    - **`JwtTokenUtil.java`**
    - **`WebSecurityConfig.java`**
  - **`controller/`**: REST controllers.
    - **`BookingController.java`**
    - **`EmailController.java`**
    - **`PropertyController.java`**
    - **`TenantController.java`**
    - **`UserController.java`**
  - **`entity/`**: JPA entities.
    - **`BookingEntity.java`**
    - **`OwnerEntity.java`**
    - **`PropertyEntity.java`**
    - **`TenantEntity.java`**
    - **`UserEntity.java`**
  - **`model/`**: Request and response models.
    - **`BookingIdRequest.java`**
    - **`BookingRequestBody.java`**
    - **`LoginRequestBody.java`**
    - **`PropertyIdRequest.java`**
    - **`PropertyRequestBody.java`**
    - **`TenantIdRequest.java`**
    - **`TenantRequestBody.java`**
    - **`UserIdRequest.java`**
  - **`repositories/`**: Spring Data JPA repositories.
    - **`BookingRepository.java`**
    - **`PropertyRepository.java`**
    - **`TenantRepository.java`**
    - **`UserRepository.java`**

### Technologies Used
- **Backend:** Spring Boot framework with Java
- **Database:** MySQL for data storage
- **Authentication:** Spring Security for secure user authentication and authorization
- **API:** RESTful APIs for communication between frontend and backend

