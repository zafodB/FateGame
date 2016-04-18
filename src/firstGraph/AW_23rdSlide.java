package firstGraph;

import java.awt.Color;

public class AW_23rdSlide extends Variables { // Puzzle page
	private String PIC_PATH = "resources/23.jpg";
	private String FILE_PATH = "resources/texts/riddle1.txt";

	private String hint = "If you add numerals of the answer, the result is 12.";

	@Override
	public String getPIC_PATH() {
		return PIC_PATH;
	}

	@Override
	public String getFILE_PATH() {
		return FILE_PATH;
	}

	@Override
	public int getButtonCount() {
		return buttonCount;
	}

	@Override
	public Properties getTextSetUp() {
		return textSetUp;
		// return null;
	}

	@Override
	public Properties getImputSetUp() {
		return imputFieldSetUp;
	}

	@Override
	public Properties getButtonSetUp(int id) {
		// TODO Auto-generated method stub
		return butn[id];
	}

	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return hint;
	}

	Properties imputFieldSetUp = new Properties(
			Variables.calculatePos(13, true),
			Variables.calculatePos(27, false), 300, 60);
	Properties textSetUp = new Properties(Variables.calculatePos(12, true),
			Variables.calculatePos(22, false), Variables.calculatePos(7, true),
			Variables.calculatePos(3, false), Color.WHITE);

	int buttonCount = 3;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(1, true),
				Variables.calculatePos(30, false), 300, 60, ">> exit",
				super.BUTTON_FONT, false);
		butn[1] = new Properties(Variables.calculatePos(27, true),
				Variables.calculatePos(30, false), 300, 60, ">> enter",
				BUTTON_FONT, true);
		butn[2] = new Properties(Variables.calculatePos(1, true),
				Variables.calculatePos(1, false), 500, 500, hint, TEXT_FONT,
				false);
	}
}