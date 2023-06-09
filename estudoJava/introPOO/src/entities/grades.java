package entities;

public class grades {
    public String name;
    public double A;
    public double B;
    public double C;

    public double finalGrade(){
        return A+B+C;
    }
    public void passed(double grade){
        System.out.printf("FINAL GRADE %.2f\n", grade);
        if (grade>60.00){
            System.out.println("PASS");
        }
        else System.out.printf("FAILED\nMISSING %.2f POINTS\n", 60-grade);
    }
}
