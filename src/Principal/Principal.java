package Principal;

import br.com.fertech.snakegame.core.Board;
import br.com.fertech.snakegame.core.Cell;
import br.com.fertech.snakegame.core.Game;
import br.com.fertech.snakegame.core.Snake;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Starting the game...");
		Cell initPos = new Cell(0,0);
		Snake initSnake = new Snake(initPos);
		Board board = new Board(20,20);
		Game newGame = new Game(initSnake, board);
		newGame.setGameOver(false);
		newGame.setDirection(Game.DIRECTION_RIGHT);
		
		for (int i = 0; i < 5; i++) {
            if (i == 2)
            	newGame.getBoard().generateFood();
            	newGame.update();
            if (i == 3)
            	newGame.setDirection(Game.DIRECTION_DOWN);
            if (newGame.isGameOver())
                break;
        }
		
	}

}
