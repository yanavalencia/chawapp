package com.yana.ChawApp.Model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"username"}),
    @UniqueConstraint(columnNames = {"email"})
})
public class UserAuth {

    private @Id
    @GeneratedValue Long id;
    String username;
    String email;
    String password;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
       joinColumns =@JoinColumn(name ="user_Id",referencedColumnName = "id"),
       inverseJoinColumns =@JoinColumn(name = "role_Id",referencedColumnName ="id"))
 private Set<Role> roles;

 UserAuth(){}

public UserAuth(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
}

public Long getId() {
    return id;
}

public String getUsername() {
    return username;
}

public String getEmail() {
    return email;
}

public String getPassword() {
    return password;
}

public Set<Role> getRoles() {
    return roles;
}

public void setRoles(Set<Role> roles) {
    this.roles = roles;
}




}
