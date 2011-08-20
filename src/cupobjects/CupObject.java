package cupobjects;
import java.io.Serializable;


public class CupObject implements Serializable {
	
	Object realObject;
	CupObjectRoute route;
	
	public CupObject(Object realObject, CupObjectRoute route)
	{
		this.realObject = realObject;
		this.route = route;
	}
	
	public CupObject()
	{
		this(null, null);
	}
	
	public Object getRealObject()
	{
		return this.realObject;
	}
	
	public void setRealObject(Object realObject)
	{
		this.realObject = realObject;
	}
	
	public CupObjectRoute getRoute()
	{
		return this.route;
	}
	
	public void setRoute(CupObjectRoute route)
	{
		this.route = route;
	}
	
	public CupObject send(CupMessage message)
	{
		return this.getRoute().recievedMessage(this, message);
	}
}
