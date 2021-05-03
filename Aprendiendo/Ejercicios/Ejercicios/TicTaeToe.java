package Ejercicios;

import java.util.*;


public class TicTaeToe {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	public static void main(String[] args) {

		char[][] board = {  { ' ', '|', ' ', '|', ' ' }, 
							{ '-', '+', '-', '+', '-' }, 
							{ ' ', '|', ' ', '|', ' ' },
							{ '-', '+', '-', '+', '-' },
							{ ' ', '|', ' ', '|', ' ' }, };

		printGameBoard(board);

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your placement (1-9)");
			int playerPos = sc.nextInt();
			while (playerPositions.contains(playerPos)|| cpuPositions.contains(playerPos)) {
				System.out.println("Position taken, enter a correc position");
				playerPos=sc.nextInt();
			}
			

			System.out.println(playerPos);

			placePiece(board, playerPos, "player");
			String result = checkWinner();
			if (result.length()>0) {
				System.out.println(result);
				break;
			}

			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while (playerPositions.contains(cpuPos)|| cpuPositions.contains(cpuPos)) {
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(board, cpuPos, "cpu");

			printGameBoard(board);
			
			result = checkWinner();
			if (result.length()>0) {
				System.out.println(result);
				break;
			}
			System.out.println(result);
		}

	}

	public static void printGameBoard(char[][] board) {
		for (char[] cs : board) {
			System.out.println(cs);
		}
		System.out.println();
	}

	public static void placePiece(char[][] board, int pos, String user) {
		
		char symbol = ' ';
		if (user.equals("player")) {
			symbol = 'x';
			playerPositions.add(pos);
		} else if (user.equals("cpu")) {
			symbol = 'o';
			cpuPositions.add(pos);
		}

		switch (pos) {
		case 1:
			board[0][0] = symbol;
			break;
		case 2:
			board[0][2] = symbol;
			break;

		case 3:
			board[0][4] = symbol;
			break;

		case 4:
			board[2][0] = symbol;
			break;

		case 5:
			board[2][2] = symbol;
			break;
		case 6:
			board[2][4] = symbol;
			break;
		case 7:
			board[4][0] = symbol;
			break;

		case 8:
			board[4][2] = symbol;
			break;
		case 9:
			board[4][4] = symbol;
			break;
		default:
			break;

		}

	}
	public static String checkWinner() {
		
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4,5,6);
		List botRow = Arrays.asList(7,8,9);
		List leftCol = Arrays.asList(1,4,7);
		List midCol = Arrays.asList(2,5,8);
		List rightCol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(7,5,3);
		
		List<List> winningConditions = new ArrayList<>();
		winningConditions.add(topRow);
		winningConditions.add(midRow);
		winningConditions.add(botRow);
		winningConditions.add(leftCol);
		winningConditions.add(midCol);
		winningConditions.add(rightCol);
		winningConditions.add(cross1);
		winningConditions.add(cross2);
		
		for (List list : winningConditions) {
			if (playerPositions.containsAll(list)) {
				return "Congratulations you won";
			}else if (cpuPositions.containsAll(list)) {
				return "Cpu wins ";
			}else if(playerPositions.size()+cpuPositions.size()==9) {
				return "Cat";
			}
			
		}
		
		return "";
	}
}
