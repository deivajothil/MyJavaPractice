/*
Create an abstract class called ‘SouthIndia’
– Make this class as sub class of ‘India’
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Wheat cultivation’ inside this method
– void livingStyle()
– Print ‘Average development’ inside this method
*/
public abstract class SouthIndia extends India
{
// constructor must be defined in sub class to invoke super class constructor explicitly..
public SouthIndia()
{
super("Modi");
}
public void cultivate()
{
System.out.println("Rice and Wheat cultivation in SouthIndia");
}
public void livingStyle()
{
System.out.println("Average development in SouthIndia");
}
}