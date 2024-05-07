package com.example.SpringBootTest.repository;

import com.example.SpringBootTest.models.Client;
import org.springframework.data.repository.CrudRepository;
public interface ClientsRepository extends CrudRepository<Client, Integer> {
}
