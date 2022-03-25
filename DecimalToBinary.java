package math.calculations;
class DecimalToBinary
{
public static void main(String arg[] )
{
DecimalToBinary obj = new DecimalToBinary();
	obj.decToBinary(10);

}
// method for Decimal to Binary	
	private void decToBinary(int dec) {
    // TODO Auto-generated method stub
    String str = "";
    while (dec > 0)
    {

        int bin = dec % 2;
        System.out.println("insise"+ bin);
        str =  bin + str;
        dec = dec /2;
    }
    System.out.println("binary"+ str);

}
}

