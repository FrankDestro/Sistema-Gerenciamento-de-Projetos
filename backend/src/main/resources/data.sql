INSERT INTO tb_department (name) VALUES ('RH');
INSERT INTO tb_department (name) VALUES ('Tecnologia da Informação');
INSERT INTO tb_department (name) VALUES ('Projetos');
INSERT INTO tb_department (name) VALUES ('Marketing');
INSERT INTO tb_department (name) VALUES ('Financeiro');
INSERT INTO tb_department (name) VALUES ('DBA SQL');


INSERT INTO tb_user (first_name, last_name, email, password, img_Profile, charge, id_Department, created_At, updaed_At) VALUES ('Bob', 'Green', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 'img.png', 'Gerente', 3, Now(), null);
INSERT INTO tb_user (first_name, last_name, email, password, img_Profile, charge, id_Department, created_At, updaed_At) VALUES ('Ana', 'Oliveira', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 'img.png', 'Analista', 1, Now(), null);
INSERT INTO tb_user (first_name, last_name, email, password, img_Profile, charge, id_Department, created_At, updaed_At) VALUES ('Alex', 'Juliano', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 'img.png', 'Analista', 6, Now(), null);

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_OPER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);

INSERT INTO tb_client (name, city, country, address, zip, market_Segment) VALUES ('Shell', 'São Paulo', 'Brazil', 'Av. do Estado', 47640200, 'petrolífera');
INSERT INTO tb_client (name, city, country, address, zip, market_Segment) VALUES ('Tesla', 'California', 'EUA', 'Av. Greenwitch', 906972643, 'automotiva');
INSERT INTO tb_client (name, city, country, address, zip, market_Segment) VALUES ('JKSoluctions', 'São Paulo', 'Brazil', 'Av. cinquenta e tres', 273475858, 'tecnologia');
INSERT INTO tb_client (name, city, country, address, zip, market_Segment) VALUES ('INBEACH', 'Porto Alegre', 'Brazil', 'Av. quarenta e seis', 231451569654, 'Varejo');
INSERT INTO tb_client (name, city, country, address, zip, market_Segment) VALUES ('PublicMark', 'Santiago', 'Chile', 'Rua Juan torrito', 74363817956, 'Publicidade');

INSERT INTO tb_project (name, description, initial_Date, due_Data, status, img_Url, budget, expenses, invoicing, owner, category, client_id) VALUES ('System Fuel', 'Projeto para criação de sistema de gerenciamento de postos de gasolina do client Shell, com integração de todos as lojas de são paulo', '2022-08-02', '2023-02-02', 0, 'img.png', 15000.0, 2500.0, 3500.0, 'Carlos', 'Sistema', 1);

INSERT INTO tb_task (name, description, data_Initial, due_Data, status, id_user, id_project) VALUES ('Construção Front-End', 'Construir o front-end estatico com html e css', '2022-08-22', '2022-08-29', 0,  3, 1);
INSERT INTO tb_task (name, description, data_Initial, due_Data, status, id_user, id_project) VALUES ('Construção database', 'Construir o database', '2022-08-22', '2022-08-29', 0,  3, 1);
INSERT INTO tb_task (name, description, data_Initial, due_Data, status, id_user, id_project) VALUES ('configurar variaveis do aplicatvo', 'configurar o arquivos de variaveis', '2022-08-22', '2022-08-29', 0,  3, 1);
