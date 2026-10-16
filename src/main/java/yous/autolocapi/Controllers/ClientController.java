package yous.autolocapi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import yous.autolocapi.domain.Client;
import yous.autolocapi.service.IclientService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Client")
public class ClientController {
    final IclientService I_client;

    @PostMapping("/AddClient")
    public Client AddClient(@RequestBody Client c){
        return I_client.addClient(c);
    }

    @GetMapping("/DisplayClient")
    public List<Client> DisplayClient(){
        return I_client.retrieveAllClients();
    }

    @DeleteMapping("/DeleteClient/{id}")
    public void DeleteClient(@PathVariable Long id){
        I_client.removeClient(id);
    }

    @PostMapping("/AddClients")
    public List<Client> AddClients(@RequestBody List<Client> clientList){
        return I_client.addClients(clientList);
    }

}
