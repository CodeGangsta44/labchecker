
insert into groups(name) values
('IP-71'),
('IP-81');

insert into students(first_name, last_name, id_group, github_link, telegram_id) VALUES
('Yurii', 'Matora', 1, 'https://github.com', 123),
('Mark', 'Zubach', 2, 'https://github.com', 321);

insert into subjects(name) values
('OOP'),
('Algorithms');

insert into teachers(first_name, last_name, email, telegram_id) VALUES
('Iryna', 'Mukha', 'iip@iip.iip', 111),
('Olena', 'Khalus', 'ook@ook.ook', 222);

insert into courses(id_teacher, id_subject, id_group, googlesheet_link) VALUES
(1, 1, 1, 'link #1'),
(1, 2, 1, 'link #2'),
(2, 2, 2, 'link #3');

insert into labs(id_course, number, theme) VALUES
(1, 1, 'Inheritance'),
(1, 2, 'Composition'),
(1, 3, 'Polymorphism'),
(2, 1, 'Arrays'),
(3, 1, 'Merge sort'),
(3, 2, 'Insertion sort');

insert into variants(id_lab, number, testfile_path) VALUES
(1, 10, 'path #1'),
(1, 20, 'path #2'),
(2, 30, 'path #3'),
(2, 40, 'path #4'),
(3, 50, 'path #5'),
(3, 60, 'path #6'),
(4, 70, 'path #7'),
(4, 80, 'path #8'),
(5, 90, 'path #9'),
(6, 100, 'path #10');

insert into lab_results(id_lab, id_student, id_variant, github_repository_link, mark) VALUES
(1, 1, 1, 'link #1', 100),
(2, 1, 2, 'link #2', 55),
(4, 1, 7, 'link #3', 85),
(5, 2, 9, 'link #4', 77),
(6, 2, 10, 'link #5', 99);