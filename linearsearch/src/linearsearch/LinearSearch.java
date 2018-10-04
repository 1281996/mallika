package linearsearch;

import java.util.Scanner;

public class LinearSearch {

	 

		boolean searchEleFound(int search) {
		
			Scanner sc=new Scanner(System.in);
			int i;
			boolean flag=false;
			System.out.println("enter size of array");
			int a=sc.nextInt();
			int num[]=new int[a];
			
			for(i=0;i<num.length;i++)
			{
				System.out.println("enter element");
				int b=sc.nextInt();	
			    num[i]=	b;
			}
			
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