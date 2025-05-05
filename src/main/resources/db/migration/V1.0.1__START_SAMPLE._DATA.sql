-- 1) Insert 3 shows
INSERT INTO SHOWS (id, title, location, start_time, end_time) VALUES
  (1, 'Hamilton',    'The Majestic Theatre', '2025-06-01 19:00:00', '2025-06-01 22:30:00'),
  (2, 'Wicked',      'Gershwin Theatre',    '2025-06-02 18:00:00', '2025-06-02 21:30:00'),
  (3, 'Lion King',   'Minskoff Theatre',    '2025-06-03 20:00:00', '2025-06-03 23:00:00');

-- 2) Insert 5 seats per show (seat IDs 1–15)
INSERT INTO SEATS (id, seat_number, show_id, booked) VALUES
  -- Show 1 seats
  ( 1, 'S1', 1, FALSE), ( 2, 'S2', 1, FALSE), ( 3, 'S3', 1, FALSE), ( 4, 'S4', 1, FALSE), ( 5, 'S5', 1, FALSE),
  -- Show 2 seats
  ( 6, 'S1', 2, FALSE), ( 7, 'S2', 2, FALSE), ( 8, 'S3', 2, FALSE), ( 9, 'S4', 2, FALSE), (10, 'S5', 2, FALSE),
  -- Show 3 seats
  (11, 'S1', 3, FALSE), (12, 'S2', 3, FALSE), (13, 'S3', 3, FALSE), (14, 'S4', 3, FALSE), (15, 'S5', 3, FALSE);

-- 3) Create 2 bookings
INSERT INTO BOOKINGS (id, email,           mobile,        show_id, seat_count, status,        booking_time) VALUES
  (1, 'alice@example.com', '+15550001111', 1,       2,         'CONFIRMED',  '2025-05-01 10:15:00'),
  (2, 'bob@example.com',   '+15550002222', 2,       3,         'CONFIRMED',  '2025-05-01 11:00:00');

-- 4) Assign seats to each booking
-- Booking 1 (Show 1): seats S1, S2  → seat IDs 1,2
INSERT INTO BOOKING_SEATS (booking_id, seat_id) VALUES
  (1, 1),
  (1, 2);

-- Mark those seats as booked
UPDATE SEATS SET booked = TRUE WHERE id IN (1,2);

-- Booking 2 (Show 2): seats S3, S4, S5 → seat IDs 8,9,10
INSERT INTO BOOKING_SEATS (booking_id, seat_id) VALUES
  (2, 8),
  (2, 9),
  (2, 10);

-- Mark those seats as booked
UPDATE SEATS SET booked = TRUE WHERE id IN (8,9,10);