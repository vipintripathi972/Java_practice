import java.util.*;

class StringBufferDemo{

    public static void main(String args[]){
        StringBuffer a = new StringBuffer("Hello");
        System.out.println(a.capacity());

        StringBuffer b = new StringBuffer();
        System.out.println(b.capacity());

        StringBuffer c = new StringBuffer(10);
        System.out.println(c.capacity());

        b.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(b.capacity());

        b.delete(0, 2);
        System.out.println(b);

        String z = b.substring(2,5);
        System.out.println(z);


    }
}