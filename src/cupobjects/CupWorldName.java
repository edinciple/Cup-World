package cupobjects;

import java.io.Serializable;

public class CupWorldName implements Serializable {
	
	String[] parts;
	
	public CupWorldName(String[] parts)
	{
		this.parts = parts;
	}

	public String[] getParts() {
		return parts;
	}
	
	public String getPart(int index)
	{
		return this.parts[index];
	}
}
