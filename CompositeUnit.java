import java.util.ArrayList;
import java.util.List;

abstract class CompositeUnit implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();
    
    public CompositeUnit(String name) {
        this.name = name;
    }
    
    public void add(EducationalUnit unit) {
        units.add(unit);
    }
    
    public void remove(EducationalUnit unit) {
        units.remove(unit);
    }
    
    public EducationalUnit getChild(int index) {
        return units.get(index);
    }
    
    public List<EducationalUnit> getUnits() {
        return units;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public int getStudentCount() {
        int totalStudents = 0;
        for (EducationalUnit unit : units) {
            totalStudents += unit.getStudentCount();
        }
        return totalStudents;
    }
    
    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (EducationalUnit unit : units) {
            totalBudget += unit.getBudget();
        }
        return totalBudget;
    }
    
    @Override
    public abstract void display(); 
}