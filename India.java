/*
1) Create an abstract class called ‘India’
– Have below abstract methods
– void speakLanguage()
– void eat()
– void dress()
– Have static variable String capital = “New Delhi”
– Have below Constructor
public India(String primeMinister)
{
System.out.println(“our Prime Minister is” + primeMinister);
}
*/
public abstract class India
{
static String capital = "New Delhi";
public India(String primeMinister)
	{
System.out.println("our Prime Minister is"+ primeMinister);
}
public abstract void speakLanguage();
public abstract void eat();
public abstract void dress();

}