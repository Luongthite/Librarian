drop database Librarian
create database Librarian
use Librarian

create table Category(
Id nvarchar(100) primary key,
Name nvarchar(100),
)

insert into Category values ('C01','IT'), ('C02','Marketing'), ('C03','Economics'), ('C04','Management Skill'), ('C05','Self-help'), ('C06','Architecture'), ('C07','Science')

create table Shelf(
Id nvarchar(100) primary key,
[Floor] int,  
)

--insert into shelf
insert into Shelf(Id, Floor)
values('A123', 1), ('B235',2),('C234',2), ('C324',3), ('D514',5),('E113',1), ('D324',3), ('E234',2)

create table [Book](
Id int IDENTITY(1,1) primary key,
Title nvarchar(100),
Publisher nvarchar(100),
Year nvarchar(10),
Pic nvarchar(200),
ShelfId nvarchar(100) foreign key references Shelf(Id),
Quantity int,
Availability int,
CategoryId nvarchar(100) not null foreign key references Category(Id),
Language nvarchar(50),
timePost date,
Rental_price money,
ShortDescription nvarchar(MAX),
)

--insert into book


insert into Book(Title, Publisher, Year, Pic,ShelfId, Quantity, Availability, CategoryId, Language, timePost, Rental_price, ShortDescription)
values ('Never Eat Alone', 'Nha XB Tre', '2005', 'PHOTOS/book1.jpg','A123', 20,20, 'C05','Vietnamese','2022-03-10',3,'Never Eat Alone is a modern classic, which explains the art of networking and gives you actionable advice on how you can harness the power of good relationships and become a good networker to build a career you love.'),
('C/C#', 'DH FPT', '2015', 'PHOTOS/book2.jpg','B235', 45, 42, 'C01', 'Russian','2022-03-08',3,'A thorough guide on how to be a C/C# developer'),
('Marketing in a NutShell', 'Nha XB Tre','2002','PHOTOS/book3.jpg','A123',   15,13, 'C02','English','2022-02-25',3,'Marketing in a Nutshell is an easy-to-use quick reference source for non-marketing specialists. Designed as a dip-in guide, this accessible book will be invaluable to general managers, non-qualified marketers and students taking a module in marketing alongside their other studies. Marketing in a Nutshell makes the authors’ marketing know-how and expert insights accessible to all.'),
('Leadership Skill', 'Nha XB GD&DT', '2007','PHOTOS/book4.jpg','C234', 5, 2, 'C04','English','2021-12-23',3,'Leadership skills are the strengths and abilities individuals demonstrate that help the oversee processes, guide initiatives and steer their employees toward the achievement of goals.'),
('Blockchain', 'Sachvui.com', '2017','PHOTOS/book5.jpg','C234', 25, 21, 'C01','Vietnamese','2021-3-11',3,'Blockchain is a system of recording information in a way that makes it difficult or impossible to change, hack, or cheat the system. A blockchain is essentially a digital ledger of transactions that is duplicated and distributed across the entire network of computer systems on the blockchain.'),
('Linux for Dummies', 'NY Best Publisher', '2018','PHOTOS/book6.jpg','C324', 10, 1, 'C01','English','2021-3-11',3,'
Linux can seem like a very daunting environment. But it doesn’t have to be! With the two topics in this cheat sheet—the commands you’ll use on a daily basis and the useful help pages—you can easily navigate your Linux environment.'),
('The Emyth', 'NXB LD-XH', '2015','PHOTOS/book7.jpg','D514', 12, 6, 'C04','Vietnamese','2022-3-11',3,'The E-Myth Revisited explains why 80% of small businesses fail, and how to ensure yours isnt among those by building a company thats based on systems and not on the work of a single individual.'),
('Nghi Lon De Thanh Cong', 'NXB Tre', '2020','PHOTOS/book8.jpg','E113', 16, 9, 'C03','Vietnamese','2021-12-11',3,'The book illustrates how you dont need to be incredibly intelligent or unique to have the success you want, you simply need to think in a way that cultivates success. By thinking big you can motivate yourself to improve your work life, earn more money and get more happiness and fulfilment out of life.'),
('Mat Thu', 'NXB Tre', '2009','PHOTOS/book9.jpg','D324', 5, 4, 'C07','Vietnamese','2022-2-11',3,'A really good book on Mat Thu from Tran Thoi will unlock new lenses to the world that We have not yet known and discovered. Through the stories in the book, we have a chance to grow critical thinking'),
('The Architecture', 'Rockport Publishers', '2018','PHOTOS/book10.jpg','C324', 10, 2, 'C06','English','2022-1-11',3,'A comprehensive introduction to architecture and architectural history and exceptional in its approach, this book explores architecture as a current practice about the history and the wider context of cultures, conservation, and the environment. And the emphasis on sustainability, urbanism, urban regeneration, and cultural identity, to take a holistic approach to the subject of architecture. This book enables the reader to make sense of the experience of architecture and the built environment by understanding more about the form, construction, meaning, and history of the subject'),
('Story of Architecture: From Antiquity to the Present', 'Ullmann Publishing', '2018','PHOTOS/book11.jpg','E234', 5, 2, 'C06','English','2019-3-12',3,'The series Compact Knowledge provides concise and relilable information on key cultural and historical topics. SELLING POINTS: Chronological presentation of the most important themes More than 150 illustrations with detailed explanations Supplementary cards on special related themes and the history of the events Time lines, illustrations, and maps Index of subjects and names Colour'),
('The Economics Book', 'DK; 1st edition (3 Sept. 2012)', '2018','PHOTOS/book12.jpg','C324', 16, 13, 'C03','English','2021-5-23',3,'Everything from taxation, to recession to the housing market and much more! By following an innovative visual approach, The Economics Book demystifies and untangles complicated theories. Make sense of abstract concepts through colorful graphics, fun facts, and step-by-step flow diagrams.')


create table [Author](
BookId int foreign key references Book(Id),
Author nvarchar(50) not null,
primary key (BookId, Author),
)

--insert into Author
insert into Author(BookId, Author)
values (1, 'Keith Ferrazzi'), (1, 'Tahl Raz'), (2, 'FPT Ed'), (3, 'Mike Meldrum'),(3, 'Malcolm McDonald'), (4, 'AnonymousBeing'), (5,'Various Authors'),(6,'Emmett Dulaney'),
(7,'Michael E. Gerber'),(8,'Donald J.Trump'),(9,'Tran Thoi'), (10,'Julia McMorrough'), (11,'Various Authors'), (12,'Various Authors')


create table [Member](
Id nvarchar(50) not null primary key,
[Password] nvarchar(100) not null,
Name nvarchar(100),
Address nvarchar(100),
MemberRegistrationDate date default null,
MemberExpireDate date default null,
Email nvarchar(100),
PhoneNumber nvarchar(20),
CardNumber nvarchar(50),
CardExpDate nvarchar(50),
CVC int,
)
select * from Member

--insert into user
insert into [Member] (Id, Password, Name, Address, Email, PhoneNumber, CardNumber, CardExpDate, CVC)
values ('HE163541', 'HE163541', 'Luong Ngoc Anh','Cao Bang', 'anhlnhe163541@fpt.edu.vn', '0987654321', '111111111111','06/23','123'),
('HE163008', 'HE163008', 'Hoa Hoe','Ha Noi', 'hoahoe@gmail.com', '0123456789', '111111111111','06/23','223'),
('HS26749', 'HS26749', 'Nhung','Nghe An', 'NhungHS26749@fpt.edu.vn', '0123546789', '111111112211','06/23','133'),
('AI178902', 'AI178902', 'Lan Em','Yen Bai', 'lanhlanh@gmail.com', '0986754321', '111113311111','06/23','143')

--select * from Librarian
--delete from Member where Name='Admin 1'

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
AdminId nvarchar(50) not null foreign key references Librarian(Id),
primary key (MemberId, BookId, DateOfIssue),
DateOfIssue date,
DateOfReturn date,
ActualReturnDate date ,
Fine money,
)


