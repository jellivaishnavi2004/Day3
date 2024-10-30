class Idcard{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int aadhar_no;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public void setCollege_address(String college_address)
{this.college_address=college_address;}
public void setAy_start(int ay_start)
{this.ay_start=ay_start;}
public void setay_end(int ay_end)
{this.ay_end=ay_end;}
public void setId(int id)
{this.id=id;}
public void Student_ame(String student_name)
{this.student_name=student_name;}
public void Course_name(String course_name)
{this.course_name=course_name;}
public void setAadhar_no(int aadhar_no)
{this.aadhar_no=aadhar_no;}
public String getCollege_name()
{return college_name;}
public String getCollege_address()
{return college_address;}
public void getay_start ()
{return ay_start;}
public void getay_end()
{return ay_end;}
public void id()
{return id;}
public String getstudent_name()
{return student_name;}
public String getcourse_name()
{return course_name;}
public int getaadhar_no()
{return aadhar_no;}
}
class IdcardDemo{
public static void main (String args[]){
Idcard ob=new Idcard();
ob.setCollege_name("mtiet");
ob.setCollege_address("palamaner");
ob.setAy_start(2022);
ob.setAy_end(2026);
ob.setId(542);
ob.setStudent_name("vaishnavi");
ob.setCourse_name("mtiet");
ob.setAadhar_no(7642);
ob.getCollege_name();
ob.getCollege_address();
ob.getAy_start();
ob.getAy_end();
ob.getId();
ob.getStudent_name();
ob.getCourse_name();
ob.getAadhar_no();
System.out.println("College name:" +ob.getCollege_name());
System.out.println("College address:" +ob.getCollege_address());
System.out.println("Ay_start:" +ob.getAy_start());
System.out.println("Ay_end:" +ob.getAy_end());
System.out.println("Id:" +ob.getId());
System.out.println("Student name:"+ob.getStudent_name());
System.out.println("Course name:"+ob.getCourse_name());
System.out.println("Aadhar no:"+ob.getAadhar_no());
}
}