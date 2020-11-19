package bugelli;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Trish covered by Lauren
 *	the conductor is an observED subject so it must implement the subject interface
 */
public class MusicConductor implements Subject{
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer o) {
		observers.add(o);
	}
	
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	public void notifyUpdate(StateChange sc) {
		for(Observer o: observers) {
			o.update(sc);
		}
	}
}
