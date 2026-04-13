void main() {
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
    IO.println("Would you like to update any of the tickets?");
    IO.println("type 'YES' or 'NO'");
    String updateInput = customerFeedback.nextLine();

    if (updateInput.equals("YES")) {
        IO.println("Enter the index of the ticket to be updated");
        int updateId = customerFeedback.nextInt();
        customerFeedback.nextLine();
        IO.println("Ticket to be updated is: " + feedback[updateId]);
        IO.println("Enter value to be updated");
        String newTicket = customerFeedback.nextLine();
        feedback[updateId] = newTicket;
        IO.println("##########################");
        IO.println("UPDATED LIST");
        for (int currentFeedback = 0; currentFeedback < feedbackNo; currentFeedback++) {
            System.out.printf("Feedback %d is: %s \n ", currentFeedback, feedback[currentFeedback]);
        }
    }

    IO.println("Would you like to delete any of the tickets?");
    IO.println("type 'YES' or 'NO'");
    String deleteInput = customerFeedback.nextLine();

    if (deleteInput.equals("YES")) {
        IO.println("Enter the index of the ticket to be deleted");
        int deleteId = customerFeedback.nextInt();
        customerFeedback.nextLine();
        IO.println("Ticket to be deleted is: " + feedback[deleteId]);

        feedback[deleteId] = null;
        IO.println("##########################");
        IO.println("DELETED LIST");
        for (int currentFeedback = 0; currentFeedback < feedbackNo; currentFeedback++) {
            System.out.printf("Feedback %d is: %s \n ", currentFeedback, feedback[currentFeedback]);
        }
    }
    IO.println("Exiting Goodbye!");
}
