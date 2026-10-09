package yous.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yous.autolocapi.domain.Reservation;
import yous.autolocapi.repository.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IreservationService {

    final ReservationRepository RR;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) RR.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return RR.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return RR.save(r);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {
        return RR.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(Long idReservation) {
        RR.deleteById(idReservation);
    }

    @Override
    public List<Reservation> addReservations(List<Reservation> reservations) {
        return (List<Reservation>) RR.saveAll(reservations);
    }
}
