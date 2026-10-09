package yous.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yous.autolocapi.domain.Maintenance;
import yous.autolocapi.repository.MaintenanceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements ImaintenanceService {

    final MaintenanceRepository MR;

    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) MR.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return MR.save(m);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance m) {
        return MR.save(m);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {
        return MR.findById(idMaintenance).orElse(null);
    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        MR.deleteById(idMaintenance);
    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> maintenances) {
        return (List<Maintenance>) MR.saveAll(maintenances);
    }
}
