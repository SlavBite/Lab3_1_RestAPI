package com.example.SpringBootTest.repository;

import com.example.SpringBootTest.models.Stylist;
import org.springframework.data.repository.CrudRepository;

public interface StylistsRepository extends CrudRepository<Stylist, Integer> {
}
