public class TestObject {
    private int employeeID;
    private int timer =0;
    private String employeeName ="";
    public TestObject(){

    }

    public int employeeID(){
        return employeeID;

    }

    public String employeeName() {
        return employeeName;
    }

    public int getTimer() {
        return timer;
    }

    public void setMemberID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public void employeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
