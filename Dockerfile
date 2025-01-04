# Use the official OpenJDK image as a base
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /

# Copy the Java source file into the container
COPY factorial.java .

# Compile the Java program
RUN javac factorial.java

# Command to run the Java program
CMD ["java", "factorial"]
