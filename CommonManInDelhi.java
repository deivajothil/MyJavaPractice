package india.newDelhi;
public class CommonManInDelhi implements TrafficRulesDelhi
{
public static void main(String arg[])
{
CommonManInDelhi co = new CommonManInDelhi();
co.dontGoByDieselVehicle();
co.goByBicycle();

}
public void dontGoByDieselVehicle()
{
System.out.println("dontGoByDieselVehicle method in CommonManInDelhi");
}
public void goByBicycle()
{
System.out.println("dontGoByDieselVehicle method in CommonManInDelhi");
}
}