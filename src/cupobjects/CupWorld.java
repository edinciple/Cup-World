package cupobjects;
import java.util.Hashtable;
import java.io.Serializable;

public class CupWorld implements Serializable {
	
	Hashtable<CupWorldName, CupObject> database;
	
	public CupWorld() {
		this.database = new Hashtable<CupWorldName, CupObject>();
	}
	
	public CupObject GetObject(CupWorldName name) {
		return this.database.get(name);
	}
	
	public void SetObject(CupWorldName name, CupObject value) {
		if(this.database.containsKey(name) && value == null) {
			this.database.remove(name);
		}
		else {
			this.database.put(name, value);
		}
	}
}
