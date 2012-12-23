create database W3school
go
use W3school
go

create table Persons
(
	Id_P int primary key identity,
	LastName varchar(255),
	FirstName varchar(255),
	Address varchar(255),
	City varchar(255)
)
go

create table Orders
(
	Id_O int primary key identity,
	OrderNo int,
	Id_P int references Persons(Id_P)
)
go

select Persons.LastName, Persons.FirstName, Orders.OrderNo
from Persons, Orders
where Persons.Id_P = Orders.Id_P
go

Select Persons.LastName, Persons.FirstName, Orders.OrderNo
from Persons
INNER JOIN Orders
ON Persons.Id_P = Orders.ID_P
order by Persons.LastName
go

select * from Orders
select * from dbo.Persons
go

select * from Persons
join Orders on Persons.Id_P = Orders.Id_P
go

select * from Persons
left join Orders on Persons.Id_P = Orders.Id_P
go

select * from Persons
right join Orders on Persons.Id_P = Orders.Id_P
go

select * from Persons
full join Orders on Persons.Id_P = Orders.Id_P
go