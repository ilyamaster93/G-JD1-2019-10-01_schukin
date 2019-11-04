package by.academy.java.shchukin.homework.taskBankomat;
import java.util.*;

public class Test {
 
    public static void main(String[] args) {
        CashCard card1 = new CashCard("Shchukin", 1234, 2500);
        CashCard card2 = new CashCard("Grinya", 4321, 1000);
         
        Set<CashCard> cashCards = new HashSet<CashCard>();
        cashCards.add(card1);
        cashCards.add(card2);
         
        new ATM(cashCards).run();
    }
}