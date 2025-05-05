package com.daas.entity;

import jakarta.persistence.*;
        import java.io.Serializable;

@Entity
@Table(name = "booking_seats")
public class BookingSeats implements Serializable {

    @EmbeddedId
    private BookingSeatId id;

    @ManyToOne
    @MapsId("bookingId")
    @JoinColumn(name = "booking_id", referencedColumnName = "id")
    private Booking booking;

    @ManyToOne
    @MapsId("seatId")
    @JoinColumn(name = "seat_id", referencedColumnName = "id")
    private Seat seat;

    // Getters and setters

    public BookingSeatId getId() {
        return id;
    }

    public void setId(BookingSeatId id) {
        this.id = id;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }
}