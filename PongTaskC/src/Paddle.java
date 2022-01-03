import java.awt.Color;

public class Paddle extends Sprite {

	private static final int DISTANCE_FROM_EDGE = 40;
	private static final  Color PADDLE_COLOUR = Color.RED; 
	private static final int PADDLE_WIDTH = 10; 
	private static final int PADDLE_HEIGHT = 250; 
	
	public Paddle (Player player, int panelWidth, int panelHeight) {
		setColour(PADDLE_COLOUR);
		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
				
		int xPos;
        if(player == Player.One) {
            xPos = DISTANCE_FROM_EDGE;
        } else {
            xPos = panelWidth - DISTANCE_FROM_EDGE - getWidth();
        }
        setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
        		
		resetToInitialPosition();
}




}
