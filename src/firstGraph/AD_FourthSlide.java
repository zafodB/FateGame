package firstGraph;

@SuppressWarnings("static-access")
public class AD_FourthSlide extends Variables {
	private String PIC_PATH = "resources/2.jpg";
	private String FILE_PATH = "resources/texts/AD_Text.txt";

	
	
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
		return null;
	}

	@Override
	public Properties getButtonSetUp(int id) {
		return butn[id];
	}

	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return null;
	}
	
	Properties textSetUp = new Properties(Variables.calculatePos(6, true),
			Variables.calculatePos(24, false),
			Variables.calculatePos(18, true), Variables.calculatePos(8, false));

	int buttonCount = 3;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(1, true),
				Variables.calculatePos(30, false),
				Variables.DEFAULT_BUTTON_WIDTH,
				Variables.DEFAULT_BUTTON_HEIGHT, ">> exit", super.BUTTON_FONT,
				false);
		butn[1] = new Properties(Variables.calculatePos(5, true),
				Variables.calculatePos(21, false), 230, 60, "Study",
				super.CHOICE_FONT, false);
		butn[2] = new Properties(Variables.calculatePos(5, true),
				Variables.calculatePos(19, false), 230, 60, "Play game",
				super.CHOICE_FONT, false);
		// butn[3] = new Properties(Variables.calculatePos(22 , true),
		// Variables.calculatePos(16 , false), 30, 30, "   " , arrowPath);
	}

}
