package com.company;

import java.util.HashSet;
import java.util.Set;

public class NumerologicCalculator {

    Letters letters = new Letters();

    public NumerologicPortrait calculateName(String name ){

        String textTocalculate = name.toLowerCase().replaceAll("\\s","");
        int lifeGoalNumber = 0; /** Sum of all letters*/
        int soulNumber = 0;     /** Sum of all  vowels */
        int personalityNumber;  /** Sum of all no-vowels*/

        for(int i = 0;i<textTocalculate.length(); i++){
            int actual = letters.getLetterValue(textTocalculate.charAt(i));
                /**
                 *   Modify two-digit values of particular letter to one digit with numerologic principle of summing digit
                 *   eg 12 = 1+2 = 3
                 *      34 = 3+4 = 7
                 *   exceptions are the same digits, which we do not add up
                 *   eg number 22 = 22
                 */
            if (actual >=10 && actual <19) actual -=9;
            if (actual >=19) actual -=18;

            lifeGoalNumber +=  actual;
            if (letters.isVovel(textTocalculate.charAt(i))) soulNumber += actual;
        }
            personalityNumber = lifeGoalNumber-soulNumber;
            return new NumerologicPortrait(
                    lifeGoalNumber,
                    convertToOneDigitOrMasterNumber(lifeGoalNumber),
                    soulNumber,
                    convertToOneDigitOrMasterNumber(soulNumber),
                    personalityNumber,
                    convertToOneDigitOrMasterNumber(personalityNumber));
        }


    private int convertToOneDigitOrMasterNumber(Integer toConvert){
        Integer sum = 0;

        Set newset = new HashSet();
        for(int i = 0;i<String.valueOf(toConvert).length(); i++){

            char charValue = String.valueOf(toConvert).charAt(i);
            newset.add(charValue);
            sum += Integer.valueOf(String.valueOf(charValue));
        }
        if (newset.size() ==1) return toConvert;

        if(sum.toString().length() != 1) {
            return convertToOneDigitOrMasterNumber(sum);
        }else return sum;
    }

}
