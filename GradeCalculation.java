import java.util.Scanner;

class GradeCalculation
{ 
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        int test1, test2, assignments, finalTest, studentID;
        int numberOfStudents = 0; 
        boolean dataOK;
        double totalScore;
        double classScore = 0;
        double averageScore; 
        
        System.out.print("Enter Student ID # (0 to to STOP): " ); 
        studentID = input.nextInt();

        while(studentID != 0)
        {
        System.out.print("Enter Test 1 Score: " ); 
        test1 = input.nextInt();
        System.out.println();

        System.out.print("Enter Test 2 Score: " ); 
        test2 = input.nextInt();
        System.out.println();

        System.out.print("Enter Assignments Score: " ); 
        assignments = input.nextInt();
        System.out.println();

        System.out.print("Enter Final Test Score: " ); 
        finalTest = input.nextInt();
        System.out.println();

        if (test1 < 0 || test2 < 0 || finalTest < 0 || assignments < 0) 
        {
            dataOK = false; 
            System.out.println ("ERROR: Scores Entered can not be less than 0");
        }
        else 
        {
            dataOK = true;
        }
        
        if (dataOK)
        {
            totalScore = (double)(test1 + test2 + finalTest + assignments) / 4.0; 
            classScore = totalScore + classScore;
            numberOfStudents++;

            if (totalScore >= 90)
            {
            System.out.println("___________________________");
            System.out.println ("Final Score = " + totalScore + " \nLetter Grade = A" );
            }
            else if (totalScore >= 80 && totalScore < 90)
            {
            System.out.println("___________________________");
            System.out.println ("Final Score = " + totalScore + " \nLetter Grade = B" );
            }
            else if (totalScore >= 70 && totalScore < 80)
            {
            System.out.println("___________________________");
            System.out.println ("Final Score = " + totalScore + " \nLetter Grade = C" );
            }
            else if (totalScore >= 60 && totalScore < 70)
            {
            System.out.println("___________________________");
            System.out.println ("Final Score = " + totalScore + " \nLetter Grade = D" );
            }
            else 
            {
            System.out.println("___________________________");
            System.out.println ("Final Score = " + totalScore + " \nLetter Grade = F" );
            }

        }

        System.out.println();
        System.out.print("Enter Student ID # (0 to to STOP): " ); 
        studentID = input.nextInt();
    }

    averageScore = classScore/numberOfStudents; 
    System.out.println("Average Class Score = " + averageScore);
    } 
}