package timetable;

/**
 *
 * @author Abhi
 */

public class List_Homework_database {

	private Node head; 
	private int listCount;
        
	public List_Homework_database()                                 // Constructor used in order to 
	{                                                               // initialize the Linked List
            head = new Node(null);                                      // declares the node of the head as null
            listCount = 0;                                              // The count of the list right now is 0
	}

	public void add(Homework_database data)                         // A function to add the next node
                                                                        // to the linked list and put the object Homework_database into the node
	{                                                               // Opening parentheses
            Node temp = new Node(data);                                 // A new node with the data of the object is put into a temp node
            Node current = head;                                        // The current node equals the head of the linked list
	while(current.getNext() != null)                                // While the location of the next node does not equal null
	{
            current = current.getNext();                                // The current node equals the next node
	}                                                               // Closing parentheses
        
	current.setNext(temp);                                          // The next node of the current node is the temp node
	listCount++;        }                                           // Increases the count of the list by 1
        

	public void add(Homework_database data, int index)              // Function similar to the one above but this one also has an index of where the user adds it into the linked list
	{                                                               // Opening parentheses
            
            Node temp = new Node(data);                                 // A new node with the data of the object is put into a temp node
            Node current = head;                                        // The current node equals the head of the linked list
            
            
	for(int i = 1; i < index && current.getNext() != null; i++)     // 
	{                                                               // Opening parentheses
            current = current.getNext();                                // Sets current to the value of the next node
	}                                                               // Closing parentheses
            temp.setNext(current.getNext());                            // Sets the next node of the temporary node to the next node of the current node
            current.setNext(temp);                                      // The next node of the current ndoe is the temporary node
            listCount++;                                                // Increases the count of the list by 1
	}                                                               // Closing parentheses
        
        public String print()                                           // Function to print the value of inside the linked list
        {                                                               // Opening parentheses
            return this.toString();                                     // Returns the linked list but converted into string using the .toString() function
        }                                                               // Closing parentheses


	public Homework_database get(int index)                         // Function to get the value from a particular position in the linked list
	{                                                               // Opening parentheses
            if(index <= 0) {                                            // Opening parentheses
                
            return null;                                                // If the condition of the "If" loop is true then it returns null - because in this cause it would mean that the position which it is required to get is invalid, there is no position less than or equal to 0.
                    
        }                                                               // Closing parentheses
            
                Node current = head.getNext();                          // Creates a new node called current where the position is the next node of the head, points the new node to the next node
                
                    for(int i = 1; i < index; i++)                      // "For" loop, with the condition that while i is less than index (which has been entered by the user) execute...
                        
                    {                                                   // Opening parentheses
                        
                        if(current.getNext() == null)                   // "If" Loop: if the next node of the node which had been declared earlier equals zero
                        {                                        
                             return null;                               // Then the program will return null
                        }                                               // Closing parentheses
                        current = current.getNext();                    // Seet the variable current and set it as the next node until it equals to one the user requires
                        
                    }                                                   // Closing parentheses
                    
                return current.getData();                               // Return the data inside the current node
	}
        

	public boolean remove(int index)                                // This function removes a node from a particular position specified by the user
            {                                                           // Opening parentheses
                if(index < 1 || index > size())                         // "If" Loop to check if the index is less than one or the index is greater than the size
                {                                                       // Open parentheses
                    return false;                                       // Then return false
                }                                                       // Close parentheses
                
                Node current = head;                                    // Make the node of the current node to the head
                
            for(int i = 1; i < index; i++)                              // "For" loop, execute until the value of i is less than index.
                {
                    if(current.getNext() == null)
                        return false;

                        current = current.getNext();
                
                }
            
                current.setNext(current.getNext().getNext());
                listCount--;                 
                return true;
                
	}

	public int size()                                               // This function is to return the size, with a return value of an int
	{                                                               // Opening parentheses
            return listCount;                                           // Returns the size of the list
	}                                                               // Closing parentheses

        public boolean isEmpty( )                                       // This function checks if the linked list is empty or not, returning a boolean
        {                                                               // Opening parentheses
            return head.next == null;                                   // If the next node of the head equals null, it returns either 0 or 1
        }                                                               // Closing parentheses
            
        public void makeEmpty( )                                        // This function points the head to null, so it will remove everything from the linked list
        {                                                               // Opening parentheses
            head.next = null;                                           // Points the next node of the head of the linked list to null
        }                                                               // Closing parentheses
        
           
        
    @Override
    
