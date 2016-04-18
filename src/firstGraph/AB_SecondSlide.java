package firstGraph;

import java.awt.Color;

public class AB_SecondSlide extends Variables {
	private String PIC_PATH = "resources/20151029_172413.jpg";
	private String FILE_PATH = "resources/texts/AB_text.txt";

	@Override
	public String getPIC_PATH() {
		return PIC_PATH;
	}

	@Override
	public String getFILE_PATH() {
		return FILE_PATH;
	}

	@Override
	public Properties getTextSetUp() {
		return textSetUp;
	}

	@Override
	public Properties getImputSetUp() {
		return null;
	}

	@Override
	public Properties getButtonSetUp(int id) {
		// TODO Auto-generated method stub
		return butn[id];
	}

	@Override
	public int getButtonCount() {
		return buttonCount;
	}

	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return null;
	}

	Properties textSetUp = new Properties(Variables.calculatePos(6, true),
			Variables.calculatePos(3, false), Variables.calculatePos(20, true),
			Variables.calculatePos(17, false), Color.RED);

	int buttonCount = 2;
	Properties butn[] = new Properties[buttonCount];

	{
		butn[0] = new Properties(Variables.calculatePos(2, true),
				Variables.calculatePos(30, false),
				Variables.DEFAULT_BUTTON_WIDTH,
				Variables.DEFAULT_BUTTON_HEIGHT, ">> exit", this.BUTTON_FONT,
				false);
		butn[1] = new Properties(Variables.calculatePos(27, true),
				Variables.calculatePos(30, false),
				Variables.DEFAULT_BUTTON_WIDTH,
				Variables.DEFAULT_BUTTON_HEIGHT, next, this.BUTTON_FONT, false);
	}

}
