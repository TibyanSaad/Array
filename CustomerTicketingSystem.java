import java.util.Scanner;

public class CustomerTicketingSystem {
    public static void main(String[] args) {
        Scanner customerFeedback = new Scanner(System.in);
        int feedbackNo = 3;
        String[] feedback = new String[feedbackNo];

        for (int currentFeedback = 0; currentFeedback < feedbackNo; currentFeedback++) {
            System.out.printf("%d. Please enter your feedback: ", currentFeedback);
            feedback[currentFeedback] = customerFeedback.nextLine();
        }
        for (int currentFeedback = 0; currentFeedback < feedbackNo; currentFeedback++) {
            System.out.printf("Feedback %d is: %s \n ", currentFeedback, feedback[currentFeedback]);
        }
        System.out.println("Would you like to update any of the tickets?");
        System.out.println("type 'YES' or 'NO'");
        String updateInput = customerFeedback.nextLine();

        if (updateInput.equals("YES")){
            System.out.println("Enter the index of the ticket to be updated");
            int updateId = customerFeedback.nextInt();
            System.out.println("Ticket to be updated is: " + feedback[updateId]);

            String newTicket = customerFeedback.nextLine();
            feedback[updateId] = newTicket;
            System.out.println("Updated Ticket: " + newTicket);
        }
    }
}
