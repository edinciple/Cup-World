package cupobjects;

import java.io.Serializable;

public class CupWorldName extends CupObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CupSymbolObject[] parts;
	
	public CupWorldName(CupSymbolObject[] parts)
	{
		this.parts = parts;
	}

	public CupSymbolObject[] getParts() {
		return parts;
	}
	
	public CupSymbolObject getPart(int index)
	{
		return this.parts[index];
	}
}
