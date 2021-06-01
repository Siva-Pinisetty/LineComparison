package linecomparison;
import java.util.*;
public class LineComparison {
public static void main(String[] args) {
	System.out.println("Calculating Length using two points");
	float x1,x2,y1,y2,length;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the x1 value:");
	x1=sc.nextFloat();
	System.out.println("enter the y1 value:");
	y1=sc.nextFloat();
	System.out.println("enter the x2 value:");
	x2=sc.nextFloat();
	System.out.println("enter the y2 value:");
	y2=sc.nextFloat();
	length=(float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
	System.out.println("Length b/n points "+"("+x1+","+y1+") & "+"("+x2+","+y2+") "+"is "+length);
}
}