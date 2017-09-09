<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<form:form method="POST" modelAttribute="book" action="${pageContext.request.contextPath}/book/add.html">
<table>
    <tbody>
        <tr>
            <td>Title:</td>
            <td><form:input path="title" autocomplete="off" /></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><form:input path="author" autocomplete="off" /></td>
        </tr>
        <tr>
            <td colspan="2">

                <form:checkboxes path="tags"
                items="${tags}"
                itemLabel="description"
                itemValue="id"/>

            </td>
        </tr>
        <tr>
            <td><input type="submit" value="Add" /></td>
            <td><input type="button" onclick="location.href = '${pageContext.request.contextPath}/index'" value="Cancel"/></td>
        </tr>
    </tbody>
</table>

</form:form>
</html>