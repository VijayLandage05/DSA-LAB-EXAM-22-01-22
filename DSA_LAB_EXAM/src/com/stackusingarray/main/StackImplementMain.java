package com.stackusingarray.main;

import java.util.Scanner;

import com.stackusingarray.demo.StackImplment;

public class StackImplementMain {
	public static void main(String[] args) {  
	    int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    StackImplment s = new StackImplment();  
	    System.out.println("*Stack operations using array*\n");  
	    System.out.println();  
	    while(choice != 4)  
	    {  
	        System.out.println("Chose one from the below options...\n");  
	        System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");  
	        System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   
	                s.push(sc);  
	                break;  
	            }  
	            case 2:  
	            {  
	                s.pop();  
	                break;  
	            }  
	            case 3:  
	            {  
	                s.display();  
	                break;  
	            }  
	            case 4:   
	            {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        }  
	    }  
	} 


}
