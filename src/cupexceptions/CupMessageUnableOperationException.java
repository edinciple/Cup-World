package cupexceptions;

import cupobjects.CupMessage;

public class CupMessageUnableOperationException extends CupException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CupMessage sendedMessage;
	String reason;

	public CupMessage getSendedMessage() {
		return sendedMessage;
	}

	public String getReason() {
		return reason;
	}

	public CupMessageUnableOperationException(CupMessage message, String reason) {
		super();
		this.sendedMessage = message;
		this.reason = reason;
	}
}
