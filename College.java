public class College extends CompositeUnit {
    public College(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.println(getName());
        System.out.println("Total Students: " + getStudentCount());
        System.out.println("Total Budget: $" + String.format("%.2f", getBudget()));
        
        System.out.println("\nCollege Structure:");
        for (EducationalUnit unit : getUnits()) {
            unit.display();
        }
    }
}