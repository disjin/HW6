package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pokemons;

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
    
    try{
        Properties props = new Properties (); //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        Class.forName(driver);
        conn = DriverManager.getConnection(url, username, passwd);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void doSearch(String pokemonName) {
    
        try {
            String query = "SELECT * FROM pokemons WHERE UPPER(pokemonName) LIKE ? ORDER BY pokemonID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + pokemonName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table>";
        
        table += "<tr>"; 
        table += "<th>Pokemon ID</th>";
        table += "<th>Pokemon Name</th>"; 
        table += "<th>Pokemon Type</th>";
        table += "<th>CP</th>";
        table += "<th>Candy</th>"; 
        table += "<th>  </th>";
        table += "</tr>";
          
        try {
            while(this.results.next()){
                
                Pokemons pokemon = new Pokemons();
                pokemon.setPokemonID(this.results.getInt("pokemonID"));
                pokemon.setPokemonName(this.results.getString("pokemonName"));
                pokemon.setPokemonType(this.results.getString("pokemonType"));
                pokemon.setPokemonCP(this.results.getInt("pokemonCP"));
                pokemon.setPokemonCandy(this.results.getInt("pokemonCandy"));
                
                table += "<tr>";
                table += "<td>";
                table += pokemon.getPokemonID();
                table += "</td>";
                
                table += "<td>";
                table += pokemon.getPokemonName();
                table += "</td>";
                
                table += "<td>";
                table += pokemon.getPokemonType();
                table += "</td>";
                
                table += "<td>";
                table += pokemon.getPokemonCP();
                table += "</td>";
                
                table += "<td>";
                table += pokemon.getPokemonCandy();
                table += "</td>";
                
                table += "<td>";
                table += "<a class=updateLink href=update?pokemonID=" + pokemon.getPokemonID() + "> Update </a>" + "<a class=deleteLink href=delete?pokemonID=" + pokemon.getPokemonID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
                
            }
            

        
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";    
        return table;
    }
}
