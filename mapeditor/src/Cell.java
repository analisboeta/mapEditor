import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by ana on 26-10-2016.
 */
public class Cell {

    public static final int CELL_SIZE = 20;

    private Rectangle cell;
    private int col;
    private int row;
    private boolean isFilled;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        cell = new Rectangle(col * CELL_SIZE, row * CELL_SIZE, CELL_SIZE, CELL_SIZE);
        this.isFilled = false;
        cell.setColor(Color.BLACK);
    }

    public void drawCell() {
        cell.draw();
    }

    public void fillCell() {

        if (isFilled == false) {
            //cell.setColor(Color.GREEN);
            cell.fill();
            //cell.setColor(Color.BLACK);
            //cell.draw();
            isFilled = true;
        } else {
            cell.setColor(Color.BLACK);
            cell.draw();
            isFilled = false;
        }
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Rectangle getCell() {
        return cell;
    }

    public void setCell(Rectangle cell) {
        this.cell = cell;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
