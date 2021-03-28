import java.util.Scanner;

import ADTs.*;


public class check {
	
	public static void main(String args []) {
		
		Scanner aa = new Scanner (System.in);
		Scanner bb = new Scanner (System.in);
		
		StackAsArray FrStd = new StackAsArray(100);
		StackAsArray GrStd = new StackAsArray(100);
		StackAsArray PoStd = new StackAsArray(100);
		StackAsArray FrID = new StackAsArray(100);
		StackAsArray GrID = new StackAsArray(100);
		StackAsArray PoID = new StackAsArray(100);
		
		
		int Fcount = 0;
		int Gcount = 0;
		int Pcount = 0;
		
		String StdName;
		
		int StId, type;
		
		System.out.println("*****************************************************************");
		System.out.println("Welcome to University Student Statistical System \n");
		
		
		
		do {
			System.out.println("\n*****************************************************************");
			System.out.println ("1.Freshman Student" );
			System.out.println ("2.Graduate Student");
			System.out.println ("3.Postpone Student");
			System.out.println ("0. Exit from the system");
			System.out.println("\n*****************************************************************");
			
			System.out.println("Which Type You Are :");
			
			type = aa.nextInt();
			
			System.out.println();
			
			switch(type) {
			
			case 1:
				
				System.out.print ("Enter Your Name: ");
				StdName = bb.nextLine();
				
				System.out.print ("Enter Your ID: ");
				StId = aa.nextInt();
				
				FrStd.push(StdName);
				FrID.push(StId);
				
				Fcount++;
				break;
				
			case 2 :
				System.out.print ("Enter Your Name: ");
				StdName = bb.nextLine();
				
				System.out.print ("Enter Your ID: ");
				StId = aa.nextInt();
				
				GrStd.push(StdName);
				GrID.push(StId);
				
				Gcount++;
				break;
				
			case 3:
				System.out.print("Enter Your Name: "); 
				StdName = bb.nextLine(); 
				
				System.out.print("Enter Your ID: "); 
				StId= aa.nextInt();
				
				PoStd.push(StdName);
				PoID.push(StId);
				
				Pcount++;
				break;
			}
			
		}
		
		while(type!=0);
		
		if (!(FrStd.isEmpty())&&(FrID.isEmpty())) {
			
			Enumeration fName = FrStd.getEnumeration();
			Enumeration fId = FrID.getEnumeration();
			
			System.out.println ();
			
			System.out.println ("****************** List of Freshman Students ******************\n ");
			System.out.println ("Student Name \t\t\t Student ID \n");
			
		while((fName.hasMoreElements())&&(fId.hasMoreElements())) {
		System.out.println (fName.nextElement()+"\t\t\t"+fId.nextElement());
				}
		
			System.out.println("\n*****************************************************************");

		}
		
		if (!(GrStd.isEmpty())&&(GrID.isEmpty())){
			
			Enumeration gName = GrStd.getEnumeration();
			Enumeration gId = GrID.getEnumeration();
			
			System.out.println ();
			
			System.out.println ("****************** List of Graduation Students ******************\n");
			System.out.println ("Student Name \t\t\t Student ID \n");
			
			while((gName.hasMoreElements())&&(gId.hasMoreElements())) {
				System.out.println (gName.nextElement()+"\t\t\t"+gId.nextElement());
				}
			System.out.println("\n*****************************************************************");
		
		}
		
		if (!(PoStd.isEmpty())&&(PoID.isEmpty())) {
			
			Enumeration pName = PoStd.getEnumeration();
			Enumeration pId = PoID.getEnumeration();
		
			System.out.println ();
			
			System.out.println ("****************** List of Postpone Students ******************\n ");
			System.out.println ("Student Name \t\t\t Student ID \n");
			
			while((pName.hasMoreElements())&&(pId.hasMoreElements())) {
				System.out.println (pName.nextElement()+"\t\t\t"+pId.nextElement());
			}
			System.out.println("\n*****************************************************************");
			
		}
		
		System.out.println ();
		
		
		System.out.println ("******************Summary of Statistical Results******************\n");
		
		System.out.println ("Total number of Freshman Students:"+Fcount);
		System.out.println ("Total number of Graduation Students:"+ Gcount);
		System.out.println ("Total number of Postpone Students:"+Pcount);
		
		
		System.out.println("\n*****************************************************************");
		
		System.out.println ("\nThank you for using the system");
		
		System.out.println("\n*****************************************************************");
		
			
	}

}
