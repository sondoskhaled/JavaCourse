package chapter9;

public class Employee extends Person{
    private String employeeId;
    private String title;

    public Employee(){
        super("sondos");
        System.out.println("In employee default constructor class ");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
