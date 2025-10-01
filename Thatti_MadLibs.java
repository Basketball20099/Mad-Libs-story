import java.util.Scanner;

public class Thatti_MadLibs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter an adjective: ");
        String adjectiveOne = scanner.nextLine();

        System.out.print(" Please enter a place: ");
        String placeOne = scanner.nextLine();

        System.out.print(" Please enter a plural noun: ");
        String pluralNounOne = scanner.nextLine();

        System.out.print(" Please enter an adjective: ");
        String adjectiveTwo = scanner.nextLine();

        System.out.print(" Please enter a noun: ");
        String nounOne = scanner.nextLine();

        System.out.print(" Please enter a food: ");
        String foodOne = scanner.nextLine();

        System.out.print(" Please enter an adverb: ");
        String adverbOne = scanner.nextLine();

        System.out.print(" Please enter a past tense verb: ");
        String pastTenseVerbOne = scanner.nextLine();

        System.out.print(" Please enter an adjective: ");
        String adjectiveThree = scanner.nextLine();

        System.out.print(" Please enter a noun: ");
        String nounTwo = scanner.nextLine();

        System.out.print(" Please enter a verb: ");
        String verbOne = scanner.nextLine();

        System.out.print(" Please enter an adjective: ");
        String adjectiveFour = scanner.nextLine();

        System.out.print(" Please enter an animal: ");
        String animalOne = scanner.nextLine();

        System.out.print(" Please enter a verb ending with ing: ");
        String verbWithIngOne = scanner.nextLine();

        System.out.print(" Please enter a noun: ");
        String nounThree = scanner.nextLine();

        System.out.print(" Please enter an adverb: ");
        String adverbTwo = scanner.nextLine();

        System.out.print(" Please enter a plural noun: ");
        String pluralNounTwo = scanner.nextLine();

        System.out.print(" Please enter another plural noun: ");
        String pluralNounThree = scanner.nextLine();

        System.out.print(" Please enter an adjective: ");
        String adjectiveFive = scanner.nextLine();

        System.out.print(" Please enter another adjective: ");
        String adjectiveSix = scanner.nextLine();

        System.out.print(" Please enter another adjective: ");
        String adjectiveSeven = scanner.nextLine();

        System.out.print(" Please enter a plural noun: ");
        String pluralNounFour = scanner.nextLine();

        scanner.close();


        
        String story = "Last summer, my " + adjectiveOne + " friend and I decided to take a trip to the " + placeOne + ". We packed our bags with " + pluralNounOne + ", a " + adjectiveTwo + " " + nounOne + ", and of course, plenty of " + foodOne + ". The trip started off " + adverbOne + ". First, the bus driver " + pastTenseVerbOne + " into a " + adjectiveThree + " " + nounTwo + ", which made everyone " + verbOne + ". After that, we finally arrived at our destination. Inside the forest, we saw a " + adjectiveFour + " " + animalOne + " that was " + verbWithIngOne + " on a " + nounThree +  ". My friend screamed so " + adverbTwo + " that the " + animalOne + " ran away. Then, out of nowhere, a group of " + pluralNounTwo + " appeared, all carrying " + pluralNounThree + ". We knew we had to get out fast! In the end, we returned home feeling " + adjectiveFive + " and " + adjectiveSix + ". It was the most " + adjectiveSeven + " adventure of our lives, and we promised to never forget to pack extra " + pluralNounFour + " the next time we traveled.";

System.out.println("Here is your finished Mad Libs story:");
System.out.println("-------------------------------------");
System.out.print(story);
    
    
    
    }
}
