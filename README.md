## Fix errror:500 in SpringMVC app
Проходя курс по Spring от Наиля Алишева, застрял на [уроке 21.](https://www.youtube.com/watch?v=D58pIymCew4) 
### Прблема:
Перестало запускаться приложение. При старте сервера выкидывало ошибку:
```
Err:500  
Servlet.init() for servlet [dispatcher] threw exception
```
### Решение:
Использовал pom.xml Наиля. Дело в совместимостях версий.

Нужно использовать clean если вносите изменения в maven!!!
