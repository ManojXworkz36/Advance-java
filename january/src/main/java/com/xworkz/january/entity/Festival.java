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
@Table(name = "festival")
public class Festival {
@Id
@Column(name = "f_id")
    private int id;
@Column(name = "f_name")
    private  String name;
@Column(name = "f_month")
    private String month;
@Column(name = "f_state")
    private String state;
@Column(name = "f_type")
    private  String type;
}
