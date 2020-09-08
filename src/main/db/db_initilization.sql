create table user
(
    user_id int PRIMARY KEY NOT NULL,
    name    varchar(45),
    surname varchar(45)
);

create table account
(
    account_id int PRIMARY KEY NOT NULL,
    account    int NOT NULL,
    user_id    int NOT NULL
);

ALTER TABLE account
    ADD CONSTRAINT FK_user_id FOREIGN KEY
        (user_id) REFERENCES user (user_id);