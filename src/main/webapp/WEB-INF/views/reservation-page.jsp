<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Reservation Form</title>
</head>
<body>
    <h3>Railway Reservation Form</h3>
    <form:form action="confirmation-page" modelAttribute="reservation" method="post">
        First name: <form:input path="firstName" />
        <br><br>
        Last name: <form:input path="lastName" />
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
