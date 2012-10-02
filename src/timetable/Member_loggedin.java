/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */
public class Member_loggedin {
     private static String logginusername;
     private static int number;

    /**
     * @return the logginusername
     */
    public static String getLogginusername() {
        return logginusername.toLowerCase();
    }

    public static String getLogginusername2() {
        return logginusername;
    }
    
    /**
     * @param aLogginusername the logginusername to set
     */
    public static void setLogginusername(String aLogginusername) {
        logginusername = aLogginusername;
    }
    
        public static int getNumber() {
        return number;
    }

    /**
     * @param aLogginusername the logginusername to set
     */
    public static void setNumber(int number1) {
        number = number1;
    }
}
