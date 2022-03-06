drop database Librarian
create database Librarian
use Librarian


select * from Book

create table Shelf(
Id nvarchar(100) primary key,
[Floor] int,  
)

--insert into shelf
insert into Shelf(Id, Floor)
values('A123', 1), ('B235',2),('C234',3)

create table [Book](
Id int IDENTITY(1,1) primary key,
Title nvarchar(100),
Publisher nvarchar(100),
Year nvarchar(10),
Pic nvarchar(200),
ShelfId nvarchar(100) foreign key references Shelf(Id),
Quantity int,
Availability int,
Category nvarchar(50) not null,
Rental_Prince money,
)

--insert into book
insert into Book(Title, Publisher, Year, Pic,ShelfId, Quantity, Availability, Category, Rental_Prince)
values ('Never Eat Alone', 'Nha XB Tre', '2005', null,'A123', 20,20, 'Self-help',5000),
('C/C#', 'DH FPT', '2015', null,'B235', 45, 42, 'IT', 5000),
('Marketing in a NutShell', 'Nha XB Tre','2002',null, 'A123', 15,13, 'Marketing',5000),
('Leadership Skill', 'Nha XB GD&DT', '2007',null,'C234',  5, 2, 'Management Skill',5000)

create table [Author](
BookId int foreign key references Book(Id),
Author nvarchar(50) not null,
primary key (BookId, Author),
)

--insert into Author
insert into Author(BookId, Author)
values (1, 'Keith Ferrazzi'), (1, 'Tahl Raz'), (2, 'FPT Ed'), (3, 'Mike Meldrum'),(3, 'Malcolm McDonald'), (4, 'AnonymousBeing')



create table [Member](
Id nvarchar(50) not null primary key,
[Password] nvarchar(100) not null,
Name nvarchar(100),
Address nvarchar(100),
RegistrationExpireDate date,
Email nvarchar(100),
PhoneNumber nvarchar(20), 
)


--insert into user
insert into [Member] (Id, Password, Name, Address, RegistrationExpireDate, Email, PhoneNumber)
values ('HE163541', 'HE163541', 'Luong Ngoc Anh','Cao Bang','2022-04-04', 'anhlnhe163541@fpt.edu.vn', '0987654321'),
('HE163008', 'HE163008', 'Hoa Hoe','Ha Noi', '2022-04-04', 'hoahoe@gmail.com', '0123456789'),
('HS26749', 'HS26749', 'Nhung','Nghe An', '2022-04-04', 'NhungHS26749@fpt.edu.vn', '0123546789'),
('AI178902', 'AI178902', 'Lan Em','Yen Bai', '2022-04-04', 'lanhlanh@gmail.com', '0986754321'),
('1234578', '1234578', 'Admin 1','TP HCM', '2022-04-04', 'Admin1@gmail.com', '0231456789'),
('1234567', '1234567', 'Admin 2','Cao Bang', '2022-04-04', 'Admin2@gmail.com', '0231457789')


create table Librarian(
Id nvarchar(50) not null primary key,
[Password] nvarchar(100) not null,
Name nvarchar(100),
Address nvarchar(100),
Email nvarchar(100),
PhoneNumber nvarchar(20),
)

--insert into Librarian
insert into Librarian(Id, Password, Name, Address, Email, PhoneNumber)
values ('Admin1', 'Admin1', 'Nguyen Van A','Cao Bang', 'admin1@gmail.com', '7777777777'),
('Admin2', 'Admin2', 'Hoa Hoe','Ha Noi', 'admin2@gmail.com', '8888888888'),
('Admin3', 'Admin3', 'Nhung','Nghe An', 'admin3@gmail.com', '9999999999')



create table [Request](
MemberId nvarchar(50) not null foreign key references Member(Id),
BookId int not null foreign key references Book(Id),
primary key (MemberId, BookId),
[Type] nvarchar(50) default 'Request',
Status nvarchar(50) default 'pending',

)

--insert into Request
insert into Request(MemberId, BookId)
values('HE163541', 1),
('HS26749', 1),
('AI178902', 2)



create table Issued(
MemberId nvarchar(50) not null foreign key references Member(Id),
BookId int not null foreign key references Book(Id),
primary key (MemberId, BookId),
DateOfIssue date,
DateOfReturn date,
ActualReturnDate date ,
Fine money,
)

--insert into issued
insert into Issued (MemberId, BookId, DateOfIssue, DateOfReturn, ActualReturnDate, Fine)
values('HE163541', 2, '2022-01-02', '2022-02-04','2022-02-01', 0),
('AI178902', 3, '2021-12-23', '2022-01-01','2022-01-02', 5000)

create table Noti(
Id int not null IDENTITY(1,1) primary key,
MemberId nvarchar(50) not null foreign key references Member(Id),
Date date,
Time time,
Message nvarchar(200),
)

--insert into Noti 
insert into Noti(MemberId, Date, Time, Message)
values ('HE163541','2022-01-02',null, 'Luong Ngoc Anh request is successfully approved!'),
('AI178902','2022-01-02',null, 'Lan Em request is successfully approved!')

create table Recommendation(
Id int not null IDENTITY(1,1) primary key,
MemberId nvarchar(50) not null foreign key references Member(Id),
BookName nvarchar(50),
[Description] nvarchar(50),
Status nvarchar(50) default 'pending',
)

--insert into Rec
insert into Recommendation(MemberId, BookName, Description)
values('HE163541', 'Song Thuc Te Giua Doi Thuc Dung', 'Please have this stunning book in the library')

