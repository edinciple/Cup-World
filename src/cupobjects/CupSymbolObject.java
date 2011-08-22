package cupobjects;
import java.io.Serializable;

public class CupSymbolObject extends CupLifelessObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CupSymbolObject(String mark)
	{
		this.mark = mark;
	}
	
	String mark;

	public String getMark() {
		return mark;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof CupSymbolObject && ((CupSymbolObject)obj).mark.equals(this.mark))
		{
			return true;
		}
		return false;
	}
}
