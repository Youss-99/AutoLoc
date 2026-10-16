package yous.autolocapi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import yous.autolocapi.domain.Agence;
import yous.autolocapi.domain.Agence;
import yous.autolocapi.service.IclientService;
import yous.autolocapi.service.IagenceService;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Agence")
public class AgenceController {
    final IagenceService I_v;

    @PostMapping("/AddAgence")
    public Agence addAgence(@RequestBody Agence v){
        return I_v.addAgence(v);
    }

    @GetMapping("/DisplayAgence")
    public List<Agence> DisplayAgence(){
        return I_v.retrieveAllAgences();
    }

    @DeleteMapping("/DeleteAgence/{id}")
    public void DeleteAgence(@PathVariable Long id){
        I_v.removeAgence(id);
    }

    @PostMapping("/AddAgences")
    public List<Agence> AddAgences(@RequestBody List<Agence> agencylist){
        return I_v.addAgences(agencylist);
    }
}
