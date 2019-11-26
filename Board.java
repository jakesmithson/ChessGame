public class Board {

    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ChessPiece[][] board;
    private int rows;
    private int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new ChessPiece[rows][cols];
    }

    public ChessPiece getPieceAt(int row, int col) {
        return board[row][col];
    }

    public void placePiece(ChessPiece piece) {
        board[piece.getRow()][piece.getCol()] = piece;
    }

    public boolean spaceIsOccupied(int row, int col) {
        if(board[row][col] != null) {
            return true;
        }
        return false;
    }

    public boolean isOnBoard(int row, int col) {
        if(row < 1 || row > rows || col < 1 || col > cols) {
            return false;
        }
        return true;
    }

    public void printBoard() {
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(board[r][c] == null) {
                    System.out.print("Empty Piece ");
                }
                else {
                    System.out.print(board[r][c] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Board b = new Board(HEIGHT, WIDTH);
        ChessPiece p1 = new ChessPiece(Type.Pawn, Color.White, 2, 2);
        b.placePiece(p1);
        b.printBoard();

    }
}