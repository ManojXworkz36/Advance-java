package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "new_table")
@AllArgsConstructor
public class SuperHeroEntity {
@Id
@Column(name="s_id")
    private int id;
@Column(name = "s_RealName")
    private String realName;
@Column(name = "s_FictionalName")
    private  String fictionName;
@Column(name = "s_Country")
    private String country;
@Column(name = "s_Weakness")
    private  String weakness;
}
