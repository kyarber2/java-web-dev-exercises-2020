package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main (String args[]) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> counts = new HashMap<>();

        char[] ch = str.toCharArray();

        for (char c: ch) {
            //System.out.println(c);

            //seeing c for the first time
            if (!counts.containsKey(c)) {
                counts.put(c, 1);
            } else{ //we have already seen c and the
                int seen = counts.get(c);
                counts.put(c, seen + 1);
            }

        }
        for(Map.Entry<Character, Integer> entry: counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
