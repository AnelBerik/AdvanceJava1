<%--
  Created by IntelliJ IDEA.
  User: w2
  Date: 12.09.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" ></script>
    <style>
        body{
            background-color: lightsalmon;
        }
        /*form {*/
        /*    width : 30%;*/
        /*    margin: 0px auto;*/
        /*    padding: 20px;*/
        /*    border: 1px solid #B0C4DE;*/
        /*    background  : white;*/
        /*    border-radius: 0px 0px 10px 10px;*/
        /*}*/

        .input-collect {
            margin : 10px 0px 10px 0px;
        }

        .input-collect label{
            display : block;
            text-align: left;
            margin: 3px;
        }
        .input-collect input {
            height : 30px;
            width : 90%;
            padding: 5px 10px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid grey;
        }
        .btn {
            padding: 10px;
            font-size: 15px;
            color: white;
            border: none;
            border-radius: 5px;
            background: #5F9EA0;

        }
    </style>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>
<%
    if(session.getAttribute("username")==null) {
        response.sendRedirect("login.jsp");
    }
%>
<h1>Hello! ${username}</h1>
<%--<form method="post" action="/jsp/page-2.jsp">--%>
<%--    <div class="input-collect">--%>
<%--        Username<input type="text" name="name" ><br>--%>
<%--        Email<input type="email" name="email" ><br>--%>
<%--        Phone_number<input type="text" name="phone" ><br>--%>
<%--    </div>--%>
<%--    <input type="submit">--%>
<%--</form>--%>
<form method="post" action="basicServlet">
    <input type="submit" value="ForwardList">
</form>
<form method="post" action="goalKeeper">
    <input type="submit" value="goalKeeper">
</form>
<p style="font-size: 25px; font-family: 'Comic Sans MS'">Welcome to my SportStatistics website, I think you will find useful information about your favorite team, and increase your sport thinking skills.
    You can find information about forwards and goalkeepers, site will have improvements...</p>
<hr>
<h1 style="font-weight: bold">Basic information about KHL</h1>
<p style="font-size: 23px; font-family: Arial">The Kontinental Hockey League (KHL) (Russian: Континентальная хоккейная лига (КХЛ), Kontinental'naya hokkeynaya liga) is an international professional ice hockey league founded in 2008. It comprises member clubs based in Belarus (1), China (1), Finland (1), Latvia (1), Kazakhstan (1), and Russia (18) for a total of 23. It is widely considered to be the premier professional ice hockey league in Europe and Asia, and second in the world behind the National Hockey League.[7][8] The KHL has the third-highest average attendance in Europe with 6,121 spectators per game in the regular season,[9] and the highest total attendance in Europe with 5.32 million spectators in the regular season.[10]</p>
<hr>
<h1 style="font-weight: bold">Basic information about NHL</h1>
<p style="font-size: 23px; font-family: Arial">The National Hockey League (NHL; French: Ligue nationale de hockey—LNH) is a professional ice hockey league in North America, currently comprising 31 teams: 24 in the United States and 7 in Canada. The NHL is considered to be the premier professional ice hockey league in the world,[3] and one of the major professional sports leagues in the United States and Canada. The Stanley Cup, the oldest professional sports trophy in North America,[4] is awarded annually to the league playoff champion at the end of each season.</p>
<%@include file="footer.jsp"%>
</body>
</html>
