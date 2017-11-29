-- :name create-test-table
-- :command :execute
-- :result :raw
-- :doc create table test
create table test (
    id          integer auto_increment primary key,
    name        varchar(40),
    comment     varchar(100),
    created_at timestamp not null default current_timestamp
)