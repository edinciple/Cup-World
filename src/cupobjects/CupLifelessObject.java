package cupobjects;

import cupexceptions.CupMessageUnableOperationException;

public class CupLifelessObject extends CupObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final CupObject send(CupMessage message) throws CupMessageUnableOperationException {
		throw new CupMessageUnableOperationException(message, "Lifeless Object"); 
	}
}
