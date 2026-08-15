public class SwitchUpdated{

    public static void main(String args[]){

        String day = "Monday";

        switch(day)
        {
            case "Sunday", "Saturday" -> System.out.println("6am");

            case "Monday" -> System.out.println("9am");

            default -> System.out.println("7am");
        }
        
    }
}