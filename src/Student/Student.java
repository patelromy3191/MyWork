
package Student;

/** This class **provide info about this class**
 *
 * @author Romil Patel
 */
public class Student {
    private String name;
    private int sid;
    
    {
        name = "";
        sid = 0;
    }
    
//    public Student(String name, int sid)
//    {
//        this.name = name;
//        this.sid = sid;
//    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }
}
