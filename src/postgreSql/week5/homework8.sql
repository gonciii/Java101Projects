-- EXAMPLE 8
-------------------------------------------------------------------------------------
-- 1.test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
--DATABASE --> create --> database --> test

CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

--------------------------------------------------------------------------------------------

--2.Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

--'Mockaroo' servisi kullanarak 50 veri ekleme işlemi :
insert into employee (name, birthday, email) values ('Joyce', '1997/07/13', 'jcallington0@oakley.com');
insert into employee (name, birthday, email) values ('Ker', '1993/07/02', 'kmusgrove1@scientificamerican.com');
...
+48;

--------------------------------------------------------------------------------------------

--3.Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

UPDATE employee
SET name = 'GGGGG',
birthday = '1997-04-11',
email ='gonci@gonci.com'
WHERE id =1;

UPDATE employee
SET name = 'AAAAA'
WHERE id = 2;

UPDATE employee
SET birthday = '1999-01-04'
WHERE id = 3;

UPDATE employee
SET name = 'XXXX',
birthday = '1969-03-10'
WHERE id = 4;

UPDATE employee
SET email = 'update@up.com'
WHERE id = 5;

select * from employee;

----------------------------------------------------------------------------------------------

--4.Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.


DELETE FROM employee
WHERE name ='XXXX';

DELETE FROM employee
WHERE id = 5;

DELETE FROM employee
WHERE email ='gonci@gonci.com';

DELETE FROM employee
WHERE name ='AAAAA';

DELETE FROM employee
WHERE id =3;