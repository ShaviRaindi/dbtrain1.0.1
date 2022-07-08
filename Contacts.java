package com.example.dbTrain.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "NG_CONTACTS")
public class Contacts {

    @Id
    @Column (name = "PHONE_NUMBER",
             nullable = false)
    private Integer phoneNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "CLIENT_ID")
    private Clients client;
}