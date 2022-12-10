<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Congratulations</title>
</head>
<body>
    <#list congratulations as congratulation>
        <p>Автор: ${congratulation.author}</p>
        <p>Поздравление: ${congratulation.content}</p>
        <br>
    </#list>

    <br>

    <form action="http://localhost:8080/congratulations"  method="post">
        <label>
            <input type="text" maxlength="32" placeholder="Автор" name="author" >
        </label>
        <label>
            <input type="text" max="512" placeholder="Поздравление" name="content" >
        </label>
        <input type="submit" value="Сохранить">
    </form>
</body>
</html>