/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */
public class List_Node {

 // constructor creates a ListNode that refers to object
    List_Node( Homework_database object )
{
     List_Homework_database List = new List_Homework_database();
    int size = List.size();
    List.add(object);
 } // end ListNode one-argument constructor

  // constructor creates ListNode that refers to
    // Object and to next ListNode
    List_Node( Homework_database object, List_Node node )
    {
        
    List_Homework_database List = new List_Homework_database();
    int size = List.size();
    List.add(object, size);

    }
}