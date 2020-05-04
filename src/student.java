public class student
{

  private String name;
  private double totalscore;
  private int numQuiz;
  
public student()
 	{
	 this.name = name;
	 numQuiz = 0;
	 totalscore = 0;
 	}

public String getName() 
	{
    return name;
    }

public void addQuiz(double quizscore)
	{
	totalscore+=quizscore;
	numQuiz++; 
	} 

public double getTotalScore () 
 	{ 
	return totalscore; 
 	} 


 public double getAverageScore () 
 	{ 
	 return totalscore/numQuiz; 
 	} 
 }

