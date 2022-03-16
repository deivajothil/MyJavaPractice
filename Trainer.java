public class Trainer
{
	 String dept, institute;
	 private int salary = 10000; 
public static void main(String arg[])
{
	Trainer trainerKumar = new Trainer("Java", "Payilagam" );
	trainerKumar.training( "CSE", "Payilagam" );
		
System.out.println(trainerKumar.salary);
System.out.println(trainerKumar.dept);
System.out.println(trainerKumar.institute);
}
	public Trainer(String dept, String institute)
	{
		this.dept = dept;
		this.institute = institute;
	}
	public int getter_salary()
	{
		return(this.salary);
	}
	public void training(String dept, String institute)
	{
	System.out.println("Training");

		
	}
}