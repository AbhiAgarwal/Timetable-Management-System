/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

/**
 *
 * @author Abhi
 */
public class checkOS {

    private static boolean isWindows = false;
    private static boolean isLinux = false;
    private static boolean isMac = false;

    static
    {
        String operatingsystem = System.getProperty("os.name").toLowerCase();
        isWindows = operatingsystem.contains("win");
        isLinux = operatingsystem.contains("nux") || operatingsystem.contains("nix");
        isMac = operatingsystem.contains("mac");
    }

    public static boolean isWindows() {
                        return isWindows; 
    }
    public static boolean isLinux() { 
                        return isLinux; 
    }
    public static boolean isMac() { 
                        return isMac; 
    }
    ;

}
