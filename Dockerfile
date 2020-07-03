FROM openjdk:8
WORKDIR /app
COPY src src
RUN ls -lrt
RUN javac src/main/PinValidation.java
EXPOSE 80
ENTRYPOINT ["java", "src/main/PinValidation"]