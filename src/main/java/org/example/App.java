package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnimeHandler animeHandler = new AnimeHandler();
        try {
            animeHandler.animeMain();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
