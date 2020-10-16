<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

function addTopic(){
	var id1,name1,description1;
	id1=$("#id").val();
	name1=$("#name").val();
	description1=$("#description").val();
var obj= {id: id1 , name: name1 , description: description1 };

	
	console.log("ddddddddddddddddd'");
	console.log(obj);
	$.ajax({
        url: "/addtopic",
        type: "POST",
 //************************************
        data:  JSON.stringify(obj),
 //************************************
        contentType:"application/json",
       
        	
        	});
	console.log("vvvvvvvvvvvvvvvvvvvvvv");
	$(function(){
	$("button").click(function(){
		  alert("Topic has been added to database");
		});
});}
</script>
<meta charset="ISO-8859-1">
<title>Add a Topic</title>
</head>
<body>
<h2>ADD TOPIC</h2><br><br>
<form  class="form-example">
<div class="form-example">
Topic_Id: <input type="text" name="topic_id" id="id" value = "${topic.id}" required><br><br>
</div>
<div class="form-example">
Topic_Name: <input type="text" name="name" id="name" value = "${topic.name}" required><br><br>
</div>
<div class="form-example">
Topic_Description: <input type="text" name="description" id="description" value = "${topic.description}" required><br><br>
</div>
<div class="form-example">
Add Topic to Database: <button  id="b1" onclick= "addTopic()" ></button>
</div>

<style>
form.form-example {
    display: table;
     text-align: center;
}

div.form-example {
    display: table-row;
}

label, input {
    display: table-cell;
    margin-bottom: 10px;
}

 text-align: center;
 
</style>
</form>

</body>
</html>