package cupobjects;
import java.io.Serializable;

public interface CupObjectRoute extends Serializable {
	
	CupObject recievedMessage(CupObject self, CupMessage message);
	
}
