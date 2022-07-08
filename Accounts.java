package com.example.dbTrain.domain;

import lombok.Data;

import javax.persistence.*;

@Table (name = "NG_ACCOUNTS"
//        ,uniqueConstraints = {
//                @UniqueConstraint(name = "NG_ACCOUNT_NAME_PK" , columnNames = "NG_ACCOUNT_NAME")
//        }
)
@Entity
@Data
public class Accounts {

    @Id
    @Column (name = "ACCOUNT_NAME",
            nullable = false)
    private String accountName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "CLIENT_ID")
    private Clients client;
}