package com.scm.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Entity(name="user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userId;
    @Column(name = "user_name" , nullable = false)
    private String name;
    @Column(unique = true , nullable=false)
    private String email;
    private String password;
    @Column(length = 10000) 
    private String about;
    @Column(length = 100000)
    private String profilePic;
    private String phoneNumber;

    private boolean enabled = false;
    private boolean emailVarified = false;
    private boolean phoneVarified = false;

    //Sign up self , google , github , facebook
    private Providers provider = Providers.SELF;
    private String providerUserID;

    // add more feilds if needed
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL , fetch = FetchType.LAZY , orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

    
}
