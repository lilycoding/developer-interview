package foundation.ObjectOriented;

public class Teacher extends SingleDog {
    private String tech;

    public Teacher() {

    }

    @Override
    public void work() {
        System.out.println("Teacher Work");
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }
}
