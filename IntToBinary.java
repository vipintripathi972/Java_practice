class IntToBinary
{
    public static void main(String args[])
    {
        int n = 1000;
        int a = 0, i = 0;
        while (n > 0)
        {
            int b = n % 2;
            a += b * (int)Math.pow(10, i);
            i++;
            n /= 2;
        }
        System.out.println(a);
    }
}