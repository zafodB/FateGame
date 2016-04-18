package firstGraph;

public class AA_FirstSlide extends Variables {
	private String PIC_PATH = "resources/20151029_172413.jpg";
	private String FILE_PATH = null;

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
		return null;
	}

	@Override
	public Properties getTextSetUp() {
		return null;
	}

	@Override
	public Properties getButtonSetUp(int id) {
		// TODO Auto-generated method stub
		return butn[id];
	}

	int buttonCount = 3;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(3 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, ">> exit",super.BUTTON_FONT);
		butn[1] = new Properties(Variables.calculatePos(3 , true), Variables.calculatePos(28 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, ">> start game",super.BUTTON_FONT);
		butn[2] = new Properties(Variables.calculatePos(22 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, "(C) P1 group 2015",super.BUTTON_FONT);
	}
	
	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return null;
	}

}
