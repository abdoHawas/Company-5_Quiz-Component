INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (0 , 'c++' , 'Ali' , 10 );
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (1 , 'HTML', 'Aida', 10);
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (2 , 'C#' , 'Abdo' , 10);
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (3 , 'Java' ,'Amr' , 10);
COMMIT;

INSERT INTO user(user_id , score , quiz_id) VALUES (0 , 9 , 0);
INSERT INTO user(user_id , score , quiz_id) VALUES (1 , 9 , 0);
INSERT INTO user(user_id , score , quiz_id) VALUES (2 , 9 , 0);
INSERT INTO user(user_id , score , quiz_id) VALUES (3 , 9 , 0);

COMMIT;
