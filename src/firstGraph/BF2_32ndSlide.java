package firstGraph;

public class BF2_32ndSlide extends Variables { //go with Jon
	private String PIC_PATH = "resources/33(Yousif).JPG";
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
	public Properties getImputSetUp(){
		return null;
	}
	
	@Override
	public Properties getTextSetUp(){
		return textSetUp;
	}
	
	@Override
	public Properties getButtonSetUp(int id) {
		// TODO Auto-generated method stub
		return butn[id];
	}
	
	@Override
	public String getHint() {
		// TODO Auto-generated method stub
		return null;
	}

//	Properties textSetUp = new Properties(Variables.calculatePos(13 , true), Variables.calculatePos(3 , false), Variables.calculatePos(10, true), Variables.calculatePos(11, false));
	
	int buttonCount = 2;
	Properties butn[] = new Properties[buttonCount];
	{
		butn[0] = new Properties(Variables.calculatePos(1 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, ">> exit", super.BUTTON_FONT, true);
		butn[1] = new Properties(Variables.calculatePos(27 , true), Variables.calculatePos(30 , false), Variables.DEFAULT_BUTTON_WIDTH, Variables.DEFAULT_BUTTON_HEIGHT, next , BUTTON_FONT, false);
	}
}
