package package1.singleton;

import java.util.Set;

public class GameEngine {
    private int hp = 100;
    private String characterName = "";

    //private static instance of this class
    private static GameEngine gameEngineInstance = new GameEngine();

    //private constructor
    private GameEngine(){

    }
    //public static method
    public static GameEngine gameInstance(){
        if(gameEngineInstance == null){
            gameEngineInstance = new GameEngine();
        }
        return gameEngineInstance;
    }

    public void run(){
        while (true){
            //waiting for user input
            //change the state of game
            //render
        }
    }
}
