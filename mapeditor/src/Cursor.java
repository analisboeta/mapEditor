import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by ana on 26-10-2016.
 */

/*
When the cursor appears, it will appear as a filled cell in the top left corner of the screen.
At least that's the plan.
 */
public class Cursor extends Cell {

    private Grid grid;



    public Cursor(int col, int row, Grid grid) {
        super(col, row);
        this.grid = grid;
        getCell().fill();

        getCell().setColor(Color.BLUE);

    }


    /*
    FIXME -
    In reality this is a teleport method.
     In an initial stage it wont be used, but it can be adapted to do some interesting things.

    public void cursorTranslate(int targetCol, int targetRow) {
        int initCol = getCol();
        int initRow = getRow();

        getCell().translate((targetCol * CELL_SIZE - initCol * CELL_SIZE), (targetRow * CELL_SIZE - initRow * CELL_SIZE));
    }
*/

    /*
    The next four methods will be used to move the above created cursor into one of the four directions
    Don't forget that the x axis grows rightwards and the y axis grows downwards
     UP A FUNCIONAR!!
     */

    public void moveUp() {

        if (getRow() > 0) {

            getCell().translate(0, -CELL_SIZE);
            setRow(getRow() - 1);

        }
    }

    public void moveDown() { // TODO The keyboard handler will know in which grid it is moving, so deal with that first

        if (getRow() < grid.getRows()) {
//getRow() !=
            getCell().translate(0, CELL_SIZE);
            setRow(getRow() + 1);

        }
    }

    public void moveLeft() {

        if (getCol() > 0) {

            getCell().translate(-CELL_SIZE, 0);
            setCol(getCol() - 1);

        }

    }

    public void moveRight() {

        if (getCol() < grid.getCols() ) {

            getCell().translate(CELL_SIZE, 0);
            setCol(getCol() + 1);

        }
    }
}
