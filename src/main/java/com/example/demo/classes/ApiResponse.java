package com.example.demo.classes;
public class ApiResponse {
    private boolean success;
    private String message;

    //apenas para indicar se a operação foi bem-sucedida ou não
    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // Getters e Setters
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}

