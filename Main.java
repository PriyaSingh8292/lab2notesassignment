package com.greatlearning.Lab2.Currency;

import java.util.Scanner;

public class Main {
	
	public static <NotesCount> void main(String [] args) {
		
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NoteCounts notesCount=new NoteCounts();
	
		System.out.println("\n Take input of all the currency denominations");
		Scanner sn=new Scanner(System.in);
		
		int size=sn.nextInt();
		int notes[]=new int [size];
		
		System.out.println("\n Please enter currency denomination value");
		
		for(int i=0; i<size; i++) {
			
			notes[i]=sn.nextInt();
		}
		System.out.println("\n Please enter amount you want to pay");
		
		int amount=sn.nextInt();
		
		mergeSortImplementation.sort(notes, 0, notes.length -1);
		notesCount.notesCounterImplementation(notes,amount);
	}
}