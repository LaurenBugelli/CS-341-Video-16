package bugelli;
/**
 * 
 * @author Trish covered by Lauren
 *
 *contains three abstract methods, nothing is implimented because interfaces are not concrete classes
 */
public interface Subject {
	public void attach(Observer o);
	
	public void detach(Observer o);
	
	public void notifyUpdate(StateChange m);
	
}
