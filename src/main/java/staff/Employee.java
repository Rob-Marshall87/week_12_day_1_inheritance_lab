package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double rate){
        if(rate > 0) {
            double increase = salary * (1 + rate);
            this.salary = (int) Math.round(increase);
        }
    }

    public int payBonus(){
        return (this.salary / 100);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
