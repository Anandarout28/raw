package com.ananda.raw.dto;



import jakarta.validation.constraints.*;


public class RegisterRequest {
    public String getEmail() {
        return email;
    }


    public  String getPassword() {
        return password;
    }


    @NotBlank
    private String username;

    public void setUsername( String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegisterRequest() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }



    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min=12)
    private  String password ;
}
