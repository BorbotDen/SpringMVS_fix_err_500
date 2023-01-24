##Fix errror:500 in SpringMVC app
Проходя курс по Spring от Наиля Алишева, застрял на [уроке 21.](https://www.youtube.com/watch?v=D58pIymCew4) 
###Прблема:
Перестало запускаться приложение. При старте сервера выкидывало ошибку:
```
Err:500  
Servlet.init() for servlet [dispatcher] threw exception
```
###Решение:
Собрал  проект Наиля, и использовал папку lib с jar-файлами
 [target/spring-mvc-app1/WEB-INF/lib](https://github.com/BorbotDen/SpringMVS_fix_err_500/tree/CRUD/target/spring-mvc-app1/WEB-INF/lib)
Заменил папку __lib__ в своем проекте. И все заработало, даже с моим же __pom.xml__
