public class Student{
  public int id=201; // acessed throgh the object
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
    System.out.println("id is :"+id);
}
