INSERT INTO ordenadores (marca, fechaSalida, procesador) VALUES 
('Dell', '2020-05-15', 'INTEL'),
('HP', '2019-11-20', 'AMD'),
('Lenovo', '2021-03-10', 'INTEL'),
('Asus', '2022-07-25', 'AMD'),
('Acer', '2018-09-30', 'INTEL'),
('Apple', '2023-01-12', 'INTEL'),
('MSI', '2020-06-05', 'AMD'),
('Samsung', '2017-12-18', 'INTEL'),
('Toshiba', '2019-04-22', 'AMD'),
('Sony', '2021-08-08', 'INTEL');
-- Insertar datos en la tabla 'alumnos'
INSERT INTO alumnos (nombre, apellido, fechaCumpl, curso, ordenador_id) VALUES
('Juan', 'Pérez', '2005-03-15', 'PRIMERO', 1),
('María', 'Gómez', '2004-07-22', 'SEGUNDO', 2),
('Carlos', 'López', '2003-11-30', 'TERCERO', 3),
('Ana', 'Martínez', '2005-01-10', 'PRIMERO', 4),
('Luis', 'Rodríguez', '2004-05-20', 'SEGUNDO', 5),
('Sofía', 'Fernández', '2003-09-05', 'CUARTO', 6),
('Pedro', 'Sánchez', '2005-02-28', 'PRIMERO', 7),
('Laura', 'Díaz', '2004-08-12', 'SEGUNDO', 8),
('Javier', 'Hernández', '2003-12-25', 'TERCERO', 9),
('Marta', 'Ruiz', '2005-04-18', 'PRIMERO', 10);
-- Insertar datos en la tabla 'asignaturas'
INSERT INTO asignaturas (nombre, creditos, horas, tipo) VALUES
('Matemáticas', 6, 120, 'OBLIGATORIA'),
('Lengua Española', 4, 80, 'OBLIGATORIA'),
('Historia', 4, 80, 'OBLIGATORIA'),
('Biología', 5, 100, 'OBLIGATORIA'),
('Física', 6, 120, 'OBLIGATORIA'),
('Química', 5, 100, 'OBLIGATORIA'),
('Inglés', 3, 60, 'OBLIGATORIA'),
('Educación Física', 2, 40, 'OPCIONAL'),
('Música', 2, 40, 'OPCIONAL'),
('Arte', 2, 40, 'OPCIONAL');
-- Insertar datos en la tabla 'alumnoasignatura'
INSERT INTO alumnoasignatura (alumno_id, asignatura_id, fechaExamen, nota) VALUES
(1, 1, '2023-10-15', 8.5),  -- Juan Pérez en Matemáticas
(1, 2, '2023-10-16', 7.0),  -- Juan Pérez en Lengua Española
(2, 3, '2023-10-17', 9.0),  -- María Gómez en Historia
(2, 4, '2023-10-18', 8.0),  -- María Gómez en Biología
(3, 5, '2023-10-19', 7.5),  -- Carlos López en Física
(3, 6, '2023-10-20', 6.5),  -- Carlos López en Química
(4, 7, '2023-10-21', 9.5),  -- Ana Martínez en Inglés
(4, 8, '2023-10-22', 8.0),  -- Ana Martínez en Educación Física
(5, 9, '2023-10-23', 7.0),  -- Luis Rodríguez en Música
(5, 10, '2023-10-24', 6.0); -- Luis Rodríguez en Arte