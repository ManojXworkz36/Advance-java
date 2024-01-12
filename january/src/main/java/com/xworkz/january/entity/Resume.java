package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@Table(name="resume")
public class Resume {
    @Id
    @Column(name = "r_id")
     private int id;
    @Column(name = "r_name")
     private String name;
    @Column(name = "r_email")
     private  String email;
    @Column(name = "r_skill")

     private String skill;
    @Column(name = "r_hobbies")
     private String hobbies;
    @Column(name = "r_dob")
     private String dob;


}
