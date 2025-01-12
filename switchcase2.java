public class switchcase2 {
    public static void main(String args[])
    {
        String day = "Monday";

        switch(day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thurseday":
            case "Friday":
                System.out.println("School");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("Work");
                break;
            default:
                System.out.println("Try again!");
                break;
        }
    }
}
