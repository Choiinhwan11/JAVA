package com.jstl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class PersonDTO {
  //  @NonNull
    private String name;
    //@NonNull
    private int age;
    public PersonDTO(String name, int age) {}
}
