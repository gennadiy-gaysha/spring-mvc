package com.springboot.thymeleaf.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
}
