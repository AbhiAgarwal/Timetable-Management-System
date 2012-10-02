/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.util.ArrayList;

/**
 *
 * @author Abhi
 */
public class Member_details_array {
    private static Member_details[] members = new Member_details[10];    
    // declared in a seperate place to keep the code at the same place    

    /**
     * @return the members
     */
    public static Member_details[] getMembers() {
        return members;
    }

    /**
     * @param aMembers the members to set
     */
    public static void setMembers(Member_details[] aMembers) {
        setMembers(aMembers);
    }
   
    public static void addMember(Member_details member, int x)
    {
        Member_details_array.members[x] = member;
    }
    
}
