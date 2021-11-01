package terminal;
import java.util.*;
public class Main{
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       Calci[] s1 = new Calci[3];
       s1[0] = new Student(2,3);
       s1[1] = new Teacher(5,4);
       s1[2] = new Student(6,1);
      for(Calci s : s1)
         System.out.println(s.well());
    }
}
