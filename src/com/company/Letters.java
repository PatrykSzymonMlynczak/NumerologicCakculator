package com.company;

import java.util.HashMap;
import java.util.List;

public class Letters {

    HashMap<Character, Integer> allLetters = new HashMap();
    List<Character> vowels;


    public Letters(){
        allLetters.put('a', 1);
        allLetters.put('ą', 1);
        allLetters.put('b', 2);
        allLetters.put('c', 3);
        allLetters.put('ć', 3);
        allLetters.put('d', 4);
        allLetters.put('e', 5);
        allLetters.put('ę', 5);
        allLetters.put('f', 6);
        allLetters.put('g', 7);
        allLetters.put('h', 8);
        allLetters.put('i', 9);
        allLetters.put('j', 10);
        allLetters.put('k', 11);
        allLetters.put('l', 12);
        allLetters.put('ł', 12);
        allLetters.put('m', 13);
        allLetters.put('n', 14);
        allLetters.put('ń', 14);
        allLetters.put('o', 15);
        allLetters.put('ó', 15);
        allLetters.put('p', 16);
        allLetters.put('q', 17);
        allLetters.put('r', 18);
        allLetters.put('s', 19);
        allLetters.put('ś', 19);
        allLetters.put('t', 20);
        allLetters.put('u', 21);
        allLetters.put('v', 22);
        allLetters.put('w', 23);
        allLetters.put('x', 24);
        allLetters.put('y', 25);
        allLetters.put('z', 26);
        allLetters.put('ź', 26);
        allLetters.put('ż', 26);

        vowels = List.of('a','e','i','o','u'/*,'y'*/);
    }

    public Integer getLetterValue(Character character) {
        return allLetters.get(character);
    }

    public boolean isVovel(Character character){
        return vowels.contains(character);
    }

}
