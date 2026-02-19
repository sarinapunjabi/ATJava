import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
}

public static void fill(char[][] a, char ch) {
    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            a[r][c] = ch;
        }
    }
}

public static boolean inside(int r, int c) {
    return r >= 0 && r < 9 && c >= 0 && c < 9;
}

public static void makeMap(char[][] map) {
    fill(map, ' ');
    Random rand = new Random();
    int mines = 0;

    while (mines < 10) {
        int r = rand.nextInt(9);
        int c = rand.nextInt(9);
        if (map[r][c] != 'b') {
            map[r][c] = 'b';
            mines++;
        }
    }

    for (int r = 0; r < 9; r++) {
        for (int c = 0; c < 9; c++) {
            if (map[r][c] == 'b') continue;
            int count = 0;
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    int nr = r + dr;
                    int nc = c + dc;
                    if (inside(nr, nc) && map[nr][nc] == 'b') {
                        count++;
                    }
                }
            }
            if (count > 0) map[r][c] = (char) ('0' + count);
        }
    }
}

public static void printBoard(char[][] board) {
    System.out.println("  0 1 2 3 4 5 6 7 8");
    for (int r = 0; r < 9; r++) {
        System.out.print(r + " ");
        for (int c = 0; c < 9; c++) {
            System.out.print(board[r][c] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[][] map = new char[9][9];
    char[][] board = new char[9][9];

    makeMap(map);
    fill(board, '#');

    while (true) {
        clearScreen();
        printBoard(board);
        System.out.println("type r row col to reveal");
        System.out.println("type f row col to flag");
        System.out.println("type q to quit");

        String cmd = in.next();

        if (cmd.equals("q")) {
            System.out.println("bye");
            break;
        }

        if (cmd.equals("peak")) {
            printBoard(map);
            System.out.println("cheating");
            in.next();
            continue;
        }

        if (!cmd.equals("r") && !cmd.equals("f")) continue;

        int r = in.nextInt();
        int c = in.nextInt();

        if (!inside(r, c)) continue;

        if (cmd.equals("f")) {
            if (board[r][c] == '#') board[r][c] = 'f';
            else if (board[r][c] == 'f') board[r][c] = '#';
        } 
        else if (cmd.equals("r")) {
            if (board[r][c] == 'f' || board[r][c] != '#') continue;

            if (map[r][c] == 'b') {
                clearScreen();
                printBoard(map); 
                System.out.println("you hit a mine");
                break;
            } else {
                board[r][c] = map[r][c];
            }

            int revealedCount = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '#' && board[i][j] != 'f') revealedCount++;
                }
            }

            if (revealedCount == 71) {
                clearScreen();
                printBoard(map);
                System.out.println("you win!!!!!!!");
                break;
            }
        }
    }
    in.close();
}
}