import java.util.ArrayList;
import java.util.HashSet;

public class HashcodeEqualsTest {
	public static void main(String args[]){
		Student s1=new Student(1, "Kunal");
		Student s2=new Student(1, "Kunal");
		Student s3=new Student(3, "Karishma");
		Student s4=s1;
		
		System.out.println("S1 Name and hashcode :"+s1.getName()+"," + s1.hashCode());
		System.out.println("S2 Name and hashcode :"+s2.getName()+"," + s2.hashCode());
		System.out.println("S3 hashcode :"+s3.hashCode());
		//If objects are same(points to same memory) then their hashcode must be same.
		System.out.println("S4 hashcode :"+s4.hashCode());
		
		// s1.equals(s2) Return false because s1 and s2 points to different memory.
		// Both have different reference. Thus if you override equals method then you can check the equality of object by checking objects properties
		System.out.println("Equals test s1 and s2:"+s1.equals(s2));
		System.out.println("Equals test s1 and s3:"+s1.equals(s3));
		System.out.println("Equals test s1 and s4:"+s1.equals(s4));
		
		System.out.println("ToString method return ->"+s1.toString());
		System.out.println("========================================");
	}
}
