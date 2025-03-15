INSERT INTO jugadores (nombre, nivel, rango) VALUES
('MonkeyMoon', 2000, 'SSL'),
('JKnaps', 1950, 'SSL'),
('CaioTG1', 1800, 'GRAN_CAMPEON'),
('Express', 1750, 'CAMPEON'),
('Chronic', 1900, 'SSL'),
('Extra', 1850, 'GRAN_CAMPEON'),
('Atomic', 1880, 'SSL'),
('Yanxnz', 1790, 'GRAN_CAMPEON'),
('Fever', 1720, 'DIAMANTE'),
('Noly', 1890, 'SSL');

INSERT INTO torneos (nombre, fechaInicio, premioTotal) VALUES
('RLCS Fall Major', '2024-04-10', 250000.00),
('RLCS Winter Major', '2024-06-15', 350000.00),
('RLCS Spring Major', '2024-08-20', 300000.00),
('RLCS World Championship', '2024-10-30', 500000.00);

INSERT INTO participaciones (jugadorId, torneoId, posicionFinal) VALUES
(1, 1, 2),
(2, 1, 4),
(3, 1, 6),
(4, 1, 8),
(5, 1, 10),
(1, 2, 1),
(2, 2, 3),
(3, 2, 5),
(4, 2, 7),
(5, 2, 9);