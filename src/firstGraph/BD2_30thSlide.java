package firstGraph;

import java.awt.Color;

public class BD2_30thSlide extends Variables { // go with Jon
	private String PIC_PATH = "resources/30(Yousif)(puzzle).JPG";
	private String FILE_PATH = "resources/texts/riddle3.txt";

	private String hint = "There should be a hint, but we were too lazy to actually provide it.";

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
	Properties textSetUp = new Properties(Variables.calculatePos(9, true),
			Variables.calculatePos((float) 0.5, false), 700, 550, Color.WHITE);

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
				Variables.calculatePos(1, false), 500, 500, hint,
				TEXT_FONT, false);
	}
}