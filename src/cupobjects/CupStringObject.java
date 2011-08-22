package cupobjects;

public class CupStringObject extends CupLifelessObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String value;

	public String getValue() {
		return value;
	}

	public CupStringObject(String value) {
		super();
		this.value = value;
	}
}
