class Student{
public int id;
public void setId(int id){this.id=id;}
public int getId(){return id;}
}
class BCA{
public static void main(String args[]){
Student ob=new Student();
ob.setId(542);
System.out.println("id:"+ob.getId());
}
}