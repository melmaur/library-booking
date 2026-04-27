package service;

import model.Booking;
import org.springframework.stereotype.Service;
import repository.BookingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    // Constructor injection
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get booking by ID
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    // Get bookings by book title
    public List<Booking> getBookingsByTitle(String bookTitle) {
        return bookingRepository.findByBookTitle(bookTitle);
    }

    // Get all active bookings
    public List<Booking> getActiveBookings() {
        return bookingRepository.findByActiveTrue();
    }

    // Create new booking
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    // Cancel booking sets active = false therefore book stays in the database
    public Booking cancelBooking(Long id) {
        Booking booking = bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setActive(false);
        return bookingRepository.save(booking);
    }

    // Delete booking removes booking completely from the database
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}