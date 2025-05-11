public class Department extends CompositeUnit {
    public Department(String name) {
        super(name);
    }
    
    @Override
    public void display() {
        System.out.println("\nDepartment: " + getName());
        System.out.println("Students: " + getStudentCount());
        System.out.println("Budget: $" + String.format("%.2f", getBudget()));
        
        System.out.println("\nMembers:");
        for (EducationalUnit unit : getUnits()) {
            if (unit instanceof Teacher) {
                System.out.print("");
                unit.display();
            }
        }
        
        System.out.println("Students:");
        for (EducationalUnit unit : getUnits()) {
            if (unit instanceof Student) {
                System.out.print("");
                unit.display();
            }
        }
    }
}