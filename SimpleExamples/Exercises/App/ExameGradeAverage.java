package Exercises.App;
import javax.swing.JOptionPane;

public class ExameGradeAverage {
    
    private double[] testNote;
	private double testNoteOne;
    private double testNoteTwo;
    
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

	public void setTestNote(double[] testNote) {
		this.testNote = testNote;
	}

	public Double receivesMultipleTestNotes(Double[] testNote) {
		
		Double average = 0.0;
		
		for(int i = 0; i < testNote.length; i++) {
			
			average = average + testNote[i];
		}
		
		return average;
	}
	
    public String receivesTwoTestNotes(Double average){

        if(average >= 7){
            
            return "Approved Student!";
        }
        else if(average < 7){
            
            return "Faleid Student!";
        }
        else {
            return "Invalid Exam Grade";
        }
    }

    public double calculaMedia(int testNoteOne, int testNoteTwo){
        
        return ((this.testNoteOne + this.testNoteTwo) / 2);
    }
    
    public static void main(String[] args) {
		
    	ExameGradeAverage exameGradeAverage = new ExameGradeAverage();
    	int quantityTestExam = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tests: "));
    	Double[] numberOfNotes = new Double[quantityTestExam];
    	int i = 0;
    	
    	do  {
    		
    		numberOfNotes[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: " ));
    		i++;
    		
    	} while (numberOfNotes.length < quantityTestExam);
    	
    	Double average = exameGradeAverage.receivesMultipleTestNotes(numberOfNotes) / quantityTestExam;
    	
    	JOptionPane.showMessageDialog(null, 
    			
    			"Average: " + average
    			+ "\nResult: " + exameGradeAverage.receivesTwoTestNotes(average / quantityTestExam)
    	);
    	
	}
}
