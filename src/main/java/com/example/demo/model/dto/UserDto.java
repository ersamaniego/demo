package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // para buildear objetos inline
public class UserDto {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Data
    static class Address {
        String street;
        String suite;
        String city;
        String zipcode;
        Geo geo;
    }
    @Data
    static class Geo{
        String lat;
        String lng;
    }
    @Data
    static class Company{
        String name;
        String catchPhrase;
        String bs;
    }
}
