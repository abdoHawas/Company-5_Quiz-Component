INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (0 , 'c++' , 'Ali' , 10);
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (1 , 'HTML', 'Aida', 10);
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (2 , 'C#' , 'Abdo' , 10);
INSERT INTO quiz(quiz_id , category , professor , grade) VALUES (3 , 'Java' ,'Amr' , 10);
COMMIT;

INSERT INTO user(user_id , name , score , quiz_id) VALUES (0 , 'Abdo' , 9 , 0);
INSERT INTO user(user_id , name , score , quiz_id) VALUES (1 , 'Ali ' , 9 , 0);
INSERT INTO user(user_id , name , score , quiz_id) VALUES (2 , 'Amr ' , 9 , 0);
INSERT INTO user(user_id , name , score , quiz_id) VALUES (3 , 'Aida' , 9 , 0);

COMMIT;
