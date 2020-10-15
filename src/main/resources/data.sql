/* Category data */
insert into category (category_name)
    values ('Lifestyle');

insert into category (category_name)
    values ('Mindfulness');

insert into category (category_name)
    values ('Self-esteem');

/* Post data */
insert into post (title, text)
    values ('Title 1', 'Text 1');

insert into post (title, text)
    values ('Title 2', 'Text 2');

insert into post (title, text)
    values ('Title 3', 'Text 3');

insert into post (title, text)
    values ('Title 4', 'Text 4');

insert into post (title, text)
    values ('Title 5', 'Text 5');

/* Image data */
insert into image (url, post_id)
    values ('https://zero-to-three.s3.amazonaws.com/images/3521/a4de1df5-28e7-49fb-86a1-88fe40d32ae6-original.jpg?1566441697', 3);

insert into image (url, post_id)
    values ('https://cdn.mindful.org/focus3.png', 2);

insert into image (url, post_id)
    values ('https://i.pinimg.com/originals/60/7a/eb/607aeb2cd8b5df35ade17c2dcf171ada.png', 1);

/* Join post_cat data */
insert into post_cat (posts_id, categories_id)
    values (1, 2);

insert into post_cat (posts_id, categories_id)
    values (2, 1);

insert into post_cat (posts_id, categories_id)
    values (3, 3);