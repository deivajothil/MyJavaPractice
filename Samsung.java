/*
3) Create class called ‘Samsung’ with main method as sub class of FactoryDemo.
– Add unimplemented methods
– Add static variable int price and set value as 5000.
– Create instance for Samsung class called sam
– Access browse() method using sam instance.
– Access price variable using sam instance.
– Observe which method is called and note down.
*/
public class Samsung extends FactoryDemo
{
public static void main(String args[])
{

Samsung sam = new Samsung();

sam.browse();
System.out.println("price"+ sam.price);
}
public void providePattern()
{
System.out.println("providePattern");
}

public void verifyFingerPrint()
{
System.out.println("verifyFingerPrint");
}

public void receiveCall()
{
System.out.println("receiveCall");
}

public void sendMessage()
{
System.out.println("sendMessage");
}

public int call(int seconds)
{
System.out.println("Calling");
return(1);
}

}