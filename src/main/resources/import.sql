INSERT INTO show (title, location, start_time, end_time)
VALUES
('Avengers: Endgame', 'Cinema Hall 1', '2024-06-01 18:00:00', '2024-06-01 21:00:00'),
('Interstellar', 'Cinema Hall 2', '2024-06-02 20:00:00', '2024-06-02 23:00:00');


INSERT INTO seats (seat_number, show_id, booked)
VALUES
('A1', 1, false),
('A2', 1, false),
('B1', 2, false);


INSERT INTO bookings (email, mobile, show_id, seat_count, status, booking_time)
VALUES
('john@example.com', '1234567890', 1, 2, 'CONFIRMED', '2024-06-01 17:00:00');


INSERT INTO booking_seats (booking_id, seat_id)
VALUES
(1, 1),
(1, 2);
