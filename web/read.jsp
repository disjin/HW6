<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    <body>
        <h1>Dishuang's Pokemons</h1>
        <hr class="style">
        
        <table>
        <thead>
                    <tr>
                     <th>Pokemon Name</th>
                     <th>Type</th>
                     <th>CP</th>
                     <th>Candy</th>
                     <th>  </th>  
                    </tr>
        </thead>
        </table>
        <%= table %>

        <br><br>
        
        <a href ="add">Add A New Pokemon</a>
    </body>
</html>
