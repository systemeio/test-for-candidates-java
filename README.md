# Test Task Systemeio
Реализовать обработку запроса с полями int price и String paymentProcessor
## Setup

1. Убедитесь, что Docker установлен.

2. Клонируйте репозиторий:
   ```zsh
   git clone https://github.com/systemeio/test-for-candidates-java.git
   cd <directory_name>
3. Постройте Docker образ:
    ```zsh
   docker build -t my-payment-project .
4. Запустите контейнер:
    ```zsh
   docker run -p 8080:8080 my-payment-project
5. Проект будет доступен по адресу http://localhost:8080
