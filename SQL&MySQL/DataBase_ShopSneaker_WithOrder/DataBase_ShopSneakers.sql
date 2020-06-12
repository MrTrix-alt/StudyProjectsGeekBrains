-- База данных интернет-магазина кроссовок с заказами --

CREATE SCHEMA `sneakershop` ; 

ALTER SCHEMA `sneakershop`  DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_general_ci ;

CREATE TABLE `sneakershop`.`category` (  
	`id` INT NOT NULL,  
	`name` VARCHAR(65) NOT NULL,  
	`discount` TINYINT NOT NULL,
  	PRIMARY KEY (`id`));

ALTER TABLE `sneakershop`.`category` 
CHARACTER SET = utf8;


SELECT * FROM sneakershop.category;
insert into category (id, name, discount) values (1, 'Мужская обувь', 5);
insert into category (id, name, discount) values (2, 'Женская обувь', 10);

CREATE TABLE `sneakershop`.`brand` (  
	`id` INT NOT NULL,  
	`brand_name` VARCHAR(60) NOT NULL, 
	PRIMARY KEY (`id`));

ALTER TABLE `sneakershop`.`brand` 
CHARACTER SET = utf8 ;

SELECT * FROM sneakershop.brand;
insert into brand (id, brand_name) values (1, 'Nike');
insert into brand (id, brand_name) values (2, 'Adidas');
insert into brand (id, brand_name) values (3, 'Asics');
insert into brand (id, brand_name) values (4, 'Puma');
insert into brand (id, brand_name) values (5, 'Saucony');
insert into brand (id, brand_name) values (6, 'Diadora');

CREATE TABLE `sneakershop`.`item_type` (
  	`id` INT NOT NULL,
  	`type` VARCHAR(65) NOT NULL,
  	PRIMARY KEY (`id`));

ALTER TABLE `sneakershop`.`item_type` 
CHARACTER SET = utf8 ;

ALTER TABLE `sneakershop`.`item_type` 
CHANGE COLUMN `id` `id` INT NOT NULL AUTO_INCREMENT ;

SELECT * FROM sneakershop.item_type;

insert into item_type (`type`) values ('Кроссовки повседневные');
insert into item_type (`type`) values ('Кеды повседневные');
insert into item_type (`type`) values ('Бутсы');
insert into item_type (`type`) values ('Кеды для скейтбординга');
insert into item_type (`type`) values ('Кроссовки для бега');
insert into item_type (`type`) values ('Кроссовки для волейбола');
insert into item_type (`type`) values ('Кроссовки для баскетбола'); 

