class Student{
public String name;
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class BCA{
public static void main(String args[]){
Student ob=new Student();
ob.setName("vaishnavi");
System.out.println("Name:"+ob.getName());
}
}