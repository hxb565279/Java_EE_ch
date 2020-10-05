USE mybatis;
#创建一个tb_idcard的表
create table tb_idcard
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    CODE VARCHAR(18)
);
insert into tb_idcard(CODE)
values ('152221198711020624');
insert into tb_idcard(CODE)
values ('152201199008150317');

#创建一个tb_person的表
create table tb_person
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(32),
    age     INT,
    sex     VARCHAR(8),
    card_id INT UNIQUE,
    FOREIGN KEY (card_id) REFERENCES tb_idcard (id)
);

insert into tb_person(name, age, sex, card_id)
VALUES ('Rose', 29, '女', 1);
insert into tb_person(name, age, sex, card_id)
VALUES ('tom', 27, '男', 2);

#创建一个tb_user的表
create table tb_user
(
    id       int(32) primary key AUTO_INCREMENT,
    username varchar(32),
    address  varchar(256)
);
insert into tb_user
values ('1', '詹姆斯', '克利夫兰');
insert into tb_user
values ('2', '科比', '洛杉矶');
insert into tb_user
values ('3', '保罗', '洛杉矶');


#创建一个tb_orders的表
create table tb_orders
(
    id      int(32) primary key auto_increment,
    number  varchar(32) not null,
    user_id int(32)     not null,
    foreign key (user_id) references tb_user (id)
);

insert into tb_orders
values ('1', '1000011', '1');
insert into tb_orders
values ('2', '1000012', '1');
insert into tb_orders
values ('3', '1000013', '2');

create table tb_product(
    id INT(32) primary key AUTO_INCREMENT,
    NAME VARCHAR(32),
    price DOUBLE
);
insert into tb_product values ('1','JAVA基础入门','44.5');
insert into tb_product values ('2','java web 程序开发入门','38.5');
insert into tb_product values ('3','SSM框架整合实战','50');

#中间表
create table tb_ordersitem(
    id INT(32) PRIMARY KEY AUTO_INCREMENT,
    orders_id INT(32),
    product_id INT(32),
    FOREIGN KEY (orders_id) references tb_orders(id),
    foreign key (product_id) references tb_product(id)
);

insert into tb_ordersitem values ('1','1','1');
insert into tb_ordersitem values ('2','1','3');
insert into tb_ordersitem values ('3','3','3');