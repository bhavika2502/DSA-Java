public class Maths
{
    public static void main(String args[])

    {
        System.out.println(sumOfN(10));
        System.out.println(productOfN(10));

    }
    public static int sumOfN(int n)
    
    { 
        if (n==0) return 0;
        return n + sumOfN(n-1);

    }
    public static int productOfN(int n)
    
    {
        if (n==1) return n;
        return n * productOfN(n-1);

    }
}