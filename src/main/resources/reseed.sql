drop table  if exists eahomework1.authorities;
drop table if exists eahomework1.users;
create table eahomework1.users(
    username varchar(50) not null primary key,
    password varchar(50) not null,
    enabled boolean not null
);

create table eahomework1.authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on eahomework1.authorities (username,authority);

INSERT INTO eahomework1.users(username, password, enabled) VALUES ( 'user', 'user123', true );
INSERT INTO eahomework1.users(username, password, enabled) VALUES ( 'admin', 'admin123', true );

INSERT INTO eahomework1.authorities(username, authority) VALUES ( 'user', 'ROLE_USER' );
INSERT INTO eahomework1.authorities(username, authority) VALUES ( 'admin', 'ROLE_ADMIN' );
