////javac -d . BinaryToDecimal.java
	//java math.calculations.BinaryToDecimal
package math.calculations;
class BinaryToDecimal
{
public static void main(String arg[] )
{
	
	BinaryToDecimal obj = new BinaryToDecimal();
	obj.binToDecimal(1111);
	
//method for binary no to Decimal no.

}
	private void binToDecimal(int bin) {
    // TODO Auto-generated method stub

    int sum = 0, multi = 1; int bin_param = bin;
    while (bin_param > 0)
    {
        bin = bin_param % 2;
        sum = sum + bin * multi;
        multi = multi *2;
        bin_param = bin_param/10;

        System.out.println("bin" + bin);
    }
    System.out.println("decimal" + sum);

}
}

