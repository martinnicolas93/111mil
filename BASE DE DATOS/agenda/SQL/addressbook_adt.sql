
// CREACION DE UNA TABLA
CREATE TABLE addressbook (
	dni              integer,
	first_name       text,
	sure_name        text,
	birthday         timestamptz,
	address          text,
	phone            text
);

// INSERCION DE DATOS
INSERT INTO addressbook VALUES
	(25969243, 'German', 'Basisty', '19770520'::timestamptz, 'Maipu 251', '2084-9468'),
	(40302747, 'Anahi', 'Benitez', '19970328'::timestamptz, 'Chorroarin 2461', '4240-0705'),
	(38869283, 'Jose', 'Mosquera', '19950606'::timestamptz, 'Moreno 2869', '4218-6745');
