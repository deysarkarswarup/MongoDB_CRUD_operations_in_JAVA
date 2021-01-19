public class TestObject {
    private int employeeID;
    private int timer =0;
    private String employeeName ="";
    public TestObject(){

    }

    public int getEmployeeID(){
        return employeeID;

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
