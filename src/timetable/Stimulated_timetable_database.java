package timetable;

/**
 *
 * @author Abhi
 */
public class Stimulated_timetable_database {

    
    	int DayID;
	String SchoolSubject1;
	String SchoolSubject2; 
	String SchoolSubject3;
        String SchoolSubject4;
        int Break;
        String Homework1;
        int TimeTaken1;
        int Break1;
        String Homework2;
        int TimeTaken2;
        int Break2;
        String Homework3;
        int TimeTaken3;
        int Break3;
        int Dinner;
        String Homework4;
        int TimeTaken4;
        int Break4;
        int Sleeptime;
	
	
	public Stimulated_timetable_database(String SchoolSubject1){
	this.SchoolSubject1 = SchoolSubject1;	
	}
        
	public Stimulated_timetable_database(String SchoolSubject1,String SchoolSubject2, String SchoolSubject3, String SchoolSubject4, int Break, String Homework1, int TimeTaken1,  int Break1, String Homework2, int TimeTaken2, int Break2, String Homework3, int TimeTaken3, int Break3, int Dinner,  String Homework4, int TimeTaken4, int Break4, int Sleeptime){
		this.SchoolSubject1 = SchoolSubject1;
		this.SchoolSubject2= SchoolSubject2;
		this.SchoolSubject3 = SchoolSubject3;
		this.SchoolSubject4 = SchoolSubject4;
                this.Break = Break;
                this.Homework1 = Homework1;
                this.TimeTaken1 = TimeTaken1;
                this.Break1 = Break1;
                this.Homework2 = Homework2;
                this.TimeTaken2 = TimeTaken2;
                this.Break2 = Break2;
                this.Homework3 = Homework3;
                this.TimeTaken3 = TimeTaken3;
                this.Break3 = Break3;
                this.Dinner = Dinner;
                this.Homework4 = Homework4;
                this.TimeTaken4 = TimeTaken4;
                this.Break4 = Break4;
                this.Sleeptime = Sleeptime;
	}
        
/*	public String getSubject(){
		return Subject;
	}
	public String getDeschome(){
		return Deschome;
	}
	public String getDifficulty(){
		return Difficulty;
	}
	public int getTimetaken(){
		return Timetaken;
	}

	public void setSubject(String setSubjectas){
		this.Subject = setSubjectas;
	}
	public void setDeschome(String setDeschomeAs){
		this.Deschome = setDeschomeAs;
	}
	public void setDifficulty(String setDifficultyAs){
		this.Difficulty = setDifficultyAs;
	}
	public void setTutor(int setTimetakenAs){
		this.Timetaken = setTimetakenAs;
	}
*/	

}	
	

