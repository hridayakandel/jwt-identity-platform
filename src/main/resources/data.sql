INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4001, 'ram@g.com', 'Ram', 'Gurung', 'MTIz');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4002, 'shyam@g.com', 'Shyam', 'Gurung', 'MTIz');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4003, 'hari@g.com', 'Hari', 'Gurung', 'MTIz');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4004, 'gita@g.com', 'Gita', 'Gurung', 'MTIz');

INSERT INTO role(id, role) VALUES(6001, 'ADMIN');
INSERT INTO role(id, role) VALUES(6002, 'USER');

INSERT INTO users_roles(user_id, roles_id) VALUES(4001, 6001);
INSERT INTO users_roles(user_id, roles_id) VALUES(4002, 6001);
INSERT INTO users_roles(user_id, roles_id) VALUES(4003, 6002);
INSERT INTO users_roles(user_id, roles_id) VALUES(4004, 6002);