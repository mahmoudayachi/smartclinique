package com.example.smartclinique.entities;


import com.example.smartclinique.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Blob;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Table(name="user")
@Entity
public class User implements UserDetails {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private  String  nom;

    @Column(nullable = false)
    private String prenom;

    @Column(nullable = false,unique = true)
    private  String email;

    @Column(nullable = false)
    private String password;


    @CreationTimestamp
    @Column(updatable = false,name="created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @Enumerated(EnumType.STRING)
    private Role role;

    private Blob image ;

    private byte[] cv ;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Blob getImage() {
        return image;
    }

    public byte[] getCv() {
        return cv;
    }

    public Role getRole() {
        return role;
    }

    public User setNom(String nom) {
        this.nom = nom;
        return  this;
    }

    public User setPrenom(String prenom) {
        this.prenom = prenom;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public User setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public User setRole(Role role) {
        this.role = role;
        return this;
    }

    public User setImage(Blob image) {
        this.image = image;
       return  this;
    }

    public User setCv(byte[] cv) {
        this.cv = cv;
        return this;
    }

}