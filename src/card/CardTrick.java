/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card k = new Card();
            
            k.setValue((int) (Math.random() * 13) + 1); 
            k.setSuit(Card.SUITS[(int) (Math.random() * 4)]); 
            magicHand[i] = k;
 
            Card luckyCard1 = new Card();
            luckyCard1.setValue(2);
            luckyCard1.setSuit("Clubs");
            magicHand[6] = luckyCard1; 

        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card number (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter card suits (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();

        
        Card userCards = new Card();
        userCards.setValue(userValue);
        userCards.setSuit(userSuit);

        boolean cardInHand = false;
        for (Card magicCard : magicHand) {
            if (magicCard.getValue() == userCards.getValue() && magicCard.getSuit().equalsIgnoreCase(userCards.getSuit())) {
                cardInHand = true;
                break;
            }
        }

        if (cardInHand) {
            System.out.println("Congratulations! Your Selected card is in the magic hand!");
        } else {
            System.out.println("Sorry, your Selected card is not in the magic hand.");
        }
    
    }}
