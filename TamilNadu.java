/*
Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
– Add unimplemented methods
– Provide your own definitions wherever necessary.
– Have static variable String capital = “Chennai”
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Sugar cane cultivation’ inside this method
– void livingStyle()
– Print ‘Above Average development’ inside this method
– Using class name “India” – access variable ‘capital’ and print the value
– Using class name “TamilNadu” – access variable ‘capital’ and print the value.
– Create instance for “SouthIndia” as below
SouthIndia si = new TamilNadu()
– Observe which methods and variables can be accessed using ‘si’ and note down.
*/
public class TamilNadu extends SouthIndia
{
static String capital = "Chennai";
public static void main(String arg[])
{
System.out.println("TamilNadu Capital"+ TamilNadu.capital);
System.out.println("India Capital"+ India.capital);
SouthIndia si = new TamilNadu();

//using the object "si", we can access methods defined in class SouthIndia 
//and methods defined in child class TamilNadu
si.cultivate();// TamilNadu overrididing SouthIndia class// cannot access from SouthIndia
si.livingStyle();//TamilNadu overrididing SouthIndia class
si.dress();
si.speakLanguage();
si.eat();


}
public void dress()
{
System.out.println("dress method");
}
public void speakLanguage()
{
System.out.println("speaklanguage method");
}
public void eat()
{
System.out.println("eat method");
}

public void cultivate()
{
System.out.println("Rice and Sugar cane cultivation in TamilNadu");
}
public void livingStyle()
{
System.out.println("Above Average development in TamilNadu");
}
}