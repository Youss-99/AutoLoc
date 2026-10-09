package yous.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yous.autolocapi.domain.Paiement;
import yous.autolocapi.repository.PaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IpaiementService {

    final PaiementRepository PR;

    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) PR.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement p) {
        return PR.save(p);
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return PR.save(p);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {
        return PR.findById(idPaiement).orElse(null);
    }

    @Override
    public void removePaiement(Long idPaiement) {
        PR.deleteById(idPaiement);
    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> paiements) {
        return (List<Paiement>) PR.saveAll(paiements);
    }
}
