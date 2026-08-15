class VeryAdvCalc extends AdvCalc{

    public int multi(int a, int b)
    {
        return a * b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }

    public static void main(String args[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int a = obj.sum(2, 4, 5);
        int b = obj.sum(3, 6);
        int c = obj.multi(3, 4);

        System.out.println(a + "   " + b + "   " + c );
    }
}