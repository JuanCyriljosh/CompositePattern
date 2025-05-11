public class UniversityClient {
    public static void main(String[] args) {

        College newEraUniversity = new College("New Era University");
        
        College college1 = new College("College of Information and Computer Studies");
        
        Department computerScience = new Department("Computer Science");
        Department informationTech = new Department("Information Technology");
        
        Teacher csProf = new Teacher("Prof. Jerry Esperanza", "Software Engineering", 90000.0);
        Student csStudent1 = new Student("Cyriljosh Juan", "CS001", 12000.0);
        Student csStudent2 = new Student("Cedrick Dizon", "CS002", 12000.0);
        
        Teacher itProf = new Teacher("Prof. Angel Galam", "Intelligent Systems", 85000.0);
        Student itStudent = new Student("Redken Roldan", "IT001", 11500.0);

        computerScience.add(csProf);
        computerScience.add(csStudent1);
        computerScience.add(csStudent2);

        informationTech.add(itProf);
        informationTech.add(itStudent);

        college1.add(computerScience);
        college1.add(informationTech);

        newEraUniversity.add(college1);
        
        System.out.println("===== NEW ERA UNIVERSITY STRUCTURE =====");
        newEraUniversity.display();

        System.out.println("\n\n===== COMPUTER SCIENCE DEPARTMENT DETAILS =====");
        System.out.println("Department: " + computerScience.getName());
        System.out.println("Number of Students: " + computerScience.getStudentCount());
        System.out.println("Budget: $" + String.format("%.2f", computerScience.getBudget()));

        System.out.println("\n\n===== UNIVERSITY TOTALS =====");
        System.out.println("Total Students at New Era University: " + newEraUniversity.getStudentCount());
        System.out.println("Total University Budget: $" + String.format("%.2f", newEraUniversity.getBudget()));
    }
}