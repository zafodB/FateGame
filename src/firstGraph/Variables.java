package firstGraph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class Variables { // Abstract class variables. All the different
									// properties and variables are declared
									// (but in most cases not initiated) here.
									// Names of the variables speak for
									// themselves.

	public static int BUTTON_FONT_SIZE = 32;
	public Font BUTTON_FONT = new Font("Trebuchet MS", Font.PLAIN,
			BUTTON_FONT_SIZE);

	public static int TEXT_FONT_SIZE = 36;
	public Font TEXT_FONT = new Font("Leelawadee UI Semilight", Font.PLAIN,
			TEXT_FONT_SIZE);
	public static final Font CHOICE_FONT = new Font("Leelawadee UI", Font.BOLD,
			BUTTON_FONT_SIZE + 1);
	public static final Font CHOICE_FONT_SELECTED = new Font("Leelawadee UI",
			Font.BOLD, BUTTON_FONT_SIZE + 3);

	public static final Color DEF_TEXT_COLOR = Color.WHITE;
	public static final Color DEF_TEXTAREA_COLOR = Color.BLACK;
	public static final Color DEF_INPUTAREA_COLOR = new Color((float) 0.663 ,(float) 1,(float) 0.549) ;
	public static final Color ERR_INPUTAREA_COLOR = new Color((float) 1 ,(float) 0.549,(float) 0.549) ;

	public static int DEFAULT_BUTTON_WIDTH;
	public static int DEFAULT_BUTTON_HEIGHT;

	public static final String arrowPath = "resources/Red_Triangle.png";// The
																		// red-arrow
																		// button
																		// uses
																		// icon
																		// specified
																		// in
																		// this
																		// path.
	public static final String next = ">> next"; // caption of "next" button.

	public static int calculatePos(float square, boolean xAxis) {// This method
																	// is used
																	// by every
																	// slide to
																	// calculate
																	// relative
																	// position
																	// of
																	// components.
		if (xAxis) {
			return (int) (square * (Main.dimX / 32));
		} else {
			return (int) (square * (Main.dimY / 32));
		}
	}

	public abstract Properties getTextSetUp();// MainWindow's methods access
												// properites of text set-up
												// using this method. (getter)

	public abstract Properties getImputSetUp(); // Input setup getter.

	public abstract Properties getButtonSetUp(int id);// Button setup getter
														// (button index as
														// parameter)

	public abstract String getPIC_PATH();// getter for path to picture.

	public abstract String getFILE_PATH();// Getterfot path to text file.

	public abstract int getButtonCount();// Getter for the dimension of butn[]
											// array. Dimension of butn[] array
											// is de facto number of buttons.

	public abstract String getHint(); // getter for hint text. Practically only
										// used, if there is a hint.

	protected String FILE_PATH = null;
	protected String PIC_PATH = null;

	protected int TIMER_SPEED;

	protected String text = "";
	protected String hint = null;

	protected BufferedReader bufRead;
	protected FileReader filRead;
	protected File myFile;
	protected ImageIcon myImageIcon;
	protected Image image1;
	protected JLabel label;
	protected JButton button[] = new JButton[6];
	protected JTextArea textArea;
	protected JTextField inputField;
	protected Properties textSetUp;

	protected int buttonCount;

	protected class Properties {// very important class. Used for storing
								// properties of buttons, text arrays and input
								// fields.
		int posX;
		int posY;
		int width;
		int heigth;
		String caption;
		Font font;
		Color someColor;
		String icon;
		boolean visible;

		// Ordinary button and text area constructor
		public Properties(int posX, int posY, int width, int heigth) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = null;
			this.font = TEXT_FONT;
			this.someColor = null;
			this.icon = null;
			this.visible = true;
		}

		// Text area with custom color constructor
		public Properties(int posX, int posY, int width, int heigth, Color color) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = null;
			this.font = TEXT_FONT;
			this.someColor = color;
			this.icon = null;
			this.visible = true;
		}

		// Button with custom font properties constructor
		public Properties(int posX, int posY, int width, int heigth,
				String caption, Font font) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = caption;
			this.font = font;
			this.icon = null;
			this.visible = true;
		}

		// Button with custom font and visibility properties constructor
		public Properties(int posX, int posY, int width, int heigth,
				String caption, Font font, boolean visible) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = caption;
			this.font = font;
			this.icon = null;
			this.visible = visible;
		}

		// Button with custom font and font color properties constructor
		public Properties(int posX, int posY, int width, int heigth, Font font,
				Color fontColor) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = null;
			this.font = font;
			this.someColor = fontColor;
			this.icon = null;
			this.visible = true;
		}

		// Button with image properties constructor
		public Properties(int posX, int posY, int width, int heigth,
				String caption, String icon) {
			this.posX = posX;
			this.posY = posY;
			this.width = width;
			this.heigth = heigth;
			this.caption = caption;
			this.font = null;
			this.icon = icon;
			this.visible = true;
		}

	}

	static String answers[][] = new String[3][5]; // Two dimensional array
													// storing valid riddle
													// answers.
	{
		answers[0][0] = "Filipko";//testing purposes
		answers[0][1] = "84";
		answers[0][2] = "eightyfour";
		answers[0][3] = "eighty-four";
		answers[0][4] = "Eightyfour";

		answers[1][0] = "Filipko";//testing purposes
		answers[1][1] = "53";
		answers[1][2] = "fiftythree";
		answers[1][3] = "Fiftythree";
		answers[1][4] = "fifty-three";

		answers[2][0] = "1 7 7";
		answers[2][1] = "7,1,7";
		answers[2][2] = "7 7 1";
		answers[2][3] = "7,7,1";
		answers[2][4] = "1,7,7";

	}
}
