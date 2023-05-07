INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4001, 'hridaya@gmail.com', 'Hridaya', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4002, 'shyam@gmail.com', 'Shyam', 'kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4003, 'hari@gmail.com', 'Hari', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4004, 'gita@gmail.com', 'Gita', 'Kandel', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4005, 'shyam@gmail.com', 'shyam', 'shyam', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');
INSERT INTO users(id, email, first_name, last_name, password)
VALUES(4006, 'checker@gmail.com', 'shyam', 'shyam', '$2a$10$sLZONS6iMQnnyvY3e5Y5nOYKgwdTGJRhT9e8nk7SJGnLehjjrw3BC');

INSERT INTO role(id, role) VALUES(6001, 'ADMIN');
INSERT INTO role(id, role) VALUES(6002, 'USER');
INSERT INTO role(id, role) VALUES(6003, 'STAFF');
INSERT INTO role(id, role) VALUES(6004, 'STUDENT');
INSERT INTO role(id, role) VALUES(6005, 'FACULTY');
INSERT INTO role(id, role) VALUES(6006, 'CHECKER');

INSERT INTO users_roles(user_id, roles_id) VALUES(4001, 6001);
INSERT INTO users_roles(user_id, roles_id) VALUES(4002, 6002);
INSERT INTO users_roles(user_id, roles_id) VALUES(4003, 6003);
INSERT INTO users_roles(user_id, roles_id) VALUES(4004, 6004);
INSERT INTO users_roles(user_id, roles_id) VALUES(4005, 6004);
INSERT INTO users_roles(user_id, roles_id) VALUES(4006, 6006);