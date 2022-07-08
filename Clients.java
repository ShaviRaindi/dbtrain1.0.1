package com.example.dbTrain.domain;
import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table (name = "NG_CLIENTS"
//        ,uniqueConstraints = {
//                @UniqueConstraint(name = "NG_CLIENT_ID_PK" , columnNames = "NG_CLIENT_ID")
//        }
)

public class Clients {

    @Id
//    @SequenceGenerator (name = "NG_CLIENT_ID_SEQ",
//            sequenceName = "NG_CLIENT_ID_SEQ",
//            allocationSize = 1)
//    @GeneratedValue (strategy = GenerationType.SEQUENCE,
//            generator = "NG_CLIENT_ID_SEQ")
    @Column (name = "CLIENT_ID")
    private Integer clientId;

    @Column (name = "CLIENT_NAME",
             nullable = false)
    private String clientName;

    @JsonIgnore
    @OneToMany (mappedBy = "client")
    private List<Accounts> accounts = new ArrayList<>() {
    };

    @JsonIgnore
    @OneToMany (mappedBy = "client")
    private List<Contacts> contacts = new ArrayList<>();

    @JsonIgnore
    @OneToMany (mappedBy = "client")
    private List<Documents> documents = new ArrayList<>();

}