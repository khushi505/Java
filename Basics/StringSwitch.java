public class StringSwitch {
    public static void main(String[] args) {
        // Declaring String variable
        String levelString = "Expert";
        int level = 0;

        // Using String in Switch expression
        switch (levelString) {
            // Using String literals in Switch case
            case "Beginner":
                level = 1;
                break;
            case "Intermediate":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                level = 0;
                break;
        }

        // Printing the result
        System.out.println("Your Level is: " + level);
    }
}


// Output
// Your Level is: 3