package com.example.dbTrain.controller;

import com.example.dbTrain.domain.Clients;
import com.example.dbTrain.service.ClinetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClinetsService clinetsService;

    @GetMapping
    public ResponseEntity<List<Clients>> getClients (){
        List<Clients> result = clinetsService.getClients();
        return ResponseEntity.ok(result);
    }

}
