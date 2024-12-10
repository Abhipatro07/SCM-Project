package com.scm.Entities;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String picture;
    @Column(length = 10000)
    private String description;
    private boolean favorite = false;
    private String websiteLink;
    private String linkedinLink;
    
    //private List<String> SocialLinks = new ArrayList<>();
    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "contact" , cascade = CascadeType.ALL , fetch = FetchType.EAGER , orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();


}
