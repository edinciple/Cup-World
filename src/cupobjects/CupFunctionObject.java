package cupobjects;

import java.lang.reflect.Method;

import cupexceptions.CupMessageUnableOperationException;

public class CupFunctionObject extends CupObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String FUNCTIONPREFIX = "function_";

	public CupObject send(CupMessage message) throws CupMessageUnableOperationException{
		Class<? extends CupFunctionObject> gettedClass = this.getClass();
		Method gettedmethod = null;
		for(Method method : gettedClass.getMethods()) {
			if(method.getName().startsWith(FUNCTIONPREFIX) &&
					method.getName().substring(FUNCTIONPREFIX.length()).equals(message.getVerb().getMark()))
			{
				gettedmethod = method;
				break;
			}
		}
		if(gettedmethod == null)
		{
			throw new CupMessageUnableOperationException(message, "Unable to find function");
		}
		else
		{
			try {
				return (CupObject)gettedmethod.invoke(this, ChangeTArrayToObjectArray(message.getNouns()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new CupMessageUnableOperationException(message, "An exception happened when running a function");
			}
		}
	}
	
	private <T> Object[] ChangeTArrayToObjectArray(T[] typeArray)
	{
		Object[] result = new Object[typeArray.length];
		for(int i = 0;i<typeArray.length;i++)
		{
			result[i] = typeArray[i];
		}
		return result;
	}
}
