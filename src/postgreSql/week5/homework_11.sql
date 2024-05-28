--EXAMPLE 11
-----------------------------------------------------------------------------------------------------------------------
--1.actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
(select first_name from actor
)
UNION
(select first_name from customer
);

----------------------------------------------------------------------------------------------------------------------

--2.actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

(SELECT first_name FROM actor
)
INTERSECT
(SELECT first_name FROM customer
);
---------------------------------------------------------------------------------------------------------------------
--3.actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.


(SELECT first_name FROM actor
)
EXCEPT
(SELECT first_name FROM customer
);

----------------------------------------------------------------------------------------------------------------------
--4. İlk 3 sorguyu tekrar eden veriler için de yapalım.

--4.1
(SELECT first_name FROM actor
)
UNION ALL
(SELECT first_name FROM customer
) ORDER BY first_name;

----------------------------------------------------------------------------------------------------------------------
--4.2

(SELECT first_name FROM actor
)
-- INTERSECT = INTERSECT ALL !
INTERSECT ALL
(SELECT first_name FROM customer
) ORDER BY first_name ;

---------------------------------------------------------------------------------------------------------------------
--4.3

(SELECT first_name FROM actor
)
EXCEPT ALL
(SELECT first_name FROM customer
) ORDER BY first_name ;
