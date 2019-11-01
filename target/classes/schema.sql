
CREATE database IF NOT EXISTS eahomework1;
drop table  if exists authorities;
drop table if exists users;

drop table if exists BATCH_JOB_EXECUTION;
drop table if exists BATCH_JOB_EXECUTION_CONTEXT;
drop table if exists BATCH_JOB_EXECUTION_PARAMS;
drop table if exists BATCH_JOB_EXECUTION_SEQ;
drop table if exists BATCH_JOB_INSTANCE;
drop table if exists BATCH_JOB_SEQ;
drop table if exists BATCH_STEP_EXECUTION;
drop table if exists BATCH_STEP_EXECUTION_CONTEXT;
drop table if exists BATCH_STEP_EXECUTION_SEQ;

create table users(
    username varchar_ignorecase(50) not null primary key,
    password varchar_ignorecase(50) not null,
    enabled boolean not null
);

create table authorities (
    username varchar_ignorecase(50) not null,
    authority varchar_ignorecase(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

-- INSERT INTO users(username, password, enabled) VALUES ( 'user', 'user123', true );
-- INSERT INTO users(username, password, enabled) VALUES ( 'admin', 'admin123', true );
--
-- INSERT INTO authorities(username, authority) VALUES ( 'user', 'ROLE_USER' );
-- INSERT INTO authorities(username, authority) VALUES ( 'admin', 'ROLE_ADMIN' );
