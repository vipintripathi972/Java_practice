class Demo{

    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

class MethodOverloading{

    public static void main(String args[]){

        Demo obj = new Demo();
        int a = obj.add(2, 6);
        
        System.out.println(a);

        int b = obj.add(2, 6, 8);

        System.out.println(b);

        double c = obj.add(2.0, 4);

        System.out.println(c);
    }
}