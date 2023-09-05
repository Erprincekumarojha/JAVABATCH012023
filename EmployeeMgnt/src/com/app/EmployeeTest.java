package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Employee> emplist = new ArrayList<Employee>();
       
        ObjectInputStream ons = null;
		
        ObjectOutputStream oos = null;
		
        File file =  new File("employeelist.dat"); 
        if(file.exists()) {
        	try {
        		
        		ons =  new ObjectInputStream(new FileInputStream(file));
		       emplist =  (ArrayList<Employee>)ons.readObject();
			} catch (ClassNotFoundException | IOException e) {
				//e.printStackTrace();
			}
        }
        
        try {
			oos = new ObjectOutputStream(new FileOutputStream(file, true));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		while (true) {
			System.out.println("\t\tEmployee Management Project");
			System.out.println("--------------------------------------------");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.DISPLAY");
			System.out.println("0.EXIT");

			System.out.print("\n\nEnter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: 
                    System.out.println("----Employee Details------");
                    System.out.print("Enter EmpID : ");
                    int empid = sc.nextInt();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Emp Salary : ");
                    double salary = sc.nextDouble();
                    Employee e = new Employee(empid, name, salary);
                    emplist.add(e);
                    
                    //push data in file
                    try {
						oos.writeObject(emplist);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                   break;  
			
			case 2: {
                  break;
			}
			case 3: {
                 break;
			}
			case 4: 
                 System.out.println("----------Employee List-------------");
                 for(Employee emp : emplist) {
                	 System.out.println(emp.toString());
                 }
			      break;
			case 0: {
                 System.exit(0);
			}
			default:
				System.out.println("Please select correct option");
				break;
			}

		}
	}

}
