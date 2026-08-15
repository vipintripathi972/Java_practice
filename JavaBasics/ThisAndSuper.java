class A
{
    public A()
    {
        System.out.println("in A");
    }    
    public A(int a)
    {
        this();
        System.out.println("in int A");
    }
}

class B extends A
{
    public B()
    {
        this(5);
        System.out.println("in B");
    }
    public B(int a)
    {
        super(a);
        System.out.println("in int B");
    }
}

class ThisAndSuper
{
    public static void main(String args[])
    {
        B obj = new B();
    }
}