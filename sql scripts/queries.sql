--1) Фильмы релиз которых состоялся до 2012 года, с подсчетом количества персонажей сыгравших в фильме
select "movies"."title" as "title",
"movies"."release_date" as "release_date",
"movies"."rating" as "rating",
COUNT(DISTINCT "characters"."character_name") as count_characters_in_movie
FROM movies
LEFT JOIN characters ON "movies"."id_movie"="characters"."id_movie"
WHERE "movies"."release_date" < '2012'
GROUP BY "movies"."id_movie"
ORDER BY count_characters_in_movie desc, "movies"."title" desc;



--2) фильмы содержащие слово «день» в названии
select * from movies where "title" ilike '%day%';



--3) найти все комедии
select "movies"."title" as "title",
"movies"."release_date" as "release_date",
"movies"."rating" as "rating"
FROM movies
LEFT JOIN "genres_movies" ON "movies"."id_movie"="genres_movies"."id_movie"
LEFT JOIN "genres" ON "genres_movies"."id_genre"="genres"."id_genre"
WHERE "genres"."genre"='Comedy'
GROUP BY "movies"."id_movie";



--4) найти все фильмы с Джаредом Лето
select "actors"."actor_name", --можно убрать
"movies"."title" as "title",
"movies"."release_date" as "release_date",
"movies"."rating" as "rating",
"characters"."character_name" -- можно убрать
FROM movies
LEFT JOIN "characters" ON "movies"."id_movie"="characters"."id_movie"
LEFT JOIN "actors" ON "characters"."id_actor"="actors"."id_actor"
WHERE "actors"."actor_name"='Jared Leto'
ORDER BY "movies"."release_date" desc; --можно убрать


