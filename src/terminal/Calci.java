package terminal;
abstract class Calci{
int a;   
int b; 
Calci(int a,int b)
 {
  this.a=a;
  this.b=b;
} 
 abstract int well();
}
class Teacher extends Calci{
 Teacher(int a,int b)
{
   super(a,b);
}  
 public int well(){
    System.out.print("Welcome Teacher..! ");
    return (a+b)*2;
                                              }
}
class Student extends Calci{
 Student(int a,int b)
{
   super(a,b);
}   
 public int well(){
    System.out.print("Welcome Student..! ");
    return (a+b)/2;    
}
}
