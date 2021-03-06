-- :name test-connection :? :1
select 1;

-- :name create-test-table
-- :command :execute
-- :result :raw
-- :doc create table test
create table test (
    id          integer auto_increment primary key,
    name        varchar(40),
    comment     varchar(100),
    created_at timestamp not null default current_timestamp
);

-- :name drop-test-table :!
-- :doc Drop test table if exists
drop table if exists test


-- :name select-test-all :? :*
select SQL_CACHE * from test;

-- :name select-test-where-id :? :1
select SQL_CACHE * from test
where id = :id;

-- :name insert-test :execute :n
insert into test (name, comment)
values (:name, :comment);

-- :name delete-test-where-id :! :n
delete from test
where id = :id

-- :name update-test-set-comment-where-id :! :n
update test
set comment = :comment
where id = :id