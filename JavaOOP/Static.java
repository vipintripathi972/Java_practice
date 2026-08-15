import java.util.*;

class Mobile{

    String brand;
    int price;
    static String type;

    public void print()
    {
        System.out.println("in non-static method");
        System.out.println(brand + "  " + price + "  " + type);
    }

    public static void show(Mobile a)
    {
        System.out.println("in static method");
        System.out.println(a.brand + "  " + a.price + "  " + type);
    }

    static
    {
        type = "SmartPhone";
        System.out.println("in static block");
    }

}

class Static{
    
    public static void main(String args[]){

       // Mobile.type = "SmartPhone";
        
        Mobile a = new Mobile();
        a.brand = "IPhone";
        a.price = 1700;

        Mobile b = new Mobile();
        b.brand = "Samsung";
        b.price = 1900;

 
        a.print();
        b.print();
        System.out.println();
        Mobile.show(a);

        System.out.println();
        Mobile.show(b);
    }
}