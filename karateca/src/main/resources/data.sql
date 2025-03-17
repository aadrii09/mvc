INSERT INTO tecnica (nombre, nacionalidad, arte_marcial) VALUES ('Karate Chop', 'Japón', 'Karate');
INSERT INTO tecnica (nombre, nacionalidad, arte_marcial) VALUES ('Muay Thai Clinch', 'Tailandia', 'Muay Thai');
INSERT INTO tecnica (nombre, nacionalidad, arte_marcial) VALUES ('Judo Throw', 'Japón', 'Judo');
INSERT INTO tecnica (nombre, nacionalidad, arte_marcial) VALUES ('Boxing Jab', 'EE.UU.', 'Boxeo');
INSERT INTO tecnica (nombre, nacionalidad, arte_marcial) VALUES ('Taekwondo Kick', 'Corea del Sur', 'Taekwondo');

INSERT INTO luchador (nombre, edad, peso, pais) VALUES ('Bruce Lee', 32, 65.0, 'Hong Kong');
INSERT INTO luchador (nombre, edad, peso, pais) VALUES ('Anderson Silva', 46, 84.0, 'Brasil');
INSERT INTO luchador (nombre, edad, peso, pais) VALUES ('Conor McGregor', 35, 77.0, 'Irlanda');
INSERT INTO luchador (nombre, edad, peso, pais) VALUES ('Khabib Nurmagomedov', 35, 70.0, 'Rusia');
INSERT INTO luchador (nombre, edad, peso, pais) VALUES ('Georges St-Pierre', 43, 77.0, 'Canadá');

INSERT INTO luchadores_tecnicas (luchador_id, tecnica_id, nivel_dominio) VALUES (1, 1, 90);
INSERT INTO luchadores_tecnicas (luchador_id, tecnica_id, nivel_dominio) VALUES (2, 2, 85);
INSERT INTO luchadores_tecnicas (luchador_id, tecnica_id, nivel_dominio) VALUES (3, 4, 88);
INSERT INTO luchadores_tecnicas (luchador_id, tecnica_id, nivel_dominio) VALUES (4, 3, 92);
INSERT INTO luchadores_tecnicas (luchador_id, tecnica_id, nivel_dominio) VALUES (5, 5, 95);