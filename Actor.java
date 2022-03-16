/* 1) Create an interface called ‘Actor’
– Have variables boolean makeUpRequired
– Assign ‘true’ value for ‘makeUpRequired’
– Have variable .
– Assign value as “Chennai” to address.
– Have void methods act(), dance(), sing()
*/

public interface Actor
{
	//static variables must be initialized in interface
    boolean makeUpRequired = true;
	String address = "Chennai";
	public void act();
	public void dance();
	public void sing();
}