«Simbirsoft Тестовое задание»
Предварительно необходимо иметь/завести почтовый ящик в google (или yandex, если будут проблемы с автоматизацией). 
Отправить на этот ящик несколько писем с темой «Simbirsoft Тестовое задание» с любым содержимым (можно отправить
с этого же ящика самому себе).
В задании необходимо:
1) Использовать Java, подключить библиотеку Selenium Webdriver;
2) С помощью Selenium открыть браузер, открыть страницу выше указанной почты(google.com/yandex.ru) и авторизоваться;
3) С помощью Selenium определить сколько во входящих нашлось писем с темой «Simbirsoft Тестовое задание»;
4) С помощью Selenium и интерфейса почты написать/отправить письмо на этот же почтовый ящик, 
в тексте которого указать найденное в шаге 3 количество писем. Указать тему письма «Simbirsoft Тестовое задание.
<Фамилия>», где <Фамилия> - это Ваша фамилия;
5) Оформить эти действия в виде теста.
   При выполнении работы необходимо использовать следующие технологии:
6) Selenium GRID (тесты запускать через GRID обязательно)
7) Использовать паттерн проектирования автотестов Page Object
8) Реализовать формирование отчетов о пройденных тестах через Allure

Grid roles
Selenium Grid состоит из нескольких компонентов. В зависимости от ваших потребностей вы можете запустить 
каждый из них отдельно или несколько одновременно, используя роль Grid.
Standalone
Автономный режим это объединение всех компонентов, с точки зрения пользователя они выполняются как одно целое. 
Полнофункциональный Grid в одном месте доступен после запуска в автономном режиме.
Автономный режим также является самым простым режимом для развертывания Selenium Grid. 
По умолчанию сервер будет прослушивать http://localhost:4444, и этот URL-адрес вы должны указывать в своих RemoteWebDriver тестах. 
Сервер обнаружит доступные драйверы, которые он может использовать из системы PATH. 

java -jar selenium-server-4.1.0.jar standalone