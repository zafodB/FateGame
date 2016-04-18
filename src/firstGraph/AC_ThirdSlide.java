package firstGraph;

public class AC_ThirdSlide extends Variables {
	private String PIC_PATH = "resources/1.jpg";
	private String FILE_PATH = "resources/texts/AC_Text.txt";	

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
	public Properties getTextSetUp(){
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

	Properties textSetUp = new Properties(Variables.calculatePos(6, true), Variables.calculatePos(24, false), Variables.calculatePos(18, true), Variables.calculatePos(8, false));
	
	int buttonCount = 2;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(1 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, ">> exit", BUTTON_FONT, false);
		butn[1] = new Properties(Variables.calculatePos(27 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, next , BUTTON_FONT, false);
//		butn[1] = new Properties(Variables.calculatePos(27 , true), Variables.calculatePos(30 , false), 300, 60, next , BUTTON_FONT, true);
		}
	
}
