DROP TABLE BBS IF EXISTS CASCADE;

CREATE TABLE BBS 
(	
	IDX INTEGER primary key,
	NAME VARCHAR(50) NOT NULL,
	TITLE VARCHAR(500),
	CONTENTS VARCHAR(400)
);


--CREATE TABLE DRINK
--(
--	DRINK_ID INTEGER NOT NULL primary key,
--	DRINK_NAME VARCHAR(50) NOT NULL,
--	DRINK_PRICE INTEGER NOT NULL
--);
--
--
--CREATE TABLE MENU
--(
--	MENU_ID INTEGER NOT NULL primary key,
--	MENU_NAME VARCHAR(50) NOT NULL,
--	MENU_PRICE INTEGER NOT NULL,
--	PIZZA_ID INTEGER,
--	DRINK_ID INTEGER,
--	FOREIGN KEY(PIZZA_ID) REFERENCES PIZZA(PIZZA_ID),
--	FOREIGN KEY(DRINK_ID) REFERENCES DRINK(DRINK_ID)
--);
