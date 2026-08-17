class Alpha
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
}
class Beta extends Alpha
{
    public int add(int num1, int num2)
    {
        return num1 + num2 + 1;
    }
}

class Overridinng
{
    public static void main(String args[])
    {
        Beta obj = new Beta();
        int r = obj.add(2,5);
        System.out.println(r);
    }
} 