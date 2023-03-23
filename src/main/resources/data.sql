INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4001, 'hridaya@g.com', 'Hridaya', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4002, 'shyam@g.com', 'Shyam', 'kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4003, 'hari@g.com', 'Hari', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4004, 'gita@g.com', 'Gita', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');

INSERT INTO role(id, role) VALUES(6001, 'ADMIN');
INSERT INTO role(id, role) VALUES(6002, 'USER');
INSERT INTO role(id, role) VALUES(6003, 'CHECKER');

INSERT INTO users_roles(user_id, roles_id) VALUES(4001, 6001);
INSERT INTO users_roles(user_id, roles_id) VALUES(4002, 6002);
INSERT INTO users_roles(user_id, roles_id) VALUES(4003, 6003);
INSERT INTO users_roles(user_id, roles_id) VALUES(4004, 6001);