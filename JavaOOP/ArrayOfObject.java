class Student{

    int id;
    String name;
    double marks;
}

class ArrayOfObject{

    public static void main(String args[]){

        Student a = new Student();
        a.id = 32;
        a.name = "Chopper";
        a.marks = 34.4;

        Student b = new Student();
        b.id = 35;
        b.name = "Momosa";
        b.marks = 46.4;

        Student c = new Student();
        c.id = 54;
        c.name = "Vadel";
        c.marks = 45.2;

        Student std[] = new Student[3];
        std[0] = a;
        std[1] = b;
        std[2] = c;

        for (int i = 0; i < std.length; i++)
        {
            System.out.println(std[i].id + " : " + std[i].name + " : " + std[i].marks);
        }

        for (Student i : std)
        {
            System.out.println(i.id + " : " + i.name + " : " + i.marks);
        }
    }
}