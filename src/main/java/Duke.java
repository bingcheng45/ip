import java.util.Scanner;

/**
 * This program Duke is a chatbot.
 *
 * @author: Toh Bing Cheng
 * @version: CS2103T AY21 Semester 1
 */
public class Duke {
    public static void main(String[] args) {
        runProgram();
    }

    /**
     * This method runs the program indefinitely till user types in "bye".
     */
    public static void runProgram() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        System.out.println("What can I do for you?");
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (run) {
            // wait to read in the user's input
            String input = scanner.nextLine();
            // Ensures that all bye would end the program.
            try {
                run = taskManager.executeCommand(input);
            } catch (IncompleteCommandException e) {
                System.out.println(e);
            }

        }
    }





}
