<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="io.java.springboot.coursecontroller.Course" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

console.log(document.getElementById("'+value.id+'"));
	

</script>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>


<body>
<h2>The select Course=>Lessons</h2>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
   text-align: center;
    background-color: #f1f1c1;
   
}  
</style>
<table style="width:100%" id ="lessonsTABLE">
  <caption><b>Displaying Lessons </b></caption>
   
  <tr >
   <th>LessonID</th>
    <th>LessonName</th>
    <th>LessonDescription</th>
  </tr>
  	
</table>
</body>
</html>