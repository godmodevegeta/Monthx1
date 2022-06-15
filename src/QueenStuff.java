import java.util.*;

public class QueenStuff {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];    // initiate a square board of length "n"
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';      // traverse through each cells and place "empty" identifier
        List<List<String>> res = new ArrayList<List<String>>();     // contains the set of possible boards with no conflicts
        dfs(board, 0, res);     // retireve answer!!
        return res;
    }

    private static void dfs(char[][] board, int colIndex, List<List<String>> res) {
        if (colIndex == board.length) {
            res.add(construct(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (validate(board, i, colIndex)) {
                board[i][colIndex] = 'Q';
                dfs(board, colIndex + 1, res);
                board[i][colIndex] = '.';
            }
        }
    }

    private static boolean validate(char[][] board, int x, int y) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < y; j++) {
                if (board[i][j] == 'Q' && (x + j == y + i || x + y == i + j || x == i))
                    return false;
            }
        }

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(6));
    }
}
