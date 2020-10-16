<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="io.java.springboot.topiccontroller.Topic" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
function showcourse(obj){
	var value = obj.value;
	//console.log(value);
	$(function(){
		$.getJSON("/welcome/topics?id="+ obj.value, function(courselist){
			$('#rows').remove();
			var course_data = '';
			course_data += '<tbody id = "rows">';
			$.each(courselist, function(key, value){
			
			
				course_data += '<tr>';
				course_data += '<td>'+value.id+'</td>';
				//console.log("/welcome/courses?id="+ value.id);
				var x= "/welcome/courses/lessons?id=";
				var y = value.id;
				var result = x+y;
				//console.log(result);
				
				
				
				course_data += '<td><a href="'+result+'" ><b><button id = "'+value.id+'" onClick="showLesson(this)">'+value.name+'</button></b></a></td>';
				
				
			    course_data += '<td>'+value.description+'</td>';
			    
			    course_data += '</tr>';
			    
			   
			});
			 course_data += '</tbody>';
			 $('#coursesTABLE').append(course_data);
			
			
			//$('')
		});
		});
	
		
		/*$.ajax({
		type : "GET",
		url : "/welcome/topics?id="+ obj.value,
		success : function(data) {
			console.log("---------");
			console.log(JSON.stringify(data));
			
		}});*/
	
};


</script>
<meta charset="ISO-8859-1">
<title>Welcome to JSP</title>
</head>


<body>
<h2>The select Topic=>Course</h2>
<form method = "POST">
 <% 
 List<Topic> list = (List) request.getAttribute("topics"); %>
 <select id = "topics" onChange="showcourse(this)">
 <option value="" selected disabled >Select a Topic</option>
 <% for(Topic topic : list){ %>
 
    <option value=<%=topic.getId() %> ><%= topic.getName()%></option>
 <%}%>
 </select>

</form>
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
<table style="width:100%" id ="coursesTABLE">
  <caption><b>Displaying Courses </b></caption>
   
  <tr >
   <th>CourseID</th>
    <th>CourseName</th>
    <th>CourseDescription</th>
   
  </tr>
  	
</table>


</body>
</html>