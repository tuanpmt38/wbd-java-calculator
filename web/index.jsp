<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 4/26/18
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style type="text/css">
      .login {
        height:250px; width:270px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
    <title>simple calculator</title>
  </head>
  <body>
  <form method="post" action="/calculator">
    <div class="login">
      <h2>Simple Calculator</h2>
      <input type="text" name="first_number" size="30"  placeholder="First operand" />
      <select name="operator">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">Multiplication</option>
        <option value="/">Division</option>
      </select>
      <input type="text" name="second_number" size="30" placeholder="Second operand" />
      <input type="submit" value="Calculate"/>
    </div>
  </form>

  </body>
</html>
