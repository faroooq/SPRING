-- CREATE TABLE currency_exchange(
--     id LONG NOT NULL AUTO_INCREMENT,
--     currency_from varchar(255),
--     currency_to varchar(255),
--     conversion_multiple decimal,
--     PRIMARY KEY (id)
--     );
-- insert into currency_exchange(id,currency_from,currency_to,conversion_multiple) values(10001,'USD','INR',65);
-- insert into currency_exchange(id,currency_from,currency_to,conversion_multiple) values(10002,'EUR','INR',75);
-- insert into currency_exchange(id,currency_from,currency_to,conversion_multiple) values(10003,'AUD','INR',25);
-- commit;

insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10001,'USD','INR',65,'');
insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10002,'EUR','INR',75,'');
insert into currency_exchange
(id,currency_from,currency_to,conversion_multiple,environment)
values(10003,'AUD','INR',25,'');