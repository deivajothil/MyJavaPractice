// To run java tamilnadu.chennai.CommonManInChennai
package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules
{
public void goByDieselVehicle()
{
System.out.println("goByDieselVehicle method");
}
	public void goByBicycle()
	{
	System.out.println("goByBicycle method");
	}
	public static void main(String arg[])
	{
	CommonManInChennai co = new CommonManInChennai();
	System.out.println("trafficCommisssioner"+TrafficRules.trafficCommisssioner);
	System.out.println("trafficCommisssioner"+co.trafficCommisssioner);
	co.goByBicycle();
	co.goByDieselVehicle();
	}
}