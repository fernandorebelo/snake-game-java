package br.com.fertech.snakegame.core;

import java.util.LinkedList;

public class Snake {

	private LinkedList<Cell> snakePartList = new LinkedList<>();
	private Cell head;
	
	public Snake(Cell initPos) {
		head = initPos;
		snakePartList.add(head);
		head.setCellType(CellType.SNAKE_NODE);
	}
	
	public void grow() {
		snakePartList.add(head);
	}
	
	public void move(Cell nextCell) {
		System.out.println("Snake is moving to "
				+ nextCell.getCol() + " "
				+ nextCell.getRow());
		Cell tail = snakePartList.removeLast();
		tail.setCellType(CellType.EMPTY);
		
		head = nextCell;
		head.setCellType(CellType.SNAKE_NODE);
		snakePartList.addFirst(head);
	}
	
	public boolean checkCrash(Cell nextCell) {
		System.out.println("Going to check for crash");
		for(Cell cell : snakePartList) {
			if(cell == nextCell) {
				return true;
			}
		}
		return false;
	}

	public Cell getHead() {
		return head;
	}

	public void setHead(Cell head) {
		this.head = head;
	}

	public void setSnakePartList(LinkedList<Cell> snakePartList) {
		this.snakePartList = snakePartList;
	}
	
}
