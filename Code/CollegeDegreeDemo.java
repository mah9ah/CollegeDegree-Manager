import java.util.Scanner;

public class CollegeDegreeDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CollegeDegree myDegree = new CollegeDegree();
        int option;

        do {
            System.out.println();
            System.out.println("Please pick from one of the options below!");
            System.out.println("Please press 1 to change the major of degree!");
            System.out.println("Please press 2 to view the major of degree!");
            System.out.println("Please press 3 to add courses to the degree!");
            System.out.println("Please press 4 to view all the courses required for the degree!");
            System.out.println("Please press 5 to view the number of courses required for the degree!");
            System.out.println("Please press 6 to view the total number of credits required for the degree!");
            System.out.println("Please press 7 to increase the maximum number of courses for all degrees!");
            System.out.println("Please press 8 to view the maximum number of courses for all degrees!");
            System.out.println("Please press 9 to end the program!");


            option = keyboard.nextInt();

            if( option ==1){
                System.out.println( "Please type in  your new major below!");
                keyboard.nextLine();
                String newMajor = keyboard.nextLine();
                myDegree.setMajor(newMajor);
            }
            else if ( option == 2){
                System.out.println("The major of your degree is : " + myDegree.getMajor());
                System.out.println();
            }

            else if ( option == 3) {
                System.out.println("What is the name of the course you would like to add ?");
                keyboard.nextLine();
                String CourseName = keyboard.nextLine();
                System.out.println("Please type in the number of credits the class contains!");
                int numberOfCredits = keyboard.nextInt();
                myDegree.addCourse(CourseName, numberOfCredits);
            }

            else if (option == 4){
                System.out.println("Required courses for your degree: ");
                System.out.println(myDegree.getCourses());

            }

            else if (option ==5){
                System.out.println("Number of courses required for your degree: ");
                System.out.println(myDegree.getNumberOfCourses());
                System.out.println();
            }

            else if ( option == 6){
                System.out.println("Total number of credits required for your degree: ");
                System.out.println(myDegree.getTotalNumberOfCredits() + " Credits");
                System.out.println();
            }

            else if ( option == 7){
                System.out.println("What is the new maximum number of courses?");
                int newMaximumNumberOfCourses = keyboard.nextInt();
                myDegree.increaseMaximumNumberOfCourses(newMaximumNumberOfCourses);
            }

            else if (option == 8){
                System.out.println("Maximum number of courses: ");
                System.out.println(myDegree.getMaximumNumberOfCourses());
                System.out.println();
            }

            else if ( option == 9){
                System.out.println("Goodbye");
            }

            else{
                System.out.println("Error!");

            }





        }while (option != 9);


    }
}
