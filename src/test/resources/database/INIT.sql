CREATE SCHEMA IF NOT EXISTS test_schema;

CREATE TABLE IF NOT EXISTS test_schema.user (
	id bigserial NOT NULL,
	name varchar NOT NULL,
	CONSTRAINT pk_user PRIMARY KEY (id)
);

INSERT INTO test_schema.user(id,name) VALUES (1,'JOSE');
INSERT INTO test_schema.user(id,name) VALUES (2,'GUZMAN');