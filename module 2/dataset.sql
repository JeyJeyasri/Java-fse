INSERT INTO Users (user_id, full_name, email, city, registration_date) VALUES
(6, 'Fiona Grace', 'fiona@example.com', 'San Francisco', '2025-01-10'),
(7, 'George Adams', 'george@example.com', 'Seattle', '2025-01-20'),
(8, 'Hannah Brooks', 'hannah@example.com', 'Austin', '2025-02-10'),
(9, 'Ian Carter', 'ian@example.com', 'San Francisco', '2025-03-05'),
(10, 'Jasmine Diaz', 'jasmine@example.com', 'Seattle', '2025-03-15');

INSERT INTO Events (event_id, title, description, city, start_date, end_date, status, organizer_id) VALUES
(4, 'Cloud Computing Summit', 'Explore the future of cloud tech.', 'San Francisco', '2025-08-12 09:00:00', '2025-08-12 17:00:00', 'upcoming', 6),
(5, 'Cybersecurity Essentials', 'Workshop on securing digital assets.', 'Seattle', '2025-05-05 10:00:00', '2025-05-05 15:00:00', 'completed', 7),
(6, 'Mobile App Dev Camp', 'Learn to build Android & iOS apps.', 'Austin', '2025-09-10 10:00:00', '2025-09-12 16:00:00', 'upcoming', 8);

INSERT INTO Sessions (session_id, event_id, title, speaker_name, start_time, end_time) VALUES
(5, 4, 'Cloud Trends 2025', 'Fiona Grace', '2025-08-12 09:15:00', '2025-08-12 10:30:00'),
(6, 4, 'Kubernetes Deep Dive', 'Ian Carter', '2025-08-12 11:00:00', '2025-08-12 12:30:00'),
(7, 5, 'Protecting User Data', 'George Adams', '2025-05-05 10:00:00', '2025-05-05 11:30:00'),
(8, 6, 'Intro to Flutter', 'Hannah Brooks', '2025-09-10 10:00:00', '2025-09-10 12:00:00');

INSERT INTO Registrations (registration_id, user_id, event_id, registration_date) VALUES
(6, 6, 4, '2025-07-20'),
(7, 7, 5, '2025-04-25'),
(8, 8, 6, '2025-08-15'),
(9, 9, 4, '2025-07-30'),
(10, 10, 5, '2025-04-27');

INSERT INTO Feedback (feedback_id, user_id, event_id, rating, comments, feedback_date) VALUES
(4, 7, 5, 5, 'Very helpful session!', '2025-05-06'),
(5, 10, 5, 4, 'Good content and presentation.', '2025-05-06'),
(6, 6, 4, 5, 'Looking forward to more!', '2025-08-13');

INSERT INTO Resources (resource_id, event_id, resource_type, resource_url, uploaded_at) VALUES
(4, 5, 'pdf', 'https://portal.com/resources/cybersecurity_guide.pdf', '2025-04-28 11:00:00'),
(5, 5, 'video', 'https://portal.com/resources/user_data_talk.mp4', '2025-04-30 14:30:00'),
(6, 6, 'link', 'https://portal.com/resources/flutter_course', '2025-08-25 13:00:00');
