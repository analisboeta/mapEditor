import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by ana on 26-10-2016.
 */
public class KeyboardStuff implements KeyboardHandler {

    private Grid grid;

    public KeyboardStuff(Grid grid) {
        keyboardInit();
        this.grid = grid;
    }


    public void keyboardInit() {
        Keyboard kb = new Keyboard(this);

        /*
        *For each keyboard key, the set up will always be the same.
        * 1) new event
        * 2)
        *
         */
        KeyboardEvent goUp = new KeyboardEvent();
        goUp.setKey(KeyboardEvent.KEY_W);
        goUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent goDown = new KeyboardEvent();
        goDown.setKey(KeyboardEvent.KEY_S);
        goDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent goLeft = new KeyboardEvent();
        goLeft.setKey(KeyboardEvent.KEY_A);
        goLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent goRight = new KeyboardEvent();
        goRight.setKey(KeyboardEvent.KEY_D);
        goRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent fillCell = new KeyboardEvent();
        fillCell.setKey(KeyboardEvent.KEY_SPACE);
        fillCell.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        kb.addEventListener(goUp);
        kb.addEventListener(goDown);
        kb.addEventListener(goLeft);
        kb.addEventListener(goRight);
        kb.addEventListener(fillCell);

    }

    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_W:
                grid.getCursor().moveUp();
                break;

            case KeyboardEvent.KEY_S:
                grid.getCursor().moveDown();
                break;

            case KeyboardEvent.KEY_A:
                grid.getCursor().moveLeft();
                break;

            case KeyboardEvent.KEY_D:
                grid.getCursor().moveRight();
                break;

            case KeyboardEvent.KEY_SPACE:
                grid.getCell(grid.getCursor().getCol(), grid.getCursor().getRow()).fillCell();
                break;

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
