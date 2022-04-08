import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDemo ab = new ArrayDemo();
		//ab.getMarks();
		ab.student();
	}

	private void student() {
		int max=0,min=0,index_min=0,index_max=0;
		// TODO Auto-generated method stub
		String[] subjects = {"Tamil","English","Maths","Science","Social Science"} ;
		int [] marks = {90,57,87,78,67};
		max = marks[0];
		min = marks[0];
		for(int i = 1;i < marks.length; i++)
		{
			if (marks[i] > max)
			{
				max = marks[i];
				index_max= i;
			}
			if (marks[i] < min)
			{
			min = marks[i];
			index_min= i;
			}
			
		}
		System.out.println("Scored highest mark "+max +" in subject " + subjects[index_max]);
		System.out.println("Scored lowest mark "+min +" in subject " + subjects[index_min]);
	}

	private void getMarks() {
		// TODO Auto-generated method stub
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		int[] marks = new int[count];
		int total =0;
		System.out.println("enter value");
				for (int i=0; i<marks.length; i++)
				{
					System.out.println("read values");
					marks[i]=sc.nextInt();
					total = total + marks[i];
				}
		for (int i=0; i>marks.length; i++)
			
			{
			System.out.println(marks[i]);
			}
		System.out.println("total is "+total);
		System.out.println("avg is "+total/count);
	}
	
	
	private void petrol_price() {
		// TODO Auto-generated method stub
		int[] petrol_price = {100,101,102,99}; 
		int index =0; 
		int highest = petrol_price[0]; 
		for(int i=1;i<petrol_price.length; i++)
		{
		if(petrol_price[i]> highest)
		{
			highest = petrol_price[i]; 
			index = i;
		}
		}
		System.out.println("Highest price is " + highest); 
		System.out.println("Day is "+ index);
	}


}
