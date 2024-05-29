--EXAMPLE 12
-----------------------------------------------------------------------------
--1.film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

SELECT COUNT(*)  as FİLM_SAYİSİ FROM film
WHERE length >
(
	SELECT AVG(length) from film
);

--------------------------------------------------------------------------------
--2.film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

SELECT COUNT(*) as FİLM_SAYİSİ FROM film
WHERE rental_rate =
(
	SELECT MAX(rental_rate) FROM film
);

------------------------------------------------------------------------------
--3.film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.

SELECT title,replacement_cost,rental_rate FROM film
WHERE (rental_rate,replacement_cost) = ANY
(
	SELECT MIN(rental_rate),MIN(replacement_cost)
	FROM film
);

--------------------------------------------------------------------------------
--4.payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

select  first_name,last_name,COUNT(*) AS TOPLAM_ÖDEME_SAYİSİ FROM payment
LEFT JOIN customer ON payment.customer_id = customer.customer_id
GROUP BY first_name,last_name
ORDER BY count(*) desc;