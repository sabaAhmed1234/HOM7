package HOM7;

public class Instructor extends Person{
    private double salary;
    public Instructor(String name,String YearOfBirth,double salary)
    {
        super(name,YearOfBirth);
        this.salary=salary;
    }
    public String toString()
    {
        String fullInfo=super.toString()+" "+salary;
        return fullInfo;
    }
}

