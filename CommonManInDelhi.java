package india.newDelhi;
//javac -d . CommonManInDelhi.java
//java india.newDelhi.CommonManInDelhi  --checked
import tamilnadu.chennai.TrafficRulesChennai;
public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRulesChennai
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
System.out.println("goByBicycle method in CommonManInDelhi");
}
}
