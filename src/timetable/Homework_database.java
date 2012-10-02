package timetable;

/**
 *
 * @author Abhi Agarwal
 * Timetable Management System
 * Abhi Agarwal, 30th January 2012
 * Bangkok Patana School
 * 
 * Mac Book Pro 10.7, 2.66 GHz Intel Core i7, 4GB 1067 MHz DDR3
 * The object to create an instance of the Homework
 * Integrated Development Environment Netbeans 7.0.1
 * 
 */

public class Homework_database {

    
    	private int HomeworkID;
	private String Subject;
	private String Deschome; 
	private String Difficulty;
        private int Timetaken;
        private int delete;
	
	
	public Homework_database(String Subject){
	this.Subject = Subject;	
	}
        
	public Homework_database(String Subject,String Deschome, String Difficulty,int Timetaken){
		this.Subject = Subject;
		this.Deschome= Deschome;
		this.Difficulty = Difficulty;
		this.Timetaken = Timetaken;
	}
        
        public Homework_database(String Subject,String Deschome, String Difficulty,int Timetaken, int delete1){
		this.Subject = Subject;
		this.Deschome= Deschome;
		this.Difficulty = Difficulty;
		this.Timetaken = Timetaken;
                this.delete = delete1;
	}
        
        public Homework_database(int ID, String Subject,String Deschome, String Difficulty,int Timetaken, int delete1){
                this.HomeworkID = ID;	
                this.Subject = Subject;
		this.Deschome= Deschome;
		this.Difficulty = Difficulty;
		this.Timetaken = Timetaken;
                this.delete = delete1;
	}
        
	public String getSubject(){
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
        public int getDelete(){
		return delete;
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
		this.setTimetaken(setTimetakenAs);
	}
        public void setDelete(int setDeleteAs){
		this.delete = (setDeleteAs);
	}

    /**
     * @return the HomeworkID
     */
    public int getHomeworkID() {
        return HomeworkID;
    }

    /**
     * @param HomeworkID the HomeworkID to set
     */
    public void setHomeworkID(int HomeworkID) {
        this.HomeworkID = HomeworkID;
    }

    /**
     * @param Timetaken the Timetaken to set
     */
    public void setTimetaken(int Timetaken) {
        this.Timetaken = Timetaken;
    }
	

}	
	

