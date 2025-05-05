package com.daas.dto.request;

public record BookingRequest(
        String userId,
        String showId,
        Integer seatCount
) {}
