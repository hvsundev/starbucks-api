<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<style>
	body {
		width: 500px;
		margin: 10% auto;
		border: 1px solid black;
	}

	.title {
		text-align: center;
		padding: 5px;
	}
	
	ul {
		margin: 0;
		padding: 0;
	}
	
	li {
		border: 1px solid #EAEAEA;
		background: #F6F6F6;
		margin: 5px;
		padding: 4px;
		list-style: none;
	}
	
	.btn_x {
		float: right;
		margin-left: 5px;
	}
	
	.textBox {
		text-align: center;
		margin: 12px;
	}
	
	.todoList {
		margin-bottom: 1.5rem;
	}
</style>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2 class="title">TODO LIST</h2>
	<div class="textBox">
		<input type="text" placeholder="오늘 할 일을 입력하세요.">
		<input type="button" value="+">
	</div>
	<div class="todoList">
		<input type="text" class="inputText" disabled="disabled">
		<ul>
			<c:forEach var="todoList" items="${todoList}" varStatus="i">
				<li class="todoidx${todoList.idx}">
					${todoList.text}
					<input type="button" class="btn_x" value="삭제">
					<input type="button" class="btn_x" value="수정">
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>