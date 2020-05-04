public class studentTester
{

public static void main(String[] args) 
{
student student = new student ();
student.addQuiz(90);
student.addQuiz(85);

System.out.println(student.getName());
System.out.println(student.getTotalScore());
System.out.println(student.getAverageScore());


}

}	 
