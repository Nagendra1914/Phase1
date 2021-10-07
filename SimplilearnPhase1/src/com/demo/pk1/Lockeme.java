package com.demo.pk1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Lockeme {
		
		/*Displaying Application name and Developer Details*/
		public void display()
		{
			System.out.println("Welcome to Lockedme.com");
			System.out.println("Application name is Lockedme.com and Developer is NAGENDRA K N");
		}
		
		/*File operations*/
		
		public void aboutFiles()
		{
	    /*For str you can enter the path from your system*/
		String str = "D:\\Files\\";
		
		File dir = new File(str);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input in numbers");
		int a = scan.nextInt();
		if(a==1)
		{	
		/*Sorting file in ascending order*/
		
			File[] files = dir.listFiles();				
			Arrays.sort(files,(f1,f2) -> f1.compareTo(f2));
			for(File file : files)
			{
				System.out.println("FILE \t"+file.getName());
			}
			this.aboutFiles();
		}

		else if(a==2)
		{
		System.out.println("Enter the operation you like to perform");
		String s= scan.next();
		
		switch (s)	
		{
		/* Case to add file to directory*/
			case "add" :
				try
				{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the file name to be added");
				String sname = br.readLine();
				File file1 = new File(str+""+sname+".txt");
				file1.createNewFile();
				System.out.println(sname+".txt"+" File added successfully");
				this.aboutFiles();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}	
			break;
		/* Case to delete file from directory*/	
			case "delete":
				System.out.println("Enter a file name to be delete");
				String s1 = scan.next();
				File file2 = new File(str+s1+".txt");
				boolean value = file2.delete();
				if(value)
				{
					System.out.println(s1+".txt"+" File is successfully deleted ");
				}
				else
				{
					System.out.println("File not found");
				}
				this.aboutFiles();
				break;
				
		/*Case to search a file from directory*/
				
			case "search":
				System.out.println("Enter a file name to be searched");
				String s2 = scan.next();
				File file3 = new File(str+s2+".txt");

					if(file3.isFile())
					{
						System.out.println("File Found");
					}
					else
					{
						System.out.println("File not found");
					}
					this.aboutFiles();
				break;
				
			default :
				System.out.println("Invalid Selection");
				this.aboutFiles();
				break;
		}

		
		}
		else if(a==3)
		{
		System.out.println("Exiting from Application");
		System.exit(0);
		
		}
		else
		{
			System.out.println("Enter the proper input");
			this.aboutFiles();
		}

		}

		public static void main(String[] args) {
			Lockeme l = new Lockeme();
			l.display();
			l.aboutFiles();
		}
				
				}





