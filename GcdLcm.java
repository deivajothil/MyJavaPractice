package math.calculations;
class GcdLcm
{
public static void main(String arg[])
{
// method definition for identifying GCD and LCM for 2 numbers
GcdLcm obj = new GcdLcm();
	obj.gcd(10,20);
}
	private void gcd(int n1, int n2) 
	{
    // TODO Auto-generated method stub
    int gcd1 = 1;
    int div = 2;
    int lcm;
//convert negative no. to positive 
    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;
        while ((n1 > 0 &&  n2> 0 )&& (div <= n1 && div <= n2)) 
        {
            // checking both n1 and n2 divisible by same no.
            if (n1%div == 0 && n2%div == 0)
            {
                gcd1 = div;

            }
            div++;
        }

        System.out.println("gcd1"+gcd1);
        lcm = (n1 * n2)/ gcd1;
        System.out.println("lcm"+lcm);
}
}
