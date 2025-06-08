public class StringSwitch {
    public static void main(String[] args) {
        // Declaring String variable
        String levelString = "Expert";
        int level;

        // Using String in Switch expression
        level = switch (levelString) {
            case "Beginner" -> 1;
            case "Intermediate" -> 2;
            case "Expert" -> 3;
            default -> 0;
        }; // Using String literals in Switch case

        // Printing the result
        System.out.println("Your Level is: " + level);
    }
}


// Output
// Your Level is: 3