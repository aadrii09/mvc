INSERT INTO libros (titulo, autor, fecha_publicacion, genero) VALUES
('1984', 'George Orwell', '1949-06-08', 'FICCIÓN'),
('Cien años de soledad', 'Gabriel García Márquez', '1967-05-30', 'FICCIÓN'),
('El código Da Vinci', 'Dan Brown', '2003-03-18', 'MISTERIO'),
('Dune', 'Frank Herbert', '1965-08-01', 'CIENCIA_FICCIÓN'),
('El señor de los anillos', 'J.R.R. Tolkien', '1954-07-29', 'FANTASÍA'),
('Sapiens', 'Yuval Noah Harari', '2011-09-04', 'HISTORIA'),
('Los pilares de la Tierra', 'Ken Follett', '1989-10-12', 'FICCIÓN'),
('Crimen y castigo', 'Fiódor Dostoievski', '1866-01-12', 'MISTERIO'),
('La Odisea', 'Homero', '0800-05-01', 'HISTORIA'),
('Fundación', 'Isaac Asimov', '1951-06-01', 'CIENCIA_FICCIÓN');

INSERT INTO usuarios (nombre, correo, fecha_registro) VALUES
('Juan Pérez', 'juanperez@email.com', '2023-05-10'),
('María López', 'marialopez@email.com', '2023-06-15'),
('Carlos García', 'carlosgarcia@email.com', '2023-07-20'),
('Ana Fernández', 'anafernandez@email.com', '2023-08-25'),
('Pedro Martínez', 'pedromartinez@email.com', '2023-09-12'),
('Laura Sánchez', 'laurasanchez@email.com', '2023-10-05'),
('Miguel Torres', 'migueltorres@email.com', '2023-11-18'),
('Elena Ramírez', 'elenaramirez@email.com', '2023-12-01');

INSERT INTO prestamos (usuario_id, libro_id, fecha_prestamo, fecha_devolucion, estado) VALUES
(1, 2, '2024-03-01', NULL, 'ACTIVO'),
(2, 3, '2024-03-05', NULL, 'ACTIVO'),
(3, 1, '2024-02-28', '2024-03-10', 'DEVUELTO'),
(4, 4, '2024-03-10', NULL, 'ACTIVO'),
(1, 5, '2024-02-20', '2024-02-28', 'DEVUELTO'),
(5, 6, '2024-03-02', NULL, 'ACTIVO'),
(6, 7, '2024-03-03', NULL, 'ACTIVO'),
(7, 8, '2024-02-15', '2024-03-05', 'DEVUELTO'),
(8, 9, '2024-02-22', '2024-02-28', 'DEVUELTO'),
(2, 10, '2024-03-07', NULL, 'ACTIVO');