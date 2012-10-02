/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */
public class Member_details {
   
        private int UserID;
	private String Username;
	private String Password; 
	private String Subject1;
        private String Subject2;
        private String Subject3;
        private String Subject4;
        private String Subject5;
        private String Subject6;
        private String Subject7;
        private int delete;
	
	
	public Member_details(String Username){
	this.Username = Username;	
	}
        
	public Member_details(int UserID, String Username, String Password, String Subject1, String Subject2, String Subject3, String Subject4, String Subject5, String Subject6, String Subject7, int delete1){
                this.UserID = UserID;
                this.Username = Username;
		this.Password= Password;
		this.Subject1 = Subject1;
		this.Subject2 = Subject2;
                this.Subject3 = Subject3;
                this.Subject4 = Subject4;
                this.Subject5 = Subject5;
                this.Subject6 = Subject6;
                this.Subject7 = Subject7;
                this.delete = delete1;
	}
        
        public int getUserID(){
		return UserID;
	}
	public String getUsername(){
		return Username;
	}
	public String getPassword(){
		return Password;
	}
	public String getSubject1(){
		return Subject1;
	}
	public String getSubject2(){
		return Subject2;
	}
        public String getSubject3(){
		return Subject3;
	}
        public String getSubject4(){
		return Subject4;
	}
        public String getSubject5(){
		return Subject5;
	}
        public String getSubject6(){
		return Subject6;
	}
        public String getSubject7(){
		return Subject7;
	}
                public int getDelete(){
		return delete;
	}
        
        
	public void setUserID(int setUserIDas){
		this.UserID = setUserIDas;
	}
        public void setUsername(String setUsername){
		this.Username = setUsername;
	}  
        public void setPassword(String setPassword){
		this.Password = setPassword;
	}
        public void setSubject1(String setSubject){
		this.Subject1 = setSubject;
	}
        public void setSubject2(String setSubject){
		this.Subject2 = setSubject;
	}
        public void setSubjec3(String setSubject){
		this.Subject3 = setSubject;
	}
        public void setSubject4(String setSubject){
		this.Subject4 = setSubject;
	}
        public void setSubject5(String setSubject){
		this.Subject5 = setSubject;
	}
        public void setSubject6(String setSubject){
		this.Subject6 = setSubject;
	}
        public void setSubject7(String setSubject){
		this.Subject7 = setSubject;
	}
                public void setDelete(int setDelete2){
		this.delete = setDelete2;
	}
}

