public class NestedIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("Eligible to vote.");
            } else {
                System.out.println("Get a voter ID to vote.");
            }
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}


// Output
// Eligible to vote.