package bugelli;
/**
 * 
 * @author Trish covered by Lauren
 * This is the Bottom!
 * 
 * This class will contain the notification message sent to anyone observing the conductor
 */
public class StateChange {
	private String messageContent;
	
	public StateChange(String m) {
		this.messageContent = m;
	}
	
	public String getMessageContent() {
		return messageContent;
	}
}
