package com.example.dbTrain.repository;

import com.example.dbTrain.domain.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository <Clients, Integer> {

//    @Query(value = "FROM Clients ")
//    List<Clients> getClients();
}
