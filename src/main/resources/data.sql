/* Category data */
insert into category (name)
    values ('Lifestyle');

insert into category (name)
    values ('Mindfulness');

insert into category (name)
    values ('Self-esteem');

/* Post data */
insert into post (title, text, image)
    values ('What is Self-Esteem?', 'Text 1', 'https://zero-to-three.s3.amazonaws.com/images/3521/a4de1df5-28e7-49fb-86a1-88fe40d32ae6-original.jpg?1566441697');

insert into post (title, text, image)
    values ('Adventures in Opting Out', 'Text 2', 'https://cdn.mindful.org/focus3.png');

insert into post (title, text, image)
    values ('Self-Acceptance Quotes', 'Text 3', 'https://i.pinimg.com/originals/60/7a/eb/607aeb2cd8b5df35ade17c2dcf171ada.png');

insert into post (title, text, image)
    values ('Psychological Issues of Immigration', 'What is Self-Concept Theory?', 'https://onlineacademiccommunity.uvic.ca/riskybehaviourlab/wp-content/uploads/sites/1974/2020/05/2887075-scaled.jpg');

insert into post (title, text, image)
    values ('What are the benefits of mindfulness', 'Text 5', 'https://cdn.tinybuddha.com/wp-content/uploads/2018/12/Mindful-couple.png');

insert into post (title, text, image)
    values ('Understanding Psychotherapy', 'Text 6', 'https://cdn.mindful.org/lov.png?q=80&fm=jpg&fit=crop&w=1400&h=875');

insert into post (title, text, image)
    values ('Research on Anxiety', 'Text 7', 'https://image.freepik.com/free-vector/man-meditating-nature_113065-185.jpg');

/* Join post_cat data */
insert into post_cat (posts_id, categories_id)
    values (1, 2);

insert into post_cat (posts_id, categories_id)
    values (1, 3);

insert into post_cat (posts_id, categories_id)
    values (2, 1);

insert into post_cat (posts_id, categories_id)
    values (3, 3);

insert into post_cat (posts_id, categories_id)
    values (3, 2);

/* Comment data */
insert into comment (author, comment, datetime, post_id)
    values ('Maria', 'This sucks', '15.10.2020', 2);

insert into comment (author, comment, datetime, post_id)
    values ('Tommy', 'I know right', '15.10.2020', 2);