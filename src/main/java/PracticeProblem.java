/**
 * File: If statements
 * Author: Joe Yang
 * Date Created: Mar 23, 2026
 * Date Last Modified: Mar 23, 2026
 */

public class PracticeProblem {

	public static void main(String args[]){}
	
	public static String evenOrOdd(int num){
    if (num % 2 == 0){
        return ("Even");
    }
        return ("Odd");
    }


public static String teacherOrStudent(String user){
    if (user.equals("Kalisz")){
        return "Teacher";
    }

        return "Student";

}

public static int fartherFromZero(int user2){
    if (user2 > 0 ){
        return user2 + 5;
    }
    if (user2 < 0){
        return (user2 - 5);
    }
        return (user2);
}
}