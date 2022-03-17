<%-- 
    Document   : outcome
    Created on : Mar 15, 2022, 6:42:21 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>outcome page</title>
    </head>
    <body>
        <h1>outcome</h1>
        
         <%
          String guessNum =(String)request.getAttribute("guessNum");
          String randomNum =(String)request.getAttribute("randomNum");
          String outcome=(String)request.getAttribute("outcome");
          
         %>
         <div>
             <p>
                 the guess number is: <%=guessNum%><br>
                 the computer generate number:<%=randomNum%><br>
                 outcome is: <%=outcome%>
                 
             </p>
             <p>
                 click <a href="index.html"> here </a> to go back to the main page
             </p>
         </div>
    </body>
</html>
