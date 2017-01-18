/**
 * Created by ana on 26-10-2016.
 */
public class Grid {


    Cell[][] grid;
    Cursor cursor; // historia de amor
    int cols;
    int rows;

        public Grid(int cols, int rows){
            this.cols = cols;
            this.rows = rows;
            this.grid = new Cell[cols][rows];

                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < rows; j++) {

                    grid[i][j]= new Cell(i,j);
                        grid[i][j].drawCell();
                }

            }
            this.cursor = new Cursor (2,2, this);
        }

        public Cell getCell(int col, int row){

            return grid[col][row];
        }

    private void drawGrid(){

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {

                grid[i][j].drawCell();
            }
        }
// String str ="tttttt";
   //     int index = str.indexOf(search);
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
