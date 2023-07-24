package homework;

public class Reporter {
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
    public void persisterSaveReport(User user){
        System.out.println("Save user: " + user.getName());
    }
}
