create database db_product;
create table Product(
    Productid BIGINT not null AUTO_INCREMENT,
name varchar(30),
    ref varchar(30),
    price decimal,
    categoryid BIGINT not null,
    primary key (Productid),
    foreign key (categoryid),
    create table Category(
        name varchar,
        categoryid BIGINT AUTO_INCREMENT
    )
)