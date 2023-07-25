package com.example.quizapp;

public class QuestionLibrary {
    private String Ques[] = {
            "Which part of the plants holds it in the soil?",
            "This part of the plant absorbs energy from the sun",
            "This part of the plant attracts bees, birds",
            "The _ holds the plant upright."
    };

    private String choices[][] = {
            {"Roots", "Stem", "Flower", "xy"},
            {"Fruits", "Leaves", "Seeds", "yz"},
            {"Bark", "Flower", "Roots", "zx"},
            {"Fruits", "Leaves", "Roots", "zy"}
    };

    private String Ans[] = {"Stem", "Leaves", "Roots", "zy"};


    public String getQues(int a){
        String ques = Ques[a];
        return ques;
    }
    public String getChoice1(int a){
        String choice0 = choices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = choices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = choices[a][2];
        return choice2;
    }

    public String getChoice4(int a){
        String choice3 = choices[a][3];
        return choice3;
    }


    public String getAns(int a){
        String ans = Ans[a];
        return ans;
    }

}
