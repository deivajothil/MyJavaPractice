/*
Create a sub class “SQLTrainer” under “Trainer”.
– Have main method in it.
– Create instance ram for this class
– Handle with proper super class constructor
– Access parent class instance variables
– Call parent class instance method training()
– Access salary using getter method in parent class

*/
public class SQLTrainer extends Trainer
{

public static void main(String arg[])
{
SQLTrainer ram = new SQLTrainer("Java", "Payilagam");
ram.training("Java", "Payilagam");
int sal = ram.getter_salary();
System.out.println(sal);
}
public SQLTrainer(String dept, String institute)
	{
	super(dept, institute);
	System.out.println("Training");
		
	}
}