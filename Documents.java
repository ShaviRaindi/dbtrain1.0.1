package com.example.dbTrain.domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "NG_DOCUMENTS")
public class Documents {

    @Id
    @Column (name = "DOCUMENT_NAME")
    private String documentName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "CLIENT_ID")
    private Clients client;

}
