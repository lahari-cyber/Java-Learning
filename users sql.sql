CREATE TABLE users(
id INT,
username VARCHAR(100) UNIQUE,
email VARCHAR(100) UNIQUE
);
select * from users;
Insert users (id,username,email)  values(1,"Lahari","lahari@gmail.com"),
(2,"hi",NULL);