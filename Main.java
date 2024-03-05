import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println(" Grade Calculator ");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter the following information:");
        System.out.println("Enter the percentage scored in assignments (out of 20%): ");
        int agmtprct = userInput.nextInt();
        System.out.println("Enter the percentage scored in final project (out of 30%): ");
        int fprojprct = userInput.nextInt();
        System.out.println("Enter the percentage scored in test and quizzes (out of 40%): ");
        int tstqzprct = userInput.nextInt();
        System.out.println("Enter the percentage scored in participation (out of 10%): ");
        int partptprct = userInput.nextInt();

        int totprct = agmtprct + fprojprct + tstqzprct + partptprct;

        if (totprct >= 93 && totprct <= 100){
            System.out.println("Grade A with " + totprct + "%");
        }
        else if (totprct >= 90 && totprct <= 92.99){
            System.out.println("Grade A- with " + totprct + "%");
        }
        else if (totprct >= 87 && totprct <= 89.99){
            System.out.println("Grade B+ with " + totprct + "%");
        }
        else if (totprct >= 83 && totprct <= 86.99){
            System.out.println("Grade B with " + totprct + "%");
        }
        else if (totprct >= 80 && totprct <= 82.99){
            System.out.println("Grade B- with " + totprct + "%");
        }
        else if (totprct >= 77 && totprct <= 79.99){
            System.out.println("Grade C+ with " + totprct + "%");
        }
        else if (totprct >= 73 && totprct <= 76.99){
            System.out.println("Grade C with " + totprct + "%");
        }
        else if (totprct >= 70 && totprct <= 72.99){
            System.out.println("Grade C- with " + totprct + "%");
        }
        else if (totprct >= 67 && totprct <= 69.99){
            System.out.println("Grade D+ with " + totprct + "%");
        }
        else if (totprct >= 63 && totprct <= 66.99){
            System.out.println("Grade D with " + totprct + "%");
        }
        else if (totprct >= 60 && totprct <= 62.99){
            System.out.println("Grade D- with " + totprct + "%");
        }
        else if (totprct >= 0 && totprct <= 59.99){
            System.out.println("Grade F with " + totprct + "%");
        }
        else{
            System.out.println("Restart the program!");
        }
    }
}
