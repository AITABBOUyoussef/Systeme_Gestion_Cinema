DROP DATABASE IF EXISTS cinema;
CREATE DATABASE cinema ;
USE cinema;

CREATE TABLE film (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titre VARCHAR(50),
    duree INT,
    categorie VARCHAR(80)
);

CREATE TABLE spectateur (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE seance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    film_id INT,
    date DATE,
    heure TIME,
    salle VARCHAR(20),
    capacite_max INT,
    FOREIGN KEY (film_id) REFERENCES film(id)
);

CREATE TABLE ticket (
    id INT PRIMARY KEY AUTO_INCREMENT,
    spectateur_id INT,
    seance_id INT,
    prix DECIMAL(6,2),
    FOREIGN KEY (spectateur_id) REFERENCES spectateur(id),
    FOREIGN KEY (seance_id) REFERENCES seance(id)
);

INSERT INTO film(titre, duree, categorie) VALUES
('Avengers: Endgame', 181, 'Action' ),
('Inception', 148, 'Science Fiction'),
('La La Land', 128, 'Musical'),
('The Godfather', 175, 'Crime'),
('Parasite', 132, 'Thriller');


INSERT INTO spectateur(nom, email) VALUES
('Youssef Aitabbou', 'youssef@example.com'),
('Sara Benali', 'sara@example.com'),
('Hamid El Amrani', 'hamid@example.com'),
('Leila Zahraoui', 'leila@example.com'),
('Omar Kadiri', 'omar@example.com');


INSERT INTO seance(film_id, date, heure, salle, capacite_max) VALUES
(1, '2025-12-01', '18:00:00', 'Salle 1', 50),
(2, '2025-12-01', '20:00:00', 'Salle 2', 40),
(3, '2025-12-02', '17:30:00', 'Salle 1', 50),
(4, '2025-12-02', '19:00:00', 'Salle 3', 30),
(5, '2025-12-03', '21:00:00', 'Salle 2', 40);


INSERT INTO ticket(spectateur_id, seance_id, prix) VALUES
(1, 1, 50.00),
(2, 1, 50.00),
(3, 2, 45.00),
(4, 3, 40.00),
(5, 4, 55.00),
(1, 5, 60.00);
