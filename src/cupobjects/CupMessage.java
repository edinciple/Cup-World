package cupobjects;
import java.io.Serializable;

public class CupMessage implements Serializable{

	CupObject verb;
	CupObject[] nouns;
	public CupObject getVerb() {
		return verb;
	}
	public CupObject[] getNouns() {
		return nouns;
	}
	
	public CupMessage(CupObject verb, CupObject[] nouns) throws Exception
	{
		if(!(verb.getRealObject() instanceof CupSymbol))
			throw new Exception("Verb should point a symbol");
		
		this.verb = verb;
		this.nouns = nouns;
	}
}
