import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {

	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;
	private int initialXPosition, initialYPosition;

	// Getter - this returns the variable xPosition
	public int getxPosition() {
		return xPosition;
	}

	// setter - take the parameter (newxPosition) and assign it to the xPosition
	// variable. The 'this' keyword is used to refer to the current object.
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	// add code to see if the new position is outside the screen
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
		if (xPosition < 0) {
			xPosition = 0;
		} else if (xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}

	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
		if (yPosition < 0) {
			yPosition = 0;
		} else if (yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}

	// *method used once so set both values in same method, no need to Get
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}

	// method reset the x and y position of the object to the initial x and y
	// positions.
	public void resetToInitialPosition() {
		
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int Width) {
		this.width = Width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColour() {
		return colour;
	}

	public void setColour(Color colour) {
		this.colour = colour;
	}

	public Rectangle getRectangle() {
		return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
	}
}

