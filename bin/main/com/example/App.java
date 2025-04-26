package com.example;
import static spark.Spark.get;
import static spark.Spark.port;

public class App {

    private static final String MESSAGE = "Testing 123";

    public App() {}

    public static void main(String[] args) {
        port(8081);  // Ensures the app is listening on port 8081
        get("/", (req, res) -> MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}