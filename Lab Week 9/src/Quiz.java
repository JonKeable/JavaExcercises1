import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Quiz {

	private FlashCardReader cardReader;
	private File file = new File("save.txt");
	private String question;
	private String userAns;
	private String ans;
	private PrintStream stream;
	int score;
	int numQuestions = 0;
	
	public Quiz() {
		cardReader = new FlashCardReader();
		while(cardReader.fileReady()) {
			String line = cardReader.getLine();
			cardReader.addCard(line.split(":")[0], line.split(":")[1]);
		}
		play();
	}
	
	private void play() {
		try {
			stream  = new PrintStream(file);
		} catch (FileNotFoundException e1) {
			System.err.println("Error, could not find file.");
		}
		int i = 1;
		score = 0;
		numQuestions = cardReader.getFlashCards().size();
		for(FlashCard fc : cardReader.getFlashCards()) {
			question = fc.getQuestion();
			System.out.println("Question " + i + ": " + question);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			userAns = null;
				try {
					userAns = br.readLine();
				} catch (IOException e) {
					System.err.println("Error Reading Answer");
					System.err.println("Error:" + e);
				}
			ans = fc.getAnswer();
			if(userAns.equalsIgnoreCase(ans)) {
				System.out.println("Correct!");
				score += 1;
			}
			else {
				System.out.println("Incorrect");
				System.out.println("The correct answer was: " + ans);
			}
			save();
			i++;
		}
		saveScore();

		//boolean validIn = false;
		
		while(true) {
			
			System.out.println("Would you like to save your score? (Y/N)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String userIn = null;
			
			try {
				userIn = br.readLine();
			} catch (IOException e) {
				System.err.println("Error reading string");
			}
			
			if(userIn.equalsIgnoreCase("Y")|userIn.equalsIgnoreCase("Yes")) {
				System.out.println("Results saved");
				System.exit(0);
			}
			
			else if(userIn.equalsIgnoreCase("N")|(userIn.equalsIgnoreCase("No"))) {
				 	file.delete();
				 	//System.out.println(file.exists());
				 	System.out.println("Results not saved");
				 	System.exit(0);
				 }
				 else {
					System.out.println("Please enter Y/N or Yes/No answer");
				 }
		}
	}
	
	private void saveScore() {
		int percentage = 100*score/numQuestions;
		stream.append(score + "," + numQuestions + "," + percentage);
		stream.close();

	}

	public void save() {
		
		String correct = "incorrect";
		if(userAns.equalsIgnoreCase(ans)) {
			correct = "correct";
		}
		
		stream.append(question + "," + userAns + "," + correct  + "\r\n");
		
	}
	
	public static void main(String[] args){
		Quiz myQuiz = new Quiz();
	}
}
