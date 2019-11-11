package by.academy.java.shchukin.homework.task4.text;
public class TextRunner {
    public static void main(String[] args) {
        Word word = new Word("\n Test");
        Text text = new Text(word);

        Word word1 = new Word("\n Variant 1\n");
        Word word2 = new Word("Variant 2\n");
        Word word3 = new Word("Variant 3\n");

        Sentence sentence = new Sentence();
        sentence.addValue(word1);
        sentence.addValue(word2);
        sentence.addValue(word3);

        text.addBody(sentence);

        System.out.println("Head: "+text.getHeader());
        System.out.println("Body: "+text.getBody());

    }
}