/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */
public class List_load {
    
   private List_Homework_database list = new List_Homework_database();
    
    public void List_load()
    {
                 Timetable_main_RWRAF.read(0);
       
for(int i=0; i<=Timetable_main_RWRAF.getLength(); i++)
{
    Timetable_main_RWRAF.read(i);

int ID = Timetable_main_RWRAF.getID();
            
String Subject = Timetable_main_RWRAF.getSubject();
           
String desc = (Timetable_main_RWRAF.getDesc());
           
String diff = (Timetable_main_RWRAF.getDiff());

int time = (Timetable_main_RWRAF.getTime());

int delete = Timetable_main_RWRAF.checkDelete();

Homework_database details = new Homework_database(Subject, desc, diff, time);

            getList().add(details);


        }
    }

    /**
     * @return the list
     */
    public List_Homework_database getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List_Homework_database list) {
        this.list = list;
    }
}
