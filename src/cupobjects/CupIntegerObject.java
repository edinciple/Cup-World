package cupobjects;

public class CupIntegerObject extends CupLifelessObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int value;

	public CupIntegerObject(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
