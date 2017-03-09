package model;

public class Pokemons {
    
    private int pokemonID;
    private String pokemonName;
    private String pokemonType;
    private int pokemonCP;
    private int pokemonCandy;
    
    public Pokemons() {
        this.pokemonID = 0;
        this.pokemonName = "";
        this.pokemonType = "";
        this.pokemonCP = 0;
        this.pokemonCandy = 0;
    }

    public Pokemons(int pokemonID, String pokemonName, String pokemonType, int pokemonCP, int pokemonCandy) {
        this.pokemonID = pokemonID;
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.pokemonCP = pokemonCP;
        this.pokemonCandy = pokemonCandy;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public int getPokemonCP() {
        return pokemonCP;
    }

    public void setPokemonCP(int pokemonCP) {
        this.pokemonCP = pokemonCP;
    }

    public int getPokemonCandy() {
        return pokemonCandy;
    }

    public void setPokemonCandy(int pokemonCandy) {
        this.pokemonCandy = pokemonCandy;
    }

    @Override
    public String toString() {
        return "Pokemons{" + "pokemonID=" + pokemonID + ", pokemonName=" + pokemonName + ", pokemonType=" + pokemonType + ", pokemonCP=" + pokemonCP + ", pokemonCandy=" + pokemonCandy + '}';
    }
    
    
    
}
