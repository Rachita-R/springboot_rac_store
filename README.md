# 🛒 RAC Store

A Spring Boot-based e-commerce backend application that demonstrates the core concepts of Dependency Injection, 
Service Layer Architecture, and the Strategy Design Pattern. The application provides a simple order processing workflow 
where different payment methods can be selected through interchangeable service implementations.

---

## 🚀 Features

- Order processing functionality
- Multiple payment gateway implementations
- Stripe payment service
- PayPal payment service
- Dependency Injection using Spring Boot
- Constructor-based dependency injection
- REST API support
- Modular and maintainable architecture

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Web
- Maven
- REST APIs
- Dependency Injection
- Strategy Design Pattern

---

## 📂 Project Structure

```text
rac_store
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.rachitaspringboot.rac_store
│   │   │       ├── controller
│   │   │       │   └── HomeController.java
│   │   │       ├── service
│   │   │       │   ├── PaymentService.java
│   │   │       │   ├── StripePaymentService.java
│   │   │       │   ├── PaypalPaymentService.java
│   │   │       │   └── OrderService.java
│   │   │       └── RacStoreApplication.java
│   │   └── resources
│   └── test
├── pom.xml
└── README.md
```

---

## 🏗️ Architecture

The application follows a layered architecture to separate responsibilities and improve maintainability.

- **Controller Layer** – Handles incoming HTTP requests.
- **Service Layer** – Contains the business logic for order processing.
- **Payment Layer** – Provides multiple payment implementations using a common interface.

Spring Boot manages the dependencies automatically through Dependency Injection, allowing payment services to be swapped 
without modifying the business logic.

---

## ⚙️ How It Works

1. A client sends a request to place an order.
2. The request is received by the controller.
3. The controller forwards the request to the `OrderService`.
4. `OrderService` delegates payment processing to a `PaymentService`.
5. Spring injects the required payment implementation (Stripe or PayPal).
6. The payment is processed and the response is returned.

---

## ▶️ Getting Started

### Clone the repository

```bash
git clone https://github.com/your-username/rac_store.git
```

### Navigate to the project

```bash
cd rac_store
```

### Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the `RacStoreApplication.java` file directly from your IDE.

---

## 📖 Concepts Demonstrated

- Spring Boot Fundamentals
- RESTful Web Services
- Dependency Injection
- Constructor Injection
- Service Layer Architecture
- Interface-Based Programming
- Strategy Design Pattern
- Maven Build Management

---

## 🔮 Future Enhancements

- Product management APIs
- Shopping cart functionality
- Customer authentication
- MySQL database integration
- Spring Data JPA
- Spring Security
- JWT Authentication
- Payment gateway API integration
- Order history and invoice generation

---

## 👩‍💻 Author

**Rachita Rudraganti**

B.Tech Computer Science Engineering Student

Passionate about Java, Spring Boot, Full Stack Development, and building scalable backend applications.
