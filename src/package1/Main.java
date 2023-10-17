package package1;

import package1.singleton.GameEngine;
import package1.singleton.GameEngineEnum;

public class Main {

    public static void main(String[] args) {
        //cannot create GameEngine object using constructor -> private constructor
//        GameEngine gameEngine = new GameEngine();

        GameEngine gameEngine = GameEngine.gameInstance();

        GameEngine gameEngine1 = GameEngine.gameInstance();

        System.out.println(gameEngine == gameEngine1);

        //difficulties
        //1. multithreading
        //solution -> call constructor on the instance of GameEngine class

        GameEngineEnum gameEngineEnum = GameEngineEnum.INSTANCE;
        GameEngineEnum gameEngineEnum1 = GameEngineEnum.INSTANCE;
        System.out.println(gameEngineEnum==gameEngineEnum1);
    }
}
