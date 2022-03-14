CREATE USER admin PASSWORD 'admin';

-- CREATE DATABASE red_social OWNER admin; 
GRANT ALL PRIVILEGES ON DATABASE red_social TO admin;
  
  
CREATE SEQUENCE id_persona_seq;
GRANT USAGE, SELECT ON SEQUENCE cities_id_seq TO admin;
create table persona(
	id_persona int8  NOT NULL DEFAULT nextval('id_persona_seq'),
	correo varchar(250) unique not null,
	nombre varchar(100) not null,
	apellido_paterno  varchar(100) not null,
	apellido_materno  varchar(100) not null,
	fecha_nacimiento  varchar(100) not null,
	contrasena varchar(255) not null,
	alias varchar(255)  unique not null,
	registro_activo boolean default true not null,
	fecha_alta  timestamp default CURRENT_TIMESTAMP not null,
	fecha_modificacion timestamp default CURRENT_TIMESTAMP not null,
	id_persona_alta int8,
	id_persona_modificacion int8,
	primary key(id_persona)
);
ALTER SEQUENCE id_persona_seq OWNED BY persona.id_persona;


select * from persona;
INSERT INTO persona
(correo, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, contrasena, alias, registro_activo, 
fecha_alta, fecha_modificacion, id_persona_alta, id_persona_modificacion)
VALUES('adrian.garciliano@elektra.com.mx', 'adrian', 'garciliano', 'jimenez', '20-03-1991 00:00:00', 'adrian', 'garciliano', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1, 1);


 
  
 
CREATE SEQUENCE id_autor_seq;
create table autor(
	id_autor int8  NOT NULL DEFAULT nextval('id_autor_seq'),
	nombre varchar(255) not null,	
	registro_activo boolean default true not null,
	fecha_alta  timestamp default CURRENT_TIMESTAMP not null,
	fecha_modificacion timestamp default CURRENT_TIMESTAMP not null,
	id_persona_alta int8  not null,
	id_persona_modificacion int8  not null,
	primary key(id_autor)
);
ALTER SEQUENCE id_autor_seq OWNED BY autor.id_autor;

INSERT INTO public.autor
(nombre, registro_activo, fecha_alta, fecha_modificacion, id_persona_alta, id_persona_modificacion)
VALUES('Benito Taibo', true, now(), now(), 1, 1);


CREATE SEQUENCE id_libro_seq;
create table libro(
	id_libro int8  NOT NULL DEFAULT nextval('id_libro_seq') ,
	nombre varchar(255) not null,	
	descripcion text not null,
	informacion text not null,
	id_autor int8  NOT null,
	num_paginas int4 NOT null,
	registro_activo boolean default true not null,
	fecha_alta  timestamp default CURRENT_TIMESTAMP not null,
	fecha_modificacion timestamp default CURRENT_TIMESTAMP not null,
	id_persona_alta int8 not null,
	id_persona_modificacion int8  not null, 
	primary key(id_libro),  
	CONSTRAINT fk_libro_id_autor
      FOREIGN KEY(id_autor) 
	  REFERENCES autor(id_autor)
);
ALTER SEQUENCE id_libro_seq OWNED BY libro.id_libro;  
   
INSERT INTO public.libro
(nombre, descripcion, informacion, id_autor, num_paginas, registro_activo, fecha_alta, fecha_modificacion, id_persona_alta, id_persona_modificacion)
VALUES('Persona Normal', 'Libre sobre ...', 'Editorial , año, etc', 1, 200, true, now(), now(), 1, 1);


CREATE SEQUENCE id_post_seq;
create table post(
	id_post int8  NOT NULL DEFAULT nextval('id_post_seq'),
	post text not null,
	id_persona int8  not null,
	id_libro int8,  
	me_gusta int4, 
	registro_activo boolean default true not null,
	fecha_alta  timestamp default CURRENT_TIMESTAMP not null,
	fecha_modificacion timestamp default CURRENT_TIMESTAMP not null,
	primary key(id_post),
	CONSTRAINT fk_post_id_libro
      FOREIGN KEY(id_libro) 
	  REFERENCES libro(id_libro),
	CONSTRAINT fk_post_id_persona
      FOREIGN KEY(id_persona) 
	  REFERENCES persona(id_persona)
);
ALTER SEQUENCE id_post_seq OWNED BY post.id_post;

INSERT INTO public.post
(post, id_persona, id_libro, me_gusta, registro_activo, fecha_alta, fecha_modificacion)
VALUES('Este es mi libro favorito, la forma de expresar las ideas y sentimientos al lector es tan natural', 1, 1, 5555, true, now(), now());



CREATE SEQUENCE id_comentario_seq;
create table comentario(
	id_comentario int8  NOT NULL DEFAULT nextval('id_comentario_seq'),
	comentario text not null,
	id_post int8  NOT null,
	fecha_alta  timestamp default CURRENT_TIMESTAMP not null,
	fecha_modificacion timestamp default CURRENT_TIMESTAMP not null,
	id_persona_alta int8  not null,
	id_persona_modificacion int8  not null,
	primary key(id_comentario),
	CONSTRAINT fk_comentario_id_post
      FOREIGN KEY(id_post) 
	  REFERENCES post(id_post)
);
ALTER SEQUENCE id_comentario_seq OWNED BY comentario.id_comentario;



GRANT ALL PRIVILEGES ON DATABASE red_social TO admin;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO admin;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO admin;



