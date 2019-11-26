public class ChessPiece {

    private Type type;
    private Color color;
    private int row;
    private int col;
    private boolean inPlay;

    public ChessPiece(Type type, Color color, int row, int col) {
        this.type = type;
        this.color = color;
        this.row = row;
        this.col = col;
        this.inPlay = true;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }

    public boolean isInPlay() {
        return inPlay;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public String toString() {
        String str = "";
        str += this.getColor() + " " + this.getType();// + " at (";
        //str += this.getRow() + ", " + this.getCol() + ") is in play: ";
        //str += this.isInPlay();
        return str;
    }

    public static void main(String[] args) {

        ChessPiece p1 = new ChessPiece(Type.Pawn, Color.White, 1, 2);
        System.out.println(p1.toString());
    }
}