package com.daas.dto.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowCreateRequest {
    private String title;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int numberOfSeats;
}
