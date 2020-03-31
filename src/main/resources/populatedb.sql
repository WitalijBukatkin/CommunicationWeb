/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

--
--

INSERT INTO Node VALUES (1, 'Узел1', '18', 'СПб', 'Марата');
INSERT INTO Node VALUES (2, 'Узел2', '2/А', 'СПб', 'Куйбышева');

INSERT INTO Connector VALUES (3, 'Коннектор 1.1', 5, 1);
INSERT INTO Connector VALUES (4, 'Коннектор 1.2', 3, 1);
INSERT INTO Connector VALUES (5, 'Коннектор 2.1', 6, 2);

INSERT INTO Link VALUES (6, 0, 0, 3, 5);
INSERT INTO Link VALUES (7, 1, 3, 5, 3);
INSERT INTO Link VALUES (8, 1, 4, 4, 5);