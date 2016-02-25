public class ShowStudent
{
    public static void main(String[] args)
    {
        double gpa = 4.0;
        Student student1 = new Student();
        gpa = student1.getGPA();
        System.out.println("Student ID: " + student1.getStudentId() + " Credit Hours: " + student1.getCreditHours() + " Points Earned: " + student1.getPointsEarned() + " GPA: " + gpa);
        Student student2 = new Student(1234,6,23);
        gpa = student2.getGPA();
        System.out.println("Student ID: " + student2.getStudentId() + " Credit Hours: " + student2.getCreditHours() + " Points Earned: " + student2.getPointsEarned() + " GPA: " + gpa);
    }
}