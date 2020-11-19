package bugelli;
/**
 * 
 * @author Trish covered by Lauren
 * 
 * Create our musicians and test the communication between conductor 
 * and the music groups watching him/her
 */
public class MyMain {

	public static void main(String[] args) {
		
		//TASK 1: CREATE THE THREE GROUPS
		TromboneGroup tromboneGp = new TromboneGroup();
		TrumpetGroup trumpetGp = new TrumpetGroup();
		TubaGroup tubaGp = new TubaGroup();
		
		//TASK 2: CREATE THE MUSIC CONDUCTOR
		MusicConductor conductor = new MusicConductor();
		
		//TASK 3: ATTACH TROMBONES AND TRUMPETS TO CONDUCTOR SO THEY RECEIVE NOTIFICATIONS
		conductor.attach(tromboneGp);
		conductor.attach(trumpetGp);
		
		//Task 4: TEST THE NOTIFICATION UPDATE
		conductor.notifyUpdate(new StateChange("Appassionato"));
		
		//TASK 5: DETACH TROMBONES GROUP AND ATTACH TUBAS
		conductor.detach(tromboneGp);
		conductor.attach(tubaGp);
		
		//TASK 6: TEST TRUMPETS AND TUBAS RECIEVED NOTIFICATIONS
		conductor.notifyUpdate(new StateChange("Cressendo"));

	}

}
