package com.greatlearning.Lab2.Currency;

public class NoteCounts {

	public void  notesCounterImplementation(int notes[], int amount) {
		 int noteCounter[]=new int[notes.length];
		 
		 try {
			
			 for(int i=0; i<notes.length; i++) {
				 if(amount >=notes[i]) {
					 noteCounter[i]=amount/notes[i];
					 amount=amount-noteCounter[i] * notes[i];
				 }
			 }
			 
			 if(amount>0) {
				 System.out.println("\n Amount cannot be given with the highest denomination");
			 }
			 else {
				 System.out.println("\n Payment approach in order to give min no of notes will be");
				 
				 for(int i=0; i<notes.length; i++) {
					 if(noteCounter[i] !=0) {
						 System.out.println(notes[i] + " : " + noteCounter[i]);
					 }
				 }
			 }
			 
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}

}
