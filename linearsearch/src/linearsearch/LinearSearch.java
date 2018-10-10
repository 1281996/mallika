package linearsearch;

import java.util.Scanner;

public class LinearSearch {

	 

		boolean searchEleFound() {
		
			Scanner sc=new Scanner(System.in);
			int i,search;
			boolean flag=false;
			System.out.println("Enter size of Array");
			int a=sc.nextInt();
			int num[]=new int[a];
			
			for(i=0;i<num.length;i++)
			{
				System.out.println("enter element");
				int b=sc.nextInt();	
			    num[i]=b;
			}
			System.out.println("enter search element");
			search=sc.nextInt();
			for(i=0;i<num.length;i++)
			{
				if(num[i]==search)
				{
				System.out.println("element is found at   " +i+ "  index");
				flag=true;
				break;
				}
				
				
			}
			return flag;
		}
	
		
			

}
