package demo;

import characters.Hero;
import characters.Minion;
import characters.Smurf;
import task1.StoryTeller;
import task2.StoryTellerFactory;


public class DemoHomeWork5 {
    public static void main(String[] args){
        System.out.println("--- Demonstration of Home Work 5 ---\n");
        System.out.println("--- Task 3: Factory class to create different type objects");

    }

    public static void getTask1Demo() {
        System.out.println("--- Task 1: Implementation of interface ");
        StoryTeller superman1 = new Hero("Supeman", 12, 1, 1980);
        StoryTeller minion1 = new Minion("Luke");
        StoryTeller smurf1 = new Smurf();

        StoryTeller[] myCharacters = {superman1, minion1, smurf1};

        for(StoryTeller teller: myCharacters){
            System.out.println("Mood: " + teller.getCurrentMood());
            teller.tellAboutYourself();
        }
    }

    public static void getTask2AboutFactoryDemo(){
        System.out.println("--- Task 2: Factory class to create different type objects");

        StoryTellerFactory myStoryTellerFactory = new StoryTellerFactory();

        StoryTeller storyTeller1 = myStoryTellerFactory.getStoryTeller("HERO");
        storyTeller1.tellAboutYourself();

        StoryTeller storyTeller2 = myStoryTellerFactory.getStoryTeller("SMURF");
        storyTeller2.tellAboutYourself();

        StoryTeller storyTeller3 = myStoryTellerFactory.getStoryTeller("MINION");
        storyTeller3.tellAboutYourself();
    }
}
