/*
Create class named as ActorSivakumar with main method
– implement interface ‘Actor’ to this class.
– Give your own definitions for methods from interface
– Have static variable String address.
– Assign value to address as “Coimbatore”.
– Have instance method ‘speaking()’ with void return data type.
– Create instance for ActorSivakumar as below
ActorSivakumar as = new ActorSivakumar(65, “Audi Car”)
– Handle with proper Constructor
– Access all the methods from ActorSivakumar class
– Access variable address and print the value
– Create another instance of interface ‘Actor’ using dynamic binding approach
Actor ac = new Sivakumar();
– Handle with proper Constructor
– Access methods in ActorSivakumar class.
– Access variable address using ‘ac’ intance and print the value
– Observe and note down the difference between two instances
*/
public class ActorSivakumar implements Actor
{
static String address = "Coimbatore";
public static void main(String arg[])
{
ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
Actor ac = new ActorSivakumar(65, "Audi Car");//this is dynamic binding

//Accessing with child
as.speaking();
as.act();
as.dance();
as.sing();
//Accessing with parent
//ac.speaking(); -- cannot access child method with parent ref.
ac.act();
ac.dance();
ac.sing();


}
public ActorSivakumar(int age, String vachile)
{
System.out.println(age + vachile);


}
public void speaking()
{
System.out.println("Speaking");
}
public void act()
{
System.out.println("Acting");
}	public void dance()
	{
	System.out.println("dancing");
}
	public void sing()
	{
		
System.out.println("sing");
}
}

