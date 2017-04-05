<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Pokemons</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <div class="wrap"> <!--div to hold all other divs -->
            
            <%@ include file="includes/header.jsp" %>
            
            <%@ include file="includes/menu.jsp" %>
            
            <div class="main"> <!--main div-->    
                
                <h1>My Pokemons Database</h1>
                
                <hr class="style">
        
                <a href="read">View All Pokemons</a>
                <br> <br>
                <a href="search.jsp">Search Pokemons</a>
                
            </div> <!--close main div -->
        
        <%@ include file="includes/footer.jsp" %>
        
        </div> <!-- close the wrap div -->   
    </body>
</html>
