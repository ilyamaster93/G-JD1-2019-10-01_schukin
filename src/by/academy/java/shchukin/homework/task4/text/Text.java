package by.academy.java.shchukin.homework.task4.text;

public class Text {
	//private List<Sentance> centances;
	private String header;
	private String body = "";

	public Text(Word word) {
		header = word.getValue();
	}

	public Text(Sentence sentence) {
		header = sentence.getValue();
	}

	public String getHeader() {
		return header;
	}

	public void addBody(Word word) {
		body += " " + word.getValue();
	}

	public void addBody(Sentence sentence) {
		body += " " + sentence.getValue();
	}

	public String getBody() {
		return body;
	}
}