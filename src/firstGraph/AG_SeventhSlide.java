package firstGraph;

public class AG_SeventhSlide extends Variables {
	private String PIC_PATH = "resources/5.jpg";
	private String FILE_PATH = "resources/texts/AG_Text.txt";

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
	public Properties getImputSetUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getTextSetUp() {
		return textSetUp;
	}

	@Override
	public Properties getButtonSetUp(int id) {
		// TODO Auto-generated method stub
		return butn[id];
	}

	Properties textSetUp = new Properties(Variables.calculatePos(6, true),
			Variables.calculatePos(24, false),
			Variables.calculatePos(18, true), Variables.calculatePos(8, false));

	int buttonCount = 3;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(1, true),
				Variables.calculatePos(30, false), 300, 60, ">> exit",
				super.BUTTON_FONT, false);
		butn[1] = new Properties(Variables.calculatePos(27, true),
				Variables.calculatePos(30, false), 300, 60, next, BUTTON_FONT,
				false);
		butn[2] = new Properties(Variables.calculatePos(23, true),
				Variables.calculatePos(30, false), 30, 30, "   ", arrowPath);
	}

	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return null;
	}
}
