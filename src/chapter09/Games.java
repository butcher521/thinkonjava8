package chapter09;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:11 2020/5/25
 */
public class Games {
    public static void playGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        game.move();
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
interface Game{
    boolean move();
}
interface GameFactory{
    Game getGame();
}
class Checkers implements Game{
    private int moves=0;
    private static final int MOVES=3;

    @Override
    public boolean move() {
        System.out.println("象棋移动部署"+moves);
        return ++moves!=MOVES;
    }
}
class CheckersFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Checkers();
    }
}
class Chess implements Game{
    private int moves=0;
    private static final int MOVES=4;

    @Override
    public boolean move() {
        System.out.println("跳棋移动部署"+moves);
        return ++moves!=MOVES;
    }
}
class ChessFactory implements GameFactory{
    @Override
    public Game getGame() {
        return new Chess();
    }
}


