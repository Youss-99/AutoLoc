package yous.autolocapi.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import yous.autolocapi.domain.Vehicule;
import yous.autolocapi.domain.Vehicule;
import yous.autolocapi.service.IclientService;
import yous.autolocapi.service.IvehiculeService;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {
    final IvehiculeService I_v;

    @PostMapping("/AddVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v){
        return I_v.addVehicule(v);
    }

    @GetMapping("/DisplayVehicule")
    public List<Vehicule> DisplayVehicule(){
        return I_v.retrieveAllVehicules();
    }

    @DeleteMapping("/DeleteVehicule/{id}")
    public void DeleteVehicule(@PathVariable Long id){
        I_v.removeVehicule(id);
    }

    @PostMapping("/AddVehicules")
    public List<Vehicule> AddVehicules(@RequestBody List<Vehicule> clientList){
        return I_v.addVehicules(clientList);
    }
}
