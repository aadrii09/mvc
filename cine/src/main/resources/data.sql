-- Insert shopping malls (CentroComercial)
INSERT INTO centrosComerciales (nombre, localidad, estado) VALUES 
('Gran Vía Center', 'Madrid', TRUE),
('Plaza Mayor', 'Málaga', TRUE),
('Bonaire', 'Valencia', TRUE),
('La Maquinista', 'Barcelona', TRUE),
('Nervión Plaza', 'Sevilla', TRUE);

-- Insert cinemas (Cine)
INSERT INTO cines (nombre, aforo, id_centroComercial) VALUES 
('Cinesa', 300, 1),
('Yelmo Cines', 250, 2),
('MK2', 200, 3),
('Cinépolis', 350, 4),
('Ocine', 280, 5);

-- Insert movies (Pelicula)
INSERT INTO peliculas (titulo, genero, director, duracion) VALUES
('Dune: Part Two', 'Sci-Fi', 'Denis Villeneuve', 166),
('Oppenheimer', 'Drama', 'Christopher Nolan', 180),
('Barbie', 'Comedy', 'Greta Gerwig', 114),
('The Batman', 'Action', 'Matt Reeves', 176),
('Everything Everywhere All at Once', 'Sci-Fi', 'Daniels', 139),
('Poor Things', 'Drama', 'Yorgos Lanthimos', 141),
('Inside Out 2', 'Animation', 'Kelsey Mann', 107),
('Mission: Impossible – Dead Reckoning', 'Action', 'Christopher McQuarrie', 163);

-- Insert screenings (Funcion)
INSERT INTO funciones (id_cine, id_pelicula, fecha) VALUES
(1, 1, '2025-03-20'),
(1, 2, '2025-03-20'),
(1, 3, '2025-03-21'),
(2, 1, '2025-03-22'),
(2, 4, '2025-03-20'),
(3, 5, '2025-03-21'),
(3, 6, '2025-03-22'),
(4, 7, '2025-03-20'),
(4, 8, '2025-03-21'),
(5, 2, '2025-03-22'),
(5, 3, '2025-03-20'),
(1, 4, '2025-03-25'),
(2, 5, '2025-03-25'),
(3, 6, '2025-03-26'),
(4, 1, '2025-03-26');