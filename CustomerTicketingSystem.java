import java.util.Scanner;
public class CustomerTicketingSystem {
    public static void main(String[] args){
        Scanner customerFeedback = new Scanner(System.in);
        int feedbackNo = 3;
        String[] feedback = new String[feedbackNo];

        for(int currentFeedback =0; currentFeedback<feedbackNo; currentFeedback++){
            System.out.printf("%d. Please enter your feedback: ", currentFeedback);
            feedback[currentFeedback] = customerFeedback.nextLine();
        }
        for(int currentFeedback =0; currentFeedback<feedbackNo; currentFeedback++){
            System.out.printf("Feedback %d is: %s \n ", currentFeedback, feedback[currentFeedback]);
        }
    }
}
