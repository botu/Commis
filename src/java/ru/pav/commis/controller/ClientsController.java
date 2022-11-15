package ru.pav.commis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.pav.commis.model.Clients;
import ru.pav.commis.service.ClientService;

@RestController
public class ClientsController {

    @Autowired
    ClientService clientService;

    @PostMapping("/postClient")
    public String getClients(@RequestBody Clients clients)
    {
        try {
            clientService.postClient(clients);
            return "Success";
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }

}
