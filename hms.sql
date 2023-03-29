create database hms;

show databases;

use hms;

create table login(username varchar(25) Primary key, password varchar(25));

insert into login values("admin", "admin");

insert into login values("admin1", "12345");

Select * from login;

create table employee(name varchar(25), age varchar(25), gender varchar(25), job varchar(30), salary varchar(15), phone varchar(15), email varchar(40), socialsecurity varchar(15) Primary key);  

describe employee;

select * from employee;

create table room(roomnumber varchar(10) Primary key, availability varchar(20), cleaning_status varchar(20), price varchar(20), bed_type varchar(20));

describe room;

select * from room;

create table department(department varchar(30) Unique, budget varchar(30));

describe department;

insert into department values('Front Office', '50000');
insert into department values('House Keeping', '5000');
insert into department values('Food and Beverages', '8000');
insert into department values('Kitchen or Food Products', '7000');
insert into department values('Security', '3000');

Select * from department;

create table customer(document varchar(20), number varchar(30) Primary Key, name varchar(30), gender varchar (10), country varchar(20), room varchar(10), checkintime varchar(80), deposit varchar(20));

describe customer; 

select * from customer;



