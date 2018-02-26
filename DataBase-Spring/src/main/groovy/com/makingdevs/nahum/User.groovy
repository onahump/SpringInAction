package com.makingdevs.nahum

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity // This tells Hibernate to make a table out of this class
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id

    private String name

    private String email

}