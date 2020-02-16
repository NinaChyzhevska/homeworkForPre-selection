package module3;

public class Main {
    public static void main(String[] args) {
        // TASK 8
        Deck deck = new Deck();
        Card card = new Card();
        card.setRank("Queen");
        card.setSuit("clubs");
        deck.addCard(card);
        Card card2 = new Card();
        card2.setRank("7");
        card2.setSuit("clubs");
        deck.addCard(card2);
        Card card3 = new Card();
        card3.setRank("King");
        card3.setSuit("hearts");
        deck.addCard(card3);
        deck.drawCards();
        // TASK 9
        System.out.println(Accounting.pay(8,8.5));
        // TASK 10
        Employee employee1 = new Employee("Name1", "Surname1");
        employee1.printEmployee();
        Employee employee2 = new Employee();
        employee2.setName("Name2");
        employee2.setSurname("Surname2");
        employee2.printEmployee();
    }
}
