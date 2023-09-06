package task9;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class poker {


    public static void main(String[] args) {
        //инициализация карт
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        ArrayList<card> cards = new ArrayList<card>();
        String[] card_types_names = new String[4];
        card_types_names[0] = " червей";
        card_types_names[1] = " бубен";
        card_types_names[2] = " пик";
        card_types_names[3] = " треф";
        for (int i = 0; i < 4; i++) //масть карты
            for (int j = 0; j < 13; j++) //число карты
            {
                if (j+2 == 11)
                {
                    cards.add( new card("В"+card_types_names[i]));
                }
                else if (j+2 == 12)
                {
                    cards.add( new card("Д"+card_types_names[i]));
                }
                else if (j+2 == 13)
                {
                    cards.add( new card("К"+card_types_names[i]));
                }
                else if (j+2 == 14)
                {
                    cards.add( new card("Т"+card_types_names[i]));
                }
                else
                {
                    cards.add( new card((j + 2) +card_types_names[i]));
                }
            }


        //рандомное расположение карт
        for (int i = 0; i < 100; i++)
        {
            Collections.swap(cards, rand.nextInt(0, 51), rand.nextInt(0, 51));
        }

        System.out.print("Введите количество игроков (в диапазоне [2, 10]): ");
        int n = 2;
        if (sc.hasNextInt())
        {
            n = sc.nextInt();
            if (n < 2)
                n = 2;
            if (n > 10)
                n = 10;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print("Карты игрока " + (i+1) + ": ");
            for (int j = 0; j < 5; j++)
            {
                System.out.print(cards.get(cards.size()-1));
                if (j < 4) System.out.print(", ");
                cards.remove(cards.size()-1);
            }
            System.out.println();
        }
    }
}
