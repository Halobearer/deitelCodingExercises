package JavaAssignments;

import chapterFour.ElseIf;

import java.util.Scanner;

public class MyersBriggsPersonalityTest {
    public static class MyersBriggs {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int extrovert = 0;
            int introvert = 0;
            int sensing = 0;
            int intuitive = 0;
            int thinking = 0;
            int feeling = 0;
            int judging = 0;
            int perceiving = 0;


            System.out.println("""
                    WELCOME TO MYERS' BRIGGS PERSONALITY TEST
                    PLEASE, CHOOSE BETWEEN OPTIONS "A" OR "B".
                                    
                    """);
            System.out.println();

            System.out.println("What is your name ?");
            String username = input.next();

            for (int i = 1; i < 21; i++) {
                switch (i) {
                    case 1 -> {
                        System.out.println("""
                                Question 1
                                                            
                                A. expend energy, enjoy groups
                                B. conserve energy, enjoy one-on-one
                                """);
                        System.out.println("Please, enter an option: ");
                        String userInput = input.next();
                        if (userInput.equalsIgnoreCase("A")) {
                            extrovert++;
                        } else if (userInput.equalsIgnoreCase("B")) {
                            introvert++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again ");
                        break;
                    }
                    case 2 -> {
                        System.out.println("""
                                Question 2
                                                                
                                A.Interpret literally
                                B.Look for meaning and possibilities
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput2 = input.nextLine();

                        input.nextLine();
                        if (userInput2.equalsIgnoreCase("A")) {
                            sensing++;
                        } else if (userInput2.equalsIgnoreCase("B")) {
                            intuitive++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again ");
                        break;
                    }
                    case 3 -> {
                        System.out.println("""
                                Question 3
                                                                
                                A.logical, thinking, questioning
                                B.empathetic, feeling, accommodating
                                """);
                        System.out.println("Please enter an Option: ");
                        String userInput3 = input.next();
                        if (userInput3.equalsIgnoreCase("A")) {
                            thinking++;
                        } else if (userInput3.equalsIgnoreCase("B")) {
                            feeling++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again ");
                        break;
                    }
                    case 4 -> {
                        System.out.println("""
                                Question 4
                                                                
                                A.organized, orderly
                                B.flexible, adaptable
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput4 = input.next();
                        if (userInput4.equalsIgnoreCase("A")) {
                            judging++;
                        } else if (userInput4.equalsIgnoreCase("B")) {
                            perceiving++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again ");
                        break;
                    }
                    case 5 -> {
                        System.out.println("""
                                Question 5
                                                                
                                A.more outgoing, think out loud
                                B.more reserved, think to yourself
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput5 = input.nextLine();
                        if (userInput5.equalsIgnoreCase("A")) {
                            extrovert++;
                        } else if (userInput5.equalsIgnoreCase("B")) {
                            introvert++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again ");
                        break;
                    }
                    case 6 -> {
                        System.out.println("""
                                Question 6
                                                                
                                A.practical, realistic, experimental
                                B.imaginative, innovative, theoretical""");
                        System.out.println("Please enter an option: ");
                        String userInput6 = input.next();
                        if (userInput6.equalsIgnoreCase("A")) {
                            sensing++;
                        } else if (userInput6.equalsIgnoreCase("B")) {
                            intuitive++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 7 -> {
                        System.out.println("""
                                Question 7
                                                                
                                A.candid, straightforward, frank
                                B.tactful, kind, encouraging""");
                        System.out.println("Please enter an option: ");
                        String userInput7 = input.nextLine();
                        if (userInput7.equalsIgnoreCase("A")) {
                            thinking++;
                        } else if (userInput7.equalsIgnoreCase("B")) {
                            feeling++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 8 -> {
                        System.out.println("""
                                Question 8
                                                                
                                A.plan, schedule
                                B.unplanned, spontaneous""");
                        System.out.println("Please enter an option: ");
                        String userInput8 = input.nextLine();
                        if (userInput8.equalsIgnoreCase("A")) {
                            judging++;
                        } else if (userInput8.equalsIgnoreCase("B")) {
                            perceiving++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 9 -> {
                        System.out.println("""
                                Question 9
                                                                
                                A.seek many tasks, public activities, interaction with others
                                B.seek private, solitary activities with quiet to concentrate
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput9 = input.next();
                        if (userInput9.equalsIgnoreCase("A")) {
                            extrovert++;
                        } else if (userInput9.equalsIgnoreCase("B")) {
                            introvert++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 10 -> {
                        System.out.println("""
                                Question 10
                                                                
                                A.standard, usual, conventional
                                B.different, novel, unique
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput10 = input.nextLine();
                        if (userInput10.equalsIgnoreCase("A")) {
                            sensing++;
                        } else if (userInput10.equalsIgnoreCase("B")) {
                            intuitive++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 11 -> {
                        System.out.println("""
                                Question 11
                                                                
                                A.firm, tend to criticize, hold the line,
                                B.gentle, tend to appreciate, conciliate
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput11 = input.nextLine();
                        if (userInput11.equalsIgnoreCase("A")) {
                            thinking++;
                        } else if (userInput11.equalsIgnoreCase("B")) {
                            feeling++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 12 -> {
                        System.out.println("""
                                Question 12
                                                                
                                A.regulated, structured
                                B.easy going, live and let live
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput12 = input.next();
                        if (userInput12.equalsIgnoreCase("A")) {
                            judging++;
                        } else if (userInput12.equalsIgnoreCase("B")) {
                            perceiving++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 13 -> {
                        System.out.println("""
                                Question 13
                                                                
                                A.external, communicative, express yourself
                                B.internal, reticent, keep to yourself
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput13 = input.nextLine();
                        if (userInput13.equalsIgnoreCase("A")) {
                            extrovert++;
                        } else if (userInput13.equalsIgnoreCase("B")) {
                            introvert++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        input.nextLine(); // To combat the scanner Bug

                        break;
                    }
                    case 14 -> {
                        System.out.println("""
                                Question 14
                                                                
                                A.focus on here-and-now
                                B.look to the future, global perspective, big picture
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput14 = input.next();

                        input.nextLine();
                        if (userInput14.equalsIgnoreCase("A")) {
                            sensing++;
                        } else if (userInput14.equalsIgnoreCase("B")) {
                            intuitive++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 15 -> {
                        System.out.println("""
                                Question 15
                                                                
                                A.tough minded, just
                                B.tender hearted, merciful
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput15 = input.next();
                        if (userInput15.equalsIgnoreCase("A")) {
                            thinking++;
                        } else if (userInput15.equalsIgnoreCase("B")) {
                            feeling++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 16 -> {
                        System.out.println("""
                                Question 16
                                                                
                                A.preparation, plan ahead
                                B.go with the flow, adapt as you go
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput16 = input.nextLine();
                        if (userInput16.equalsIgnoreCase("A")) {
                            judging++;
                        } else if (userInput16.equalsIgnoreCase("B")) {
                            perceiving++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 17 -> {
                        System.out.println("""
                                Question 17
                                                                
                                A.active, initiate
                                B.reflective, deliberate
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput17 = input.next();
                        if (userInput17.equalsIgnoreCase("A")) {
                            extrovert++;
                        } else if (userInput17.equalsIgnoreCase("B")) {
                            introvert++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 18 -> {
                        System.out.println("""
                                Question 18
                                                                
                                A.facts, things, what is
                                B.ideas, dreams, what could be, philosophical
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput18 = input.next();
                        if (userInput18.equalsIgnoreCase("A")) {
                            sensing++;
                        } else if (userInput18.equalsIgnoreCase("B")) {
                            intuitive++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 19 -> {
                        System.out.println("""
                                Question 19
                                                                
                                A.matter of fact, issue oriented
                                B.sensitive, people oriented, compassionate
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput19 = input.next();
                        if (userInput19.equalsIgnoreCase("A")) {
                            thinking++;
                        } else if (userInput19.equalsIgnoreCase("B")) {
                            feeling++;
                        } else
                            System.out.println(" Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                    case 20 -> {
                        System.out.println("""
                                Question 20
                                                                
                                A.control, govern
                                B.latitude, freedom
                                """);
                        System.out.println("Please enter an option: ");
                        String userInput20 = input.next();
                        if (userInput20.equalsIgnoreCase("A")) {
                            judging++;
                        } else if (userInput20.equalsIgnoreCase("B")) {
                            perceiving++;
                        } else
                            System.out.println("Expected A or B as response\nI know this is an error, Please try again");
                        break;
                    }
                }
            }
            System.out.println("Hello " + username + " You selected");
        }
    }
}