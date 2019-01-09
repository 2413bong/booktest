<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<button onclick="user('user1')">user1</button>
<button onclick="user('user2')">user2</button>
<button onclick="user('user3')">user3</button>

<script>
function user(user){
	
	$.ajax({
        url: '/bookselect/'+user,
        type: 'GET',
        dataType: "json",
        success: function(res) {
        	alert(JSON.stringify(res))
           
        }
    });
}

</script>
</body>
</html>
