package cupobjects;
import java.io.Serializable;

public final class CupMessage extends CupObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CupSymbolObject verb;
	CupObject[] nouns;
	
	public CupSymbolObject getVerb() {
		return verb;
	}
	public CupObject[] getNouns() {
		return nouns;
	}
	
	public CupMessage(CupSymbolObject verb, CupObject[] nouns)
	{
		this.verb = verb;
		this.nouns = nouns;
	}
}
