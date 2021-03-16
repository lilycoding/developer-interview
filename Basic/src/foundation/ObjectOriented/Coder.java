package foundation.ObjectOriented;

public class Coder extends SingleDog {
    private String time;
    private int salary;


    public Coder() {

    }


    @Override
    public void work() {
        super.work();
        System.out.println("Coder Work");
    }

    public void cs(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}