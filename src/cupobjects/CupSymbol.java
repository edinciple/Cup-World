package cupobjects;
import java.io.Serializable;

public class CupSymbol implements Serializable{

	public CupSymbol(String mark)
	{
		this.mark = mark;
	}
	
	String mark;

	public String getMark() {
		return mark;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof CupSymbol && ((CupSymbol)obj).mark.equals(this.mark))
		{
			return true;
		}
		return false;
	}
}