select * from Issued where ActualReturnDate is null
--insert into issued
insert into Issued (MemberId, BookId,AdminId, DateOfIssue, DateOfReturn, ActualReturnDate, Fine)
values('HE163541', 2,'Admin1', '2022-01-02', '2022-02-04','2022-02-01', 0),
('AI178902', 3,'Admin1', '2021-12-23', '2022-01-01','2022-01-02', 5000)

create table Noti(
Id int not null IDENTITY(1,1) primary key,
AdminId nvarchar(50) not null foreign key references Librarian(Id),
MemberId nvarchar(50) not null foreign key references Member(Id),
Date date,
Time time,
Message nvarchar(200),
)


select * from issued
insert into Issued values ('AI178902',4,'Admin1','2022-03-12','2022-03-15','2022-03-14',0)

--insert into Noti 
insert into Noti(MemberId, AdminId, Date, Time, Message)
values ('HE163541','Admin1','2022-01-02',null, 'Luong Ngoc Anh request is successfully approved!'),
('AI178902','Admin2','2022-01-02',null, 'Lan Em request is successfully approved!')


create table Recommendation(
Id int not null IDENTITY(1,1) primary key,
MemberId nvarchar(50) not null foreign key references Member(Id),
BookName nvarchar(50),
BookPic nvarchar(100),
Author nvarchar(50),
[Description] nvarchar(50),
Status nvarchar(50) default 'pending',
)

--insert into Rec
insert into Recommendation(MemberId, BookName,BookPic, Author,Description)
values('HE163541', 'Song Thuc Te Giua Doi Thuc Dung','https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE4wtcG?ver=523b','Te Luong', 'Please have this stunning book in the library')



