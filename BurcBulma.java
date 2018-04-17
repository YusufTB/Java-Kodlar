package odev;
import java.util.*;
public class burc {
public static void main(String[] args) {
Scanner oku=new Scanner(System.in);
int gun;
int ay;
 
System.out.println("Doðum gününüzü yazýn");
gun=oku.nextInt();
 
System.out.println("Doðum ayýnýzý yazýn(rakam olarak)");
ay=oku.nextInt();
 
burc(gun,ay);
}
 
public static void burc(int gun, int ay){

if((gun<18 & ay==2) || (gun>21 & ay==1) ){
System.out.print("Burcunuz: Kova");
}
if((gun<20 & ay==3) || (gun>19 & ay==2) ){
System.out.print("Burcunuz: Balýk");
}
if((gun<20 & ay==4) || (gun>21 & ay==3) ){
System.out.print("Burcunuz: Koc");
}
if((gun<20 & ay==5) || (gun>21 & ay==4) ){
System.out.print("Burcunuz: Boga");
}
if((gun<21 & ay==6) || (gun>21 & ay==5) ){
System.out.print("Burcunuz: ikýzler");
}
if((gun<22 & ay==7) || (gun>22 & ay==6) ){
System.out.print("Burcunuz: Yengec");
}
if((gun<22 & ay==8) || (gun>23 & ay==7) ){
System.out.print("Burcunuz: Aslan");
} 
if((gun<22 & ay==9) || (gun>23 & ay==8) ){
System.out.print("Burcunuz: Baþak");
}
if((gun<22 & ay==10) || (gun>23 & ay==9) ){
System.out.print("Burcunuz: Terazi");
}
if((gun>23 & ay==10) ||(gun<21 & ay==11) ){
System.out.print("burcunuz: Akrep");
}
if((gun<21 & ay==12) || (gun>23 & ay==11) ){
System.out.print("Burcunuz: Yay");
}
if((gun<20 & ay==1) || (gun>22 & ay==12) ){
System.out.print("Burcunuz: Oglak");
}
}
}