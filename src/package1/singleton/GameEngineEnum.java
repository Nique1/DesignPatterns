package package1.singleton;

public enum GameEngineEnum {
    INSTANCE("Carol");

    private int hp = 99;
    private String userName = "";

    private GameEngineEnum(String userName){
        this.userName = userName;
    }
    public void run(){
        while (true){
            //waiting for user input
            //change the state of game
            //render
        }
    }


}
