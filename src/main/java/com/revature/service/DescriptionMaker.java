package com.revature.service;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class DescriptionMaker {

    public String[] birth = new  String[]{"Born on a farm as a peasant, ", "Born a noble's bastard, ", "Born into the nobility, ", "Left in an orphanage at a young age, ", "Raised by wolves, "};
    public String[] siblings = new String[]{"you had one older sibling. ", "you had one younger sibling. ", "you were the youngest of three. ", "you were the eldest of three. ", "you were the middle child of three", "you had a multitude of siblings. "};
    public String[] upbringing = new String[]{"You were raised to work hard, to value persistance and to take the honest path to success. ", "You were raised to be a soldier, and learned to fight from a young age. ", "You were raised to value dignity and class, and to uphold those values in your every act. ", "You were raised in poverty, and learned how to make do with little and less. " };
    public String[] callToAdventure = new String[]{"Your home was burned down by an orc warband, ", "You left home when your family's finances became unsustainable, ", "You were overcome by wanderlust, ", "You were banished from the place you were raised, "};
    public String[] goals = new String[]{"and now you seek the power to take back what is rightfully yours.", "you now travel the land doing as you heart demands of you.", "you now seek to enact your revenge.", "you are now searching for the ultimate recipe for grilled cheese sandwiches."};



    public String makeDescription(){
        StringBuilder desc = new StringBuilder();

        desc.append(birth[ThreadLocalRandom.current().nextInt(0, birth.length)]);
        desc.append(siblings[ThreadLocalRandom.current().nextInt(0, birth.length)]);
        desc.append(upbringing[ThreadLocalRandom.current().nextInt(0, birth.length)]);
        desc.append(callToAdventure[ThreadLocalRandom.current().nextInt(0, birth.length)]);
        desc.append(goals[ThreadLocalRandom.current().nextInt(0, birth.length)]);

        return desc.toString();
    }

}
