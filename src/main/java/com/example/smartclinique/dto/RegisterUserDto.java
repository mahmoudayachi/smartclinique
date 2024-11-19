package com.example.smartclinique.dto;

import com.example.smartclinique.entities.User;
import com.example.smartclinique.enums.Role;
import lombok.Getter;

public class RegisterUserDto {


    private String email;
    private String prenom;
    private  String  nom;
    private String password;
    private Role role;
    public String getEmail() {
        return email;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPassword() {
        return password;
    }
    public Role getRole() {
        return role;
    }


    public RegisterUserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public RegisterUserDto  setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public RegisterUserDto setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public RegisterUserDto setPassword(String password) {
        this.password = password;
        return this;
    }
    public RegisterUserDto setRole(Role role) {
        this.role = role;
        return this;
    }
}
