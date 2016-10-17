<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- form action=controller?action=save" method="post">
Name of Employee<br>
<input type="text" name="name"><br>
Phone No of employee<br>
<input type="text" name="phoneNo"><br>
Date of Birth of Employee<br>
<input type="text" name="dob" placeholder="dd/mm/yyyy"><br>
Date of joining of Employee<br>
<input type="text" name="doj" placeholder="dd/mm/yyyy"><br>
Address of Employee<br>
<input type="text" name="address"><br>

</form> -->

    <div align="center">
        <form:form action="controller?action=save" method="post" commandName="addEmp">
        
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>User Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>address</td>
                    <td><form:input path="address" /></td>
                </tr>
                <tr>
                    <td>phone</td>
                    <td><form:input path="phoneNo" /></td>
                </tr>
                <tr>
                    <td>Date of Birth (mm/dd/yyyy):</td>
                    <td><form:input path="dob" /></td>
                </tr>
                 <tr>
                    <td>Date of joining (mm/dd/yyyy):</td>
                    <td><form:input path="doj" /></td>
                </tr>
                
                <tr> 
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>


<script language="javascript">

</script>
</body>
</html>