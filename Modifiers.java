public class Student{
  public static int id=201; // acessed throgh the object
  private long phone=9876512340l;// only through getters and setters
  default String name="Swetha";//can be acessed within package
  protected int marks=89; //can be accessed by child classes
  public long getPhone(){
    return phone;
  }
  public void setPhone(long phone){
    this.phone=phone;
  }
}
public class Main{
  public static void main(String[] args){
    System.out.println("id is :"+Student.id);
    Student student=new Student();
    System.out.println("phone number is :"+student.getPhone());
    System.out.println("marks are  :"+Student.marks);
    System.out.println("name is :"+Student.name);
    
}
