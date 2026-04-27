package repository;

import model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    // Find all bookings for a specific book title
    List<Booking> findByBookTitle(String bookTitle);

    // Find all active bookings
    List<Booking> findByActiveTrue();
}