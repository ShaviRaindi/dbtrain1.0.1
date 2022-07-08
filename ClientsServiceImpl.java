package com.example.dbTrain.service;

import com.example.dbTrain.domain.Clients;
import com.example.dbTrain.repository.ClientsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientsServiceImpl implements ClinetsService{

    private final ClientsRepository clientsRepository;
    @Override
    public List<Clients> getClients() {
        return clientsRepository.findAll();
    }
}
