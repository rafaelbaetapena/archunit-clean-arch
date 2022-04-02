CREATE TABLE book (
	id UUID NOT NULL,
	title varchar(255) NOT NULL,
	publishing_company varchar(255) NOT NULL,
	CONSTRAINT book_pkey PRIMARY KEY (id)
);