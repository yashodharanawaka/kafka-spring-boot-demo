# kafka-spring-boot-demo

This project demonstrates how to set up a Kafka producer and consumer using Spring Boot and Docker. The application sends and receives messages from a Kafka topic, which is managed using Kafka and Zookeeper running in Docker containers.

## Prerequisites

Before you can run this project, make sure you have the following installed:

- **Java 11** or higher
- **Maven** for building the project
- **Docker** for running Kafka and Zookeeper

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-repo/kafka-spring-boot-demo.git
cd kafka-spring-boot-demo
```

### 2. Configure the Kafka Topic

The Kafka topic name is configurable in the `application.properties` file. You can modify the topic name as needed:

```properties
spring.kafka.topic.name=kafka-demo-topic
```

### 3. Set Up Docker for Kafka and Zookeeper

Make sure Docker is running, and use the provided `docker-compose.yml` file to start Kafka and Zookeeper:

```bash
docker-compose up -d
```

This will start:
- **Zookeeper** on port `2181`
- **Kafka** on port `9092`

### 4. Build the Application

Use Maven to build the Spring Boot application:

```bash
mvn clean install
```

### 5. Run the Application

After building, you can run the application using the following command:

```bash
mvn spring-boot:run
```

### 6. Send and Receive Messages

- **Producer**: The producer sends messages to the Kafka topic defined in `application.properties`.
- **Consumer**: The consumer listens to the same Kafka topic and logs any messages received.

### 7. Stopping Docker Containers

To stop the Kafka and Zookeeper containers, run:

```bash
docker-compose down
```

## Project Structure

- **src/main/java**: Contains the Java classes for the Kafka producer and consumer.
- **src/main/resources**: Contains the application configuration files.
- **docker-compose.yml**: Docker Compose file to set up Kafka and Zookeeper.

## Dependencies

This project includes the following maven dependencies:

- **Spring Boot Web**: For creating RESTful web services.
- **Spring for Apache Kafka**: To integrate Kafka with Spring Boot.
- **Lombok**: For reducing boilerplate code with annotations.