package homework;

public class Saver {
    public void save(User user){
        Persister persister = new Persister(user);
        Reporter reporter = new Reporter();
        reporter.persisterSaveReport(user);
    }
}
