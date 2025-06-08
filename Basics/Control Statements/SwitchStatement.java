public class SwitchStatement {
    public static void main(String[] args) {
        String day = "Tuesday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Tuesday":
                System.out.println("Second day of the week.");
                break;
            case "Wednesday":
                System.out.println("Midweek day.");
                break;
            case "Thursday":
                System.out.println("Almost Friday.");
                break;
            case "Friday":
                System.out.println("Weekend is near.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}


// Output
// Second day of the week.