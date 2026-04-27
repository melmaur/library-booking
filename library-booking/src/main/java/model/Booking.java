package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookTitle;
    private String borrowerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    // Empty constructor required by JPA
    public Booking() {}

    // Constructor
    public Booking(String bookTitle, String borrowerName,
                   LocalDate startDate, LocalDate endDate) {
        this.bookTitle = bookTitle;
        this.borrowerName = borrowerName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = true;
    }

    // Getters
    public Long getId()              { return id; }
    public String getBookTitle()     { return bookTitle; }
    public String getBorrowerName()  { return borrowerName; }
    public LocalDate getStartDate()  { return startDate; }
    public LocalDate getEndDate()    { return endDate; }
    public boolean isActive()        { return active; }

    // Setters
    public void setBookTitle(String bookTitle)        { this.bookTitle = bookTitle; }
    public void setBorrowerName(String borrowerName)  { this.borrowerName = borrowerName; }
    public void setStartDate(LocalDate startDate)     { this.startDate = startDate; }
    public void setEndDate(LocalDate endDate)         { this.endDate = endDate; }
    public void setActive(boolean active)             { this.active = active; }
}