class Comp
{
    public int add(int n1, int n2, int n3)
    {
        System.out.println("in compile time Polymorphism");
        return n1 + n2 + n3;

    }
    public int add(int n1, int n2)
    {
        System.out.println("in compile time Polymorphism");
        return n1 + n2;
    }
}

class RunT
{
    public int add(int n1, int n2)
    {
        System.out.println("in run time Polymorphism");
        return Math.max(n1, n2);
    }
}



class Polymorphism
{
    public static void main(String args[])
    {
        Comp obj1 = new Comp();
        RunT obj2 = new RunT();
        int n2 = obj1.add(3,3,4);
        System.out.println(n2 + "\n");

        int n1 = obj1.add(3,4);
        System.out.println(n1 + "\n");

        int n3 = obj2.add(5,9);
        System.out.println(n3 + "\n");
        
    }
}