package com.greatlearning.service;

public class NotesCount {
	
	public void notesCountImplementation(int[] notes, int amount) {
		int[] countOfNotes = new int[notes.length];
		try {
			for(int j=0; j<notes.length; j++) {
				int z = amount/notes[j];
				amount = amount-(notes[j]*z);
				countOfNotes[j]=z;
				if(amount == 0) {
					break;
				}
			}
			if(amount == 0) {
				int totalNotes=0;
				for(int x=0; x<countOfNotes.length; x++) {
					totalNotes = totalNotes + countOfNotes[x];
				}
				System.out.println("Can pay with min "+totalNotes+" notes.");
			}else {
				System.out.println("Cannot pay amount with these denominations.");
			}
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
