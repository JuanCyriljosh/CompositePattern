public class Teacher implements EducationalUnit {
    private String name;
    private String subject;
    private double salary;
    
    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getStudentCount() {
        return 0; // A teacher doesn't contain students
    }
    
    @Override
    public double getBudget() {
        return salary; // Teacher's budget is their salary (cost to the university)
    }
    
    @Override
    public void display() {
        System.out.println("Teacher: " + name + "\nSubject: " + subject + "\nSalary: $" + String.format("%.2f", salary));
    }
}