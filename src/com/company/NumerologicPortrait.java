package com.company;


public class NumerologicPortrait {

    /** Sum of all letters*/
    private int lifeGoalNumber;
    private int lifeGoalNumberConverted;
    /** Sum of all  vowels */
    private int soulNumber;
    private int soulNumberConverted;
    /** Sum of all no-vowels*/
    private int personalityNumber;
    private int personalityNumberConverted;

    public NumerologicPortrait(int lifeGoalNumber, int lifeGoalNumberConverted, int soulNumber, int soulNumberConverted, int personalityNumber, int personalityNumberConverted) {
        this.lifeGoalNumber = lifeGoalNumber;
        this.lifeGoalNumberConverted = lifeGoalNumberConverted;
        this.soulNumber = soulNumber;
        this.soulNumberConverted = soulNumberConverted;
        this.personalityNumber = personalityNumber;
        this.personalityNumberConverted = personalityNumberConverted;
    }

    @Override
    public String toString() {
        return "NumerologicPortrait{" +
                "lifeGoalNumber=" + lifeGoalNumber +
                ", lifeGoalNumberConverted=" + lifeGoalNumberConverted +
                ", soulNumber=" + soulNumber +
                ", soulNumberConverted=" + soulNumberConverted +
                ", personalityNumber=" + personalityNumber +
                ", personalityNumberConverted=" + personalityNumberConverted +
                '}';
    }
}
