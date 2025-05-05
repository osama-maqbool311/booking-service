package com.daas.controller;

import com.daas.dto.request.BookingRequest;
import com.daas.entity.Booking;
import com.daas.service.BookingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/booking")
public class BookingController {

    @Inject
    BookingService bookingService;

    @POST
    public Response bookSeats(BookingRequest req) {
        Booking booking = bookingService.createBooking(req);
        return Response.status(Response.Status.CREATED)
                .entity(booking)
                .build();
    }
}
