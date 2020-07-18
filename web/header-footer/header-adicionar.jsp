<%--
  Created by IntelliJ IDEA.
  User: Edilson A. Cuamba
  Date: 30-May-20
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>
<head>
    <title><%=title%></title>
    <link rel="stylesheet" href="../lib/css/jquery-ui.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

    <style>
        *{margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "LEMON MILK Medium";
        }
        .container{
            width: 966px;
            margin: 0 auto;
            font-family: "LEMON MILK Medium";
        }

        footer{
            font-family: "Devil Breeze";
            display: block;
            width: 100%;
            background-color: #28ff8e;
            font-size: 0.9em;
text-align: center;

        }
        footer div p{
            padding: 15px;
        }
        /*Header*/

        header{
            width: 100%;
            background-color: #28ff8e;
            color: white;
            font-size: 1.3em;font-family: "LEMON MILK Light";
            text-align: center;
        }
    </style>
    <link rel="stylesheet" href="<%=css%>">
    <script src="../lib/js/jquery-1.12.4.js"></script>
    <script src="../lib/js/jquery-ui.js"></script>
</head>
<body>
<header>

    <h1><%=title%></h1>

</header>