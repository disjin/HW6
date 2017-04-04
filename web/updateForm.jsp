<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Pokemons"%>
<% Pokemons pokemon = (Pokemons) request.getAttribute("pokemon");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update A Pokemon</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>
        <h1>Update A Pokemon Record</h1>
        <hr class="style">
        
        <form name="updateForm" action="updatePokemon" method="get">
            
            <table>
                <tr>
                    <td class="right">
                      Pokemon ID:  
                    </td>
                    <td class="left">
                      <input type="text" name="id" value="<%= pokemon.getPokemonID() %>" />
                    </td>
                </tr>
                <tr>
                    <td class="right">
                      Pokemon Name:  
                    </td>
                    <td class="left">
                      <input type="text" name="name" value="<%= pokemon.getPokemonName() %>" />
                    </td>
                </tr>
                <tr>
                    <td class="right">
                      Type:  
                    </td>
                    <td class="left">
                      <input type="text" name="type" value="<%= pokemon.getPokemonType() %>" />
                    </td>
                </tr>
                <tr>
                    <td class="right">
                      CP: 
                    </td>
                    <td class="left">
                      <input type="text" name="cp" value="<%= pokemon.getPokemonCP() %>" />
                    </td>
                </tr>
                <tr>
                    <td class="right">
                       Candy:  
                    </td>
                    <td class="left">
                       <input type="text" name="candy" value="<%= pokemon.getPokemonCandy() %>" />
                    </td>
                </tr>                
            </table>
            
            <br>
            <input type="reset" name="reset" value="Clear" /> 
            <input type="submit" name="submit" value="Update" />            
        </form>
    </body>
</html>
