DROP TABLE IF EXISTS Producto CASCADE;


CREATE TABLE IF NOT EXISTS Producto(

    id serial,
    codigo varchar(10),
    nombre varchar(50),
    fecha_v date,
    precio float,
    categoria varchar(20),
    deleted boolean NOT NULL DEFAULT false,
    PRIMARY KEY (id)

);
