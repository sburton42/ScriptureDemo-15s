<%-- 
    Document   : scriptureList
    Created on : Jun 17, 2015, 3:35:42 PM
    Author     : sburton
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scripture List</title>
    </head>
    <body>
        <h1>Favorite Scriptures (JSTL version)</h1>
        <div>

            <c:forEach var="scripture" items="${scriptures}">
                <strong>${scripture.book}</strong> ${scripture.chapter}:${scripture.verse}<br />
            </c:forEach>
        </div>
    </body>
</html>
