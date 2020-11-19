package bugelli;
/**
 * 
 * @author  Trish covered by Lauren
 * 
 * Print notifications to the group, this class is an observER!
 */

public class TrumpetGroup implements Observer{
	
	public void update(StateChange m) {
		System.out.println("Notification to Trumpets: " + m.getMessageContent());
	}

}
