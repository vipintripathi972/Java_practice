class IsPrime{

    public static void main(String args[]){
        int a = 71;
        for (int i = 2; i < a/2; i++)
        {
            if (a % i == 0)
            {
                System.out.println("Is a not prime number");
                return;
            }
        }
        System.out.println("Is a prime number");
    }
}