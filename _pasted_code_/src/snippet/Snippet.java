package snippet;

public class Snippet {
	<!DOCTYPE html>
	<html lang="ja" xmlns:th="http://www.thymeleaf.org">
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	名前を入力してください<br>
	<form action="result-request-scope.html"
			th:action="@{/request-scope/input-name}"method="post">
			<input type="text" name="name">
			<button>送信</button>
	</form>		
	</body>
	</html>
}

