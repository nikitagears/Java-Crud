CREATE TABLE movies (
  id_movie serial PRIMARY KEY,
  title varchar(40) NOT NULL,
  release_date int(8),
  desciption text NOT NULL,
  rating double precision
);

CREATE TABLE genres (
  id_genre serial PRIMARY KEY,
  genre varchar(15)
);

CREATE TABLE actors (
  id_actor serial PRIMARY KEY,
  actor_name varchar(30) NOT NULL,
  gender varchar(10) NOT NULL,
  birthday date NOT NULL
);

CREATE TABLE characters (
  id_character serial PRIMARY KEY,
  character_name varchar(30) NOT NULL,
  id_movie serial references movies(id_movie),
  id_actor serial references actors(id_actor)
);

CREATE TABLE genres_movies (
  id_genre serial references genres(id_genre),
  id_movie serial references movies(id_movie),
  CONSTRAINT genres_movies_pk PRIMARY KEY(id_genre,id_movie)
);
