package p2;
import java.util.*;
import  p1.*;

public class DemoMethods9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value-1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2:");
		int v2 = s.nextInt();
		System.out.println("*****Choice*******");
		System.out.println("1.add\n2.sub\n3.mul\n4.Div\n5.modDiv");
		System.out.println("Enter the Choice:");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1:
			Addition ad = new Addition();
			int  res1 = ad.add(v1,v2);
			System.out.println("Sum:"+res1);
			break;
		case 2:
			SubStraction  sb = new SubStraction();
			int res2 = sb.sub(v1,v2);
		case 3:
			MultiPlication mb = new MultiPlication();
			int res3 = mb.mul(v1,v2);
			System.out.println("mul:"+res3);
			break;
		case 4:
			 Division dv= new Division();
			 float  res4 = dv.div(v1,v2);
			 System.out.println("Div:"+res4);
			 break;
		case 5:
			ModDivision md1 = new ModDivision();
			int res5= md1.modDiv(v1,v2);
			System.out.println("modDiv:"+res5);
			break;
			default:
				System.out.println("Invalid Choice.......");
		}
		
	}

}
