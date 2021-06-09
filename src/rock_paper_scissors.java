import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p_score = 0, c_score = 0;
        while (true) {
            System.out.print("Enter your choice ");
            String raw_input = in.next();
            String input = raw_input.toLowerCase();
            String computer = "";
            if (input.equals("rock") || input.equals("scissors") || input.equals("paper")) {
                double computer_num = Math.round(Math.random() * 2);
                if (computer_num == 0) {
                    computer = "rock";
                }
                if (computer_num == 1) {
                    computer = "paper";
                }
                if (computer_num == 2) {
                    computer = "scissors";
                }
                System.out.print("Computer's choice was " + computer + ", so ");

                if (input.equals(computer)) {
                    System.out.println("The match was a draw....");

//                  to check whether player want to play again
                    System.out.println("If you want to play again enter 'y', otherwise 'n' or anything.");
                    String play_again = in.next();
                    if (play_again.equals("y")) {
                        continue;
                    } else {
                        break;
                    }

                } else {
                    if (input.equals("rock")) {
                        if (computer.equals("scissors")) {
                            System.out.println("you won!!!");
                            p_score++;
                        } else {
                            System.out.println("I won!!");
                            c_score++;
                        }

//                      to check whether player want to play again
                        System.out.println("If you want to play again enter 'y', otherwise 'n' or anything.");
                        String play_again = in.next();
                        if (play_again.equals("y")) {
                            continue;
                        } else {
                            break;
                        }

                    }
                    if (input.equals("paper")) {
                        if (computer.equals("rock")) {
                            System.out.println("you won!!!");
                            p_score++;
                        } else {
                            System.out.println("I won!!");
                            c_score++;
                        }

//                      to check whether player want to play again
                        System.out.println("If you want to play again enter 'y', otherwise 'n' or anything.");
                        String play_again = in.next();
                        if (play_again.equals("y")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    if (input.equals("scissors")) {
                        if (computer.equals("paper")) {
                            System.out.println("you won!!!");
                            p_score++;
                        } else {
                            System.out.println("I won!!");
                            c_score++;
                        }

//                      to check whether player want to play again
                        System.out.println("If you want to play again enter 'y', otherwise 'n' or anything.");
                        String play_again = in.next();
                        if (play_again.equals("y")) {
                            continue;
                        } else {
                            break;
                        }

                    }
                }

            } else {
                System.out.println("Please enter a valid input(rock, paper, scissors; case doesn't matter). Enter 'n' for quit");

//              to check whether player want to play again
                System.out.println("If you want to play again enter 'y', otherwise 'n' or anything.");
                String play_again = in.next();
                if (play_again.equals("n")) {
                    break;
                }
            }
        }
        System.out.println("Your score is " + p_score);
        System.out.println("");
        System.out.println("My score is " + c_score);
        System.out.println("");

        if (p_score > c_score) {
            System.out.println("You won this time!!!");
        } else if (p_score == c_score) {
            System.out.println("Well try again, because the match was a draw");
        } else System.out.println("You lost. Goodluck next time");


    }
}