public class SwitchStatement{

    public static void main(String args[]){

        String day = "Monday";
        String result1 = "", result2 = "", result3 = "";

        switch(day)
        {
            case "Sunday", "Saturday" -> result1 = "6am";
            case "Monday" -> result1 = "9am";
            default -> result1 = "7am";
        }
        System.out.println(result1);

        result2 = switch(day)
        {
            case "Sunday", "Saturday" -> "6am";
            case "Monday" -> "9am";
            default -> "7am";
        };
        System.out.println(result2);

        result3 = switch(day)
        {
            case "Sunday", "Saturday" : 
                yield "6am";
            case "Monday" : 
                yield "9am";
            default : 
                yield "7am";
        };
        System.out.println(result3);
        
    }
}