class Anony{
    int x;

    public int valOfX(int x)
    {
        this.x = x;
        return x;
    }

    public static void main(String args[])
    {
        System.out.println(new Anony().valOfX(5));
    }
}