package timetable;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class Homework_datetimecheck {
    private Date newDate = new java.util.Date();
    SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd");
    
        // RandomAccessFile raf = new RandomAccessFile("/Users/Abhi/Desktop/Database" + Member_loggedin.getLogginusername().toLowerCase() + ".dat", "rw");
    public static String urlpart0 = "/Users/Abhi/Desktop/Database/";
    public static String memberurl = "/Users/Abhi/Desktop/Database/MDatabase.dat";
    private String urlpart1 = "/Users/Abhi/Desktop/Database/Database";
    private String urlpart2 = Member_loggedin.getLogginusername().toLowerCase();
    private String urlpart3 = ft.format(getdate());
    private String urlpart4 = ".dat";
    private String url = "/Users/Abhi/Desktop/Database/Database" + Member_loggedin.getLogginusername().toLowerCase() + ft.format(getdate()) + ".dat";
    
    public Date getdate(){
        return newDate;
    }
    
    public void setdate(Date newdate)
    {
        this.newDate = newdate;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the urlpart1
     */
    public String getUrlpart1() {
        return urlpart1;
    }

    /**
     * @param urlpart1 the urlpart1 to set
     */
    public void setUrlpart1(String urlpart1) {
        this.urlpart1 = urlpart1;
    }

    /**
     * @return the urlpart2
     */
    public String getUrlpart2() {
        return urlpart2;
    }

    /**
     * @param urlpart2 the urlpart2 to set
     */
    public void setUrlpart2(String urlpart2) {
        this.urlpart2 = urlpart2;
    }

    /**
     * @return the urlpart3
     */
    public String getUrlpart3() {
        return urlpart3;
    }

    /**
     * @param urlpart3 the urlpart3 to set
     */
    public void setUrlpart3(String urlpart3) {
        this.urlpart3 = urlpart3;
    }

    /**
     * @return the urlpart4
     */
    public String getUrlpart4() {
        return urlpart4;
    }

    /**
     * @param urlpart4 the urlpart4 to set
     */
    public void setUrlpart4(String urlpart4) {
        this.urlpart4 = urlpart4;
    }

    /**
     * @return the urlpart0
     */
    public String getUrlpart0() {
        return urlpart0;
    }

    /**
     * @param urlpart0 the urlpart0 to set
     */
    public void setUrlpart0(String urlpart0) {
        this.urlpart0 = urlpart0;
    }
    
    
    
    
}