CREATE TABLE `sneakershop`.`product` (
  	`id` INT NOT NULL AUTO_INCREMENT,
  	`category_id` INT NOT NULL,
  	`brand_id` INT NOT NULL,  
	`type_item_id` INT NOT NULL,
  	`price` INT NOT NULL,
  	PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

ALTER TABLE `sneakershop`.`product`
CHANGE COLUMN `price` `price` DECIMAL(10,2) NOT NULL ;

SELECT * FROM sneakershop.product;
insert into product (category_id, brand_id, type_item_id, price) values (1,1,1, 9999);
insert into product (category_id, brand_id, type_item_id, price) values (2,1, 2, 7599);
insert into product (category_id, brand_id, type_item_id, price) values (2,5, 5, 7999);
insert into product (category_id, brand_id, type_item_id, price) values (1,1,5,8999);
insert into product (category_id, brand_id, type_item_id, price) values (1,4,1, 7599);
insert into product (category_id, brand_id, type_item_id, price) values (2,3,1,11999);
insert into product (category_id, brand_id, type_item_id, price) values (2,6,1, 6999);
insert into product (category_id, brand_id, type_item_id, price) values (1,1,3,9999);
insert into product (category_id, brand_id, type_item_id, price) values (2,2,7,7599);
insert into product (category_id, brand_id, type_item_id, price) values (1, 5, 1, 7999);
insert into product (category_id, brand_id, type_item_id, price) values (2,6, 1, 8999);
insert into product (category_id, brand_id, type_item_id, price) values (2,4, 6, 7599);
insert into product (category_id, brand_id, type_item_id, price) values (2,2, 7, 11999);
insert into product (category_id, brand_id, type_item_id, price) values (1, 3, 1, 6999);
insert into product (category_id, brand_id, type_item_id, price) values (1, 1, 3, 6999);

CREATE TABLE `sneakershop`.`order` (
 	`id` INT NOT NULL AUTO_INCREMENT,
  	`user_name` VARCHAR(128) NOT NULL,
  	`phone` VARCHAR(128) NOT NULL,
  	`datetime` DATETIME NOT NULL,
  	PRIMARY KEY (`id`));


SELECT * FROM sneakershop.order;
insert into `order` (user_name, phone, datetime) values ('Timur Abubakirov', '8-917-232-23-12', '2020.05.06 21:32:01');
insert into `order` (user_name, phone, datetime) values ('Alexey Ignatyev', '8-987-232-23-12', '2020.06.03 21:12:55');
insert into `order` (user_name, phone, datetime) values ('Alexandr Dashkevich', '8-927-232-23-12', '2020.06.08. 21:43:14');
insert into `order` (user_name, phone, datetime) values ('Philipp Borisov', '8-919-232-23-12', '2020.06.10 12:22:34');
insert into `order` (user_name, phone, datetime) values ('Rustam Bernov', '8-923-232-23-12', '2020.06.07 12:54:04');

CREATE TABLE `sneakershop`.`order_products` (
  	`order_id` INT NOT NULL,
  	`product_id` INT NOT NULL,
  	`count` INT NOT NULL,
  	PRIMARY KEY (`order_id`, `product_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

ALTER TABLE `sneakershop`.`order_products`
ADD CONSTRAINT `fk_order_product_order`
FOREIGN KEY (`order_id`)
REFERENCES `sneakershop`.`order` (`id`)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_order_product_product`
FOREIGN KEY (`product_id`)
REFERENCES `sneakershop`.`product` (`id`)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE `sneakershop`.`order_products` 
DROP FOREIGN KEY `fk_order_product_product`;

ALTER TABLE `sneakershop`.`order_products` 
ADD INDEX `fk_order_product_product_idx` (`product_id` ASC) VISIBLE,
DROP INDEX `fk_order_product_product_idx` ;
;
ALTER TABLE `sneakershop`.`order_products` 
ADD CONSTRAINT `fk_order_product_product`
FOREIGN KEY (`product_id`)
REFERENCES `sneakershop`.`product` (`id`)
ON DELETE CASCADE;
ALTER TABLE `sneakershop`.`product` 
ADD INDEX `forkey_brand_product_idx` (`brand_id` ASC) VISIBLE;
;
ALTER TABLE `sneakershop`.`product` 
ADD CONSTRAINT `forkey_brand_product`
FOREIGN KEY (`brand_id`)
REFERENCES `sneakershop`.`brand` (`id`)
ON DELETE CASCADE
ON UPDATE NO ACTION;

ALTER TABLE `sneakershop`.`product` 
ADD INDEX `forkey_category_product_idx` (`category_id` ASC) VISIBLE;
;
ALTER TABLE `sneakershop`.`product` 
ADD CONSTRAINT `forkey_category_product`
FOREIGN KEY (`category_id`)
REFERENCES `sneakershop`.`category` (`id`)
ON DELETE CASCADE
ON UPDATE NO ACTION;

SELECT * FROM sneakershop.order_products;
insert into order_products (order_id, product_id, count) values (1, 1, 2);
insert into order_products (order_id, product_id, count) values (1, 2, 4);
insert into order_products (order_id, product_id, count) values (2, 2, 3);
insert into order_products (order_id, product_id, count) values (3, 11, 3);
insert into order_products (order_id, product_id, count) values (4, 12, 3);
insert into order_products (order_id, product_id, count) values (4, 2, 3);
insert into order_products (order_id, product_id, count) values (5, 10, 3);
insert into order_products (order_id, product_id, count) values (4, 3, 3);
insert into order_products (order_id, product_id, count) values (4, 6, 3);
insert into order_products (order_id, product_id, count) values (3, 5, 3);

ALTER TABLE `sneakershop`.`product` 
ADD INDEX `forkey_type_item_product_idx` (`type_item_id` ASC) VISIBLE;
;
ALTER TABLE `sneakershop`.`product` 
ADD CONSTRAINT `forkey_type_item_product`
FOREIGN KEY (`type_item_id`)
REFERENCES `sneakershop`.`item_type` (`id`)
ON DELETE CASCADE
ON UPDATE NO ACTION;

SELECT * FROM sneakershop.product

-- объединение таблицы product c таблицами category, brand, item_type --
inner join category on product.category_id = category.id
inner join brand on product.id = brand.id 
inner join item_type on product.type_item_id = item_type.id
-- Фильтрация в таблице product id > 3 и сортировка по возрастанию цены --
where product.id > 3
order by price;

-- Использование LEFT JOIN и RIGHT JOIN --
select * from category
left join product on product.category_id = category.id;
select * from product
right join item_type on product.category_id = type_item_id;

select * from `order`
inner join order_products on order_products.order_id = `order`.id
inner join product on order_products.product_id = product.id;
