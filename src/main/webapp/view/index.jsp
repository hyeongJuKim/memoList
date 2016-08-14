<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<style>
	ul {
	    /*border: 1px solid gray;*/
	}
	li {
		list-style:none;
	    border-bottom: 1px dotted gray;
	    border: 1px solid gray;
	    margin-bottom: 3px;
	    padding: 5px;
	}
	li:last-child {
	    /*border:none;*/
	}

	a:link {text-decoration: none; color: black;}
	a:visited {text-decoration: none; color: black;}
	a:active {text-decoration: none; color: black;}
	a:hover {text-decoration: none; color: black;}
	</style>
	
	<title>나의 메모장</title>

</head>
<body>
	
	<ul>
		<a href="">
			<li class="lili">
				<strong><div>제목</div></strong>
				<div>내용</div>
			</li>
		</a>
		<a href="">
			<li>
				<strong><div>제목</div></strong>
				<div>내용</div>
			</li>
		</a>
	</ul>
	
</body>
</html>