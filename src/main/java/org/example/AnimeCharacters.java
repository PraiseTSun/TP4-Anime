package org.example;

public class AnimeCharacters {
    private Character[] characters;


    public AnimeCharacters() {
        this.characters = null;
    }

    public AnimeCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }
}
