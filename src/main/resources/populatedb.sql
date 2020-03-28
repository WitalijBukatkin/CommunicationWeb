/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

ALTER SEQUENCE hibernate_sequence RESTART 10000;

INSERT INTO NODE VALUES (1, 'Узел1', '18', 'СПб', 'Марата');
INSERT INTO NODE VALUES (2, 'Узел2', '2/А', 'СПб', 'Куйбышева');

INSERT INTO CONNECTOR VALUES (3, 'Коннектор 1.1', 5, 1);
INSERT INTO CONNECTOR VALUES (4, 'Коннектор 1.2', 3, 1);
INSERT INTO CONNECTOR VALUES (5, 'Коннектор 2.1', 6, 2);

INSERT INTO LINK VALUES(6, 0, 0, 3, 5);
INSERT INTO LINK VALUES(7, 1, 3, 3, 5);
INSERT INTO LINK VALUES(8, 1, 4, 4, 5);