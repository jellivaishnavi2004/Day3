public class WrapperUnboxing{  
public static void main(String args[]){  
byte b=10;  
short s=20;  
int i=30;  
long l=40;  
float f=50.0F;  
double d=60.0D;  
char c='a';  
boolean b2=true;  
Byte byteobj=b;  
Short shortobj=s;  
Integer intobj=i;  
Long longobj=l;  
Float floatobj=f;  
Double doubleobj=d;  
Character charobj=c;  
Boolean boolobj=b2;  
  
//Printing primitives  
System.out.println("---Printing primitive values---");  
System.out.println("Byte value: "+byteobj);  
System.out.println("Short value: "+shortobj);  
System.out.println("Int value: "+intobj);  
System.out.println("Long value: "+longobj);  
System.out.println("Float value: "+floatobj);  
System.out.println("Double value: "+doubleobj);  
System.out.println("Char value: "+charobj);  
System.out.println("Boolean value: "+boolobj);  
}
}