package com.exito.appcompania.automation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private String lastname;
    private String id;
    private String year;
    private String month;
    private String day;
    private String cellphone;
    private String email;
    private String password;
}
