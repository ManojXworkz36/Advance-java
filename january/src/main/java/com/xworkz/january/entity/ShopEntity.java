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
@Table(name = "shop")
public class ShopEntity {
    @Id
    @Column(name = "s_id")
    private  int id;
    @Column(name = "s_name")

    private String name;
    @Column(name = "s_type")
    private  String type;
    @Column(name = "s_adress")
    private String address;
    @Column(name = "s_state")
    private String state;
}
