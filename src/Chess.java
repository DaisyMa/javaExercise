class Game{
    Game(int i){
        System.out.println("Game()");
    }
//    Game(){}
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i); //当父类的构造函数有参数时，子类构建器首先，必须明确调用父类的构造方法
        System.out.println("BoardGame()");
    }
}

public class Chess extends BoardGame {
    Chess(){
        super(11);
        System.out.println("Chess()");
    }

    public static void main(String args[]){
        Chess x=new Chess();
    }

}
