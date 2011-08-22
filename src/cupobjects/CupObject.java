package cupobjects;

import java.io.Serializable;
import cupexceptions.CupException;
import cupexceptions.CupMessageUnableOperationException;

public class CupObject implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CupObject send(CupMessage message) throws CupException
	{
		throw new CupMessageUnableOperationException(message, "Not defined");
	}
}
