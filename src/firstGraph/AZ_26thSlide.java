package firstGraph;

public class AZ_26thSlide extends Variables {
	private String PIC_PATH = "resources/26(Choice).jpg";
	private String FILE_PATH = "resources/texts/AZ_Text.txt";

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
				Variables.calculatePos(30, false), 300, 60, ">> exit",
				super.BUTTON_FONT, false);
		butn[1] = new Properties(Variables.calculatePos(5, true),
				Variables.calculatePos(21, false), 260, 60, "I stay with Jon",
				super.CHOICE_FONT, false);
		butn[2] = new Properties(Variables.calculatePos(5, true),
				Variables.calculatePos(19, false), 260, 60, "I go with Yusif",
				super.CHOICE_FONT, false);
	}

}
