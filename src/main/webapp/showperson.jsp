<%@ page language="java" contentType="text/html; charset=utf-8"
     pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>person list</title>
    </head>
    <body>
        <table>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
            <c:forEach items="${persons}" var="person">
                <tr>
                    <td>${person.id}</td>
                    <td>${person.name }</td>
                    <td>${person.age }</td>
                </tr>
            </c:forEach>
        </table>
        <form action="addPerson" method="post">
                      序号: <input type="text" name="id"   id="number"></input>
        </br>              
                      姓名：<input type="text" name="name" id="name"></input>
        </br>
                      年龄：<input type="text" id="age" name="age"></input>
        </br>
              <button type="submit">提交</button>              
        </form>
    </body>
</html>