	public String toString()                                        // This function converts the linked list into a string, so it can be outputted, and returns it
            {                                                           // Opening parentheses
                Node current = head.getNext();                          // Creates a new node and points it towards the next next node of the head
                String output = "";                                     // The current output is "" 
                    while(current != null)                              // While the current node isn't pointing to null
                {                                                       // Opening parentheses
                    output += current.getData().getSubject().trim() + "\t" + current.getData().getDeschome().trim() + "\t" + current.getData().getDifficulty().trim() + "\t" + current.getData().getTimetaken()  + "\n";
                    // Inserts the different subjects and other values stored in the object into the String
                    
                    current = current.getNext();                        // Points current towards the next node
                }                                                       // Closing parentheses
                    return output;                                      // Returns the output
            }                                                           // Closing parentheses
    
   
    
	private class Node                                              // New class called Node
            {                                                           // Opening parentheses

	Node next;                                                      // Creates variable called "next" with the data member of "Node"
	Homework_database data;                                         // Initializes the object "Homework_database" with variable name data 


	public Node(Homework_database CurrentSubject)                   // This function creates a new node with the contents of an initalized object Homework_database
              {                                                         // Opening parentheses
                    next = null;                                        // Sets the Node next to null
                    data = CurrentSubject;                              // Sets the data to the entered instance of the object
              }                                                         // Closing parentheses

	public Node(Homework_database CurrentSubject, Node nextSubject) // Inserts a node with a particular instance of an object at a particular position specified by the user
             {                                                          // Opening parentheses
                   next = nextSubject;                                  // Sets the Node next to the next position
                   data = CurrentSubject;                               // Sets the data of the node as an instance of Homework_database
             }                                                          // Closing parentheses

	public Homework_database getData()                              // This function gets the data of a particular node
            {                                                           // Opening parentheses
                    return data;                                        // returns the instance of the object Homework_database
            }                                                           // Closing parentheses
            
	public void setData(Homework_database CurrentSubject)           // This function sets the data of a particular node, or alters it
                
            {                                                           // Opening parentheses
                    data = CurrentSubject;                              // sets the data to the new instance entered by the user
            }                                                           // Closing parentheses

	public Node getNext()                                           // This function gets the next node position, it's a accessor
            {                                                           // Opening parentheses
                    return next;                                        // Returns the value of the next node
            }                                                           // Closing parentheses
        
	public void setNext(Node nextSubject)                           // This function sets the next node, alters the value of next, it's a mutator
            {                                                           // Opening parentheses
                    next = nextSubject;                                 // Sets the value of next to the node
            }                                                           // Closing parentheses

	}                                                               // Closing parentheses
        
        
        /*
        public void bubbleSort(List_Homework_database list) {  
        if(list.isEmpty())  
            System.out.println("List is currently empty.");  
        else if (list.size() == 1) {
            System.out.println("List is already sorted.");
        }  
        else {  
            Node current = list.getFirst();  
            boolean exchangeMade = true;  
            while(exchangeMade) {  
                current = list.getFirst();  
                exchangeMade = false;  
   
                // Start at the beginning and loop over all elements                             
                while(current != null) {  
                    if(current.getData().Timetaken > current.getNext().getData().Timetaken) {  
                        int temp = current.getData().Timetaken;  
                        current.setData(current.getNext().getData());  
                        current.getNext().setData(temp);  
                        exchangeMade = true;  
                    }  
                    current = current.getNext();  
                }  
                  
            }  
            }  
        }      
         * 
         */
   
        /*
        public void bubbleSort(List_Homework_database items)
{
for(int sort=1;sort<items.getSize();sort++)
{
singleSort(items);
}
}
 
public void singleSort(List_Homework_database items)
{
for(int item=0;item<items.getSize()-1;item++)
{
Integer left=(Integer)items.get(item);
Integer right=(Integer)items.get(item+1);
 
if(left.intValue() > right.intValue()) swap(items, item+1);
}
}
 
public void swap(List_Homework_database items,int right_index)
{
Integer right=items.remove(right_index);
items.add(right_index-1,right);
}
         * 
         */

        /*
static void bubbleSort(int lenght)
	    {
                
          List_Homework_database L = new List_Homework_database();
	        Node n;
	        boolean isSorted=false;
	         
	        for(int i=lenght-1; i>1 && isSorted==false; i--)
	        {           
         for(int j=0; j<i; j++)
	            {
	                n=L.head;
	                isSorted=true;
                        
                for(int k=0; k < n.next.data.Timetaken; k++)
	                {
	                    isSorted=false;
	                    swap(n, n.next);
	                }
            }
	        }
    }
	     
	    //fungsi penukaran
	    static void swap(Node N1, Node N2)
	    {
	        int temp=N1.data.Timetaken;
	        N1.data.Timetaken=N2.data.Timetaken;
	        N2.data.Timetaken=temp;
	         
	    }
         * 
         */
  
}                                                                   // Closing parentheses





