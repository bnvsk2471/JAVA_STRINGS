package String1;

// String object are immutability

/*  String Object : once we create string object we are not allowed to perform any changes in 
    that object. So this non changes behavior is nothing but immutability
*/

public class Test1 {
	
	public static void main(String[] args) {
//
//                                |--------------------These are "String literals" Stores in String Constant pool (SCP) area
//								  |--------------------When ever new keyword is used, It indicates it will create new memory in Heap every time it executes
//                                V
		String s1 = new String("Praveen");
		String s2 = "Praveen";
		s2.concat("Dasari");
		System.out.println(s1);
	}

}

// praveen object are created in SCP 
// s1 is targeting to praveen object
// s1.concat("Dasari") created new object in SCP --> praveenDasari

/*      
 *    Stack Area         String Constant pool
 *     |-------|             |--------------| 
 *     |  s1---|-------------|--> Praveen   |
 *     |       |             |praveenDasari |
 *     |       |             |              |
 *     |       |             |              |
 *     |-------|             |--------------|








*/
