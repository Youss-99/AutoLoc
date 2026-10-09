package yous.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yous.autolocapi.domain.Agence;
import yous.autolocapi.repository.AgenceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IagenceService {

    final AgenceRepository AR;

    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) AR.findAll();
    }

    @Override
    public Agence addAgence(Agence a) {
        return AR.save(a);
    }

    @Override
    public Agence updateAgence(Agence a) {
        return AR.save(a);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {
        return AR.findById(idAgence).orElse(null);
    }

    @Override
    public void removeAgence(Long idAgence) {
        AR.deleteById(idAgence);
    }

    @Override
    public List<Agence> addAgences(List<Agence> agences) {
        return (List<Agence>) AR.saveAll(agences);
    }
}
