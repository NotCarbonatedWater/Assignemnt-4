class Grading
{
    private double quizzes, midterm, finalexam, finalGrade;

    public Grading()
	{
        quizzes = 0; midterm = 0; finalexam = 0;
    }
    public void set_Quizzes(int q1, int q2, int q3)
	{
        quizzes = q1 + q2 + q3; quizzes /= 30;
    }
    public void set_Midterm(int mt)
	{
        midterm = mt; midterm /= 100;
    }
    public void set_Finalexam(int ex)
	{
        finalexam = ex; finalexam /= 100;
    }
    public void get_finalGrade()
	{
        quizzes *= .25; midterm *= .35; finalexam *= .4;
        finalGrade = quizzes + midterm + finalexam;
        finalGrade *= 100;
        System.out.println("Grade percentage: " + finalGrade + "%");
        System.out.print("Letter Grade: ");
        if (finalGrade >= 90)
            System.out.print("A");
        else if (finalGrade >= 80)
            System.out.print("B");
        else if (finalGrade >= 70)
            System.out.print("C");
        else if (finalGrade >= 60)
            System.out.print("D");
        else
            System.out.print("F");
        System.out.println();

    }
}