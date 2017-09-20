import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class FlashCardReader {

	private BufferedReader reader;
	private ArrayList<FlashCard> flashCards = new ArrayList<FlashCard>();
	
	public FlashCardReader() {
		try {
			reader = new BufferedReader(new FileReader(".\\Questions.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("Error: " + e);
		}
	}
	
	public void addCard(String q, String a) {
		//System.out.println(q + "   " + a);;
		flashCards.add(new FlashCard(q,a));
	}
	
	public ArrayList<FlashCard> getFlashCards() {
		return flashCards;
	}
	
	public String getLine() {
		try {
			//System.out.println(reader.readLine());
			return reader.readLine();
		} catch (IOException e) {
			System.err.println("Error" + e);
			return null;
		}
	}
	
	public boolean fileReady() {
		try {
			return reader.ready();
		} catch (IOException e) {
			System.err.println("Error: " + e);
			return false;
		}
		
	}
}
