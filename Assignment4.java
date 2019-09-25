import java.util.Scanner;

public class Assignment4
{
	public static void main(String [] args)
	{
        boolean isProgramRunning = true;
        while (isProgramRunning == true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("1. Odometer");
            System.out.println("2. Grading");
            System.out.println("3. Tempature");
            System.out.println("4. Quit");
            System.out.println("Enter number of choice: ");
            int pick = input.nextInt();
            switch(pick) 
            {
                case 1: // odometer
                    Odometer Od1 = new Odometer();
                    System.out.print("Enter fuel efficency (miles traveled with a gallon): ");
                    int fe = input.nextInt(); Od1.set_FuelEfficency(fe);
                    System.out.print("Enter miles traveled (miles): ");
                    int m = input.nextInt(); Od1.set_Odometer(m);
                    Od1.set_UsedFuel();
                    System.out.println(Od1);
                    boolean internalRun = true;
                    while(internalRun == true)
                    {
                        System.out.println();
                        System.out.println("1. Add more miles");
                        System.out.println("2. Reset Odometer");
                        System.out.println("3. Quit Odometer program");
                        System.out.println("Enter number of choice: ");
                        int internalPick = input.nextInt();
                        switch(internalPick)
                        {
                            case 1: // grading
                                System.out.print("Enter miles traveled (miles): ");
                                m = input.nextInt(); Od1.set_Odometer(m);                          
                              break;
                            case 2: // Tempature
                                Od1.reset_Odometer();
                                System.out.print("Reset Complete");
                              break;
                            case 3: // Quit
                                internalRun = false;
                                System.out.print("Odometer program closing...");
                              break;
                        }
                        Od1.set_UsedFuel();
                        System.out.println(Od1);
                        System.out.println();
                    }
                  break;
                case 2: // grading
                    Grading G1 = new Grading();
                    System.out.println("Enter points earned for each of the 3 Quizzes(out of 10): ");
                    int q1 = input.nextInt(); int q2 = input.nextInt(); int q3 = input.nextInt();
                    G1.set_Quizzes(q1, q2, q3);
                    System.out.println("Enter points earned for Midterm(out of 100): ");
                    G1.set_Midterm(input.nextInt());
                    System.out.println("Enter points earned for Final Exam(out of 100): ");
                    G1.set_Finalexam(input.nextInt());
                    G1.get_finalGrade();
                  break;
                case 3: // Tempature
                    System.out.println("1. Convert Fahrenheit to Celsius");
                    System.out.println("2. Convert Celsius to Fahrenheit");
                    int internalPick3 = input.nextInt();
                    Temperature T1 = new Temperature();
                    System.out.println("Enter degree");
                    int d = input.nextInt();
                    switch(internalPick3)
                    {
                        case 1: // grading
                            T1.fToC(d);             
                          break;
                        case 2: // Tempature
                            T1.cToF(d);
                          break;
                    }
                    System.out.print(T1);
                  break;
                case 4: // Quit
                    System.out.println("Program is closing...");
                    isProgramRunning = false;
                  break;
            }
        }
    }
}