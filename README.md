# SpringBootRegAuthExample

Spring Boot Security application for registration and authorization. Application code took from this article: https://habr.com/ru/post/482552/

This article will look at building a simple web application using Spring Boot and Spring Security. The application will implement the registration of new users and authorization, restricting access to the site's pages depending on the user's role.
The main goal of the article is to show how you can restrict access to various pages of the site for users with different roles.

What will the application be?

Website with the following pages:

pages available to all users: home, registration and login;
page available for registered users: news;
page available to the administrator.

What will we use

JDK 8+;
IntelliJ Idea;
Spring (Spring Boot, Spring MVC, Spring Security);
Hibernate;
JSP;
PostgreSQL.

SQL requests:
First:

INSERT INTO public.t_role(id, name)
  VALUES (1, 'ROLE_USER'), (2, 'ROLE_ADMIN'); 

Second:

INSERT INTO public.t_user_roles(user_id, roles_id)
  VALUES (1, 2);
