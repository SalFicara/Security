/**
 * 
 * Firel Alarm  class
 * Subclass of Alarm class
 *
 */
public class FireAlarm extends Alarm 
{

	/**
	 * Constructor that takes two parameters
	 *  
	 * @param name of the alarm
	 * @param priority is the number of the alarm's priority
	 */
	public FireAlarm(String name, int priority) 
	{
		super(name, priority);
	}

	/**
	 * @return the name of Fire Alarm class
	 */
	public String getName() 
	{
		return super.getName();
	}
	
	/**
	 * @return a string of message telling the name of which alarm is going off
	 */
	public String goesOff() 
	{
		String alert;
		alert = "This is the"+ getName() +"This is prioty number" + super.getPriority() +"."
			   +" Please follow " + getName() + " drill.";

		return alert;
	}
	 
}

