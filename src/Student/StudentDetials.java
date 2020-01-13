
package Student;

/** This class **provide info about this class**
 *
 * @author Romil Patel
 */
public class StudentDetials {
    public static void main(String[] args)
    {
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Sivgami"); s1.setSid(123);
        
        Student s2 = new Student();
        s2.setName("Bahubali"); s2.setSid(124);
        
        Student s3 = new Student();
        s3.setName("Kattappa"); s3.setSid(456);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0 ; i< list.length; i++)
        {
            System.out.println("Name : " +list[i].getName()+" Id is :" + list[i].getSid());
        }
    }
}
