package Programs.Class;

import java.util.Arrays;
import java.util.Objects;

public class Grades {
    
    private double[] testNote;
	private double testNoteOne;
    private double testNoteTwo;
    
    public Grades() {
		
	}

	public Grades(double[] testNote, double testNoteOne, double testNoteTwo) {
		
		this.testNote = testNote;
		this.testNoteOne = testNoteOne;
		this.testNoteTwo = testNoteTwo;
	}

	public double getTestNoteOne() {
		return testNoteOne;
	}

	public void setTestNoteOne(double testNoteOne) {
		this.testNoteOne = testNoteOne;
	}

	public double getTestNoteTwo() {
		return testNoteTwo;
	}

	public void setTestNoteTwo(double testNoteTwo) {
		this.testNoteTwo = testNoteTwo;
	}

	public double[] getTestNote() {
		return testNote;
	}

	public void setTestNote(double[] numberOfNotes) {
		this.testNote = numberOfNotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(testNote);
		result = prime * result + Objects.hash(testNoteOne, testNoteTwo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grades other = (Grades) obj;
		return Arrays.equals(testNote, other.testNote)
				&& Double.doubleToLongBits(testNoteOne) == Double.doubleToLongBits(other.testNoteOne)
				&& Double.doubleToLongBits(testNoteTwo) == Double.doubleToLongBits(other.testNoteTwo);
	}    
}
