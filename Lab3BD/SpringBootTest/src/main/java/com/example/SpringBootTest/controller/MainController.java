package com.example.SpringBootTest.controller;

import com.example.SpringBootTest.models.Client;
import com.example.SpringBootTest.models.Stylist;
import com.example.SpringBootTest.repository.ClientsRepository;
import com.example.SpringBootTest.repository.StylistsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/")
public class MainController {
    @Autowired
    private StylistsRepository stylistsRepository;
    @Autowired
    private ClientsRepository clientsRepository;

    @PostMapping(path="/addStylists")
    public Stylist addNewStylist(@RequestBody Stylist stylist) {
        stylistsRepository.save(stylist);
        return stylist;
    }
    @GetMapping(path="/getStylists")
    public @ResponseBody Iterable<Stylist> getAllStylists() {
        return stylistsRepository.findAll();
    }
    @GetMapping(path="/getClients")
    public @ResponseBody Iterable<Client> getAllClients() {
        return clientsRepository.findAll();
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
}