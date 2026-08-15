import java.util.*;

class BasicString{

    public static void main(String args[]){
        String data = "Hello World!";
        String data1 = new String("Hello World!");

        String data2 = data + data1;
        //data = data + "its's me";

        System.out.println(data + "\n" + (data == data1));


        data1 = data1.intern();

        System.out.println(data == data1);
        
    }
}