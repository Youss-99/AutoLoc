package yous.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yous.autolocapi.domain.Contrat;
import yous.autolocapi.repository.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IcontratService {

    final ContratRepository CR;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) CR.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return CR.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return CR.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {
        return CR.findById(idContrat).orElse(null);
    }

    @Override
    public void removeContrat(Long idContrat) {
        CR.deleteById(idContrat);
    }

    @Override
    public List<Contrat> addContrats(List<Contrat> contrats) {
        return (List<Contrat>) CR.saveAll(contrats);
    }
}
