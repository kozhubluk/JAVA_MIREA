package Practice2.Ex9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> c = new ArrayList<>(); // создаем колоду карт
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                c.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(c); // "перемешиваем" колоду
        int num; // кол-во игроков
        num = sc.nextInt();
        if (num > 10 || num < 2) System.out.println("Должно быть не более 10 игроков и не менее 2!");
        else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(c.get(i * 5 + j));
                }
                System.out.println("\n");
            }
        }
    }

}
