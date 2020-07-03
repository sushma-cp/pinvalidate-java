FROM openjdk:8
WORKDIR /app
COPY PinValidation.java .
RUN javac src/main/PinValidation.java
EXPOSE 80
CMD ["java", "PinValidation"]

