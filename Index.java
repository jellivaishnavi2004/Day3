class Index{
private String name;
private String sub;
private String std;
private String div;
private int rollno;
private String col;
public void setName(String name){
this.name=name;
}
public void setSub(String sub){
this.sub=sub;
}
public void setStd(String std){
this.std=std;
}
public void setDiv(String div){
this.div=div;
}
public void setRollno(int rollno){
this.rollno=rollno;
}
public void setCol(String col){
this.col=col;
}
public String getName(){
return name;
}
public String getSub(){
return sub;
}
public String getStd(){
return std;
}
public String getDiv(){
return div;
}
public int getRollno(){
return rollno;
}
public String getCol(){
return col;
}
}
class IndexDemo{
public static void main(String args[]){
Index ob=new Index();
ob.setName("vaishnavi");
ob.setSub("java");
ob.setStd("second year");
ob.setDiv("A-Section");
ob.setRollno(542);
ob.setCol("mtiet");
ob.getName();
ob.getSub();
ob.getStd();
ob.getDiv();
ob.getRollno();
ob.getCol();
System.out.println("Name:"+ob.getName());
System.out.println("Sub:"+ob.getSub());
System.out.println("Std:"+ob.getStd());
System.out.println("Div:"+ob.getDiv());
System.out.println("Rollno:"+ob.getRollno());
System.out.println("Col:"+ob.getCol());
}
}

