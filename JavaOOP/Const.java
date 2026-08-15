class Const{

    int x;

    public Const()
    {
        System.out.println("in non prarmetrized constructor");
    }

    public Const(int x)
    {
        this.x = x;
        System.out.println("in parametrized constructor");
    }

    public static void main(String args[])
    {
        Const obj = new Const();
        System.out.println(obj.x);
    }
}