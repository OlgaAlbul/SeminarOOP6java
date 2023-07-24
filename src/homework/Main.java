package homework;

public class Main{
    public static void main(String[] args){
        Saver saver = new Saver();
        Reporter reporter = new Reporter();
        User user = new User("Bob");
        reporter.report(user);
        saver.save(user);
    }
}