package com.example.user.funquizez;

/**
 * Created by user on 27-02-2018.
 */

public class Questions {

    String [] questions={"1.Which of the following terms is not used in the field of physics?",
    "2.The absorption of ink by blotting paper involves:","3.Nuclear sizes are expressed in a unit named",
            "4.Light year is a unit of","5.Light from the Sun reaches us in nearly"};


    public String getQuestion(int postion){
        String question;
        question=questions[postion];

        return question;
    }

    String [][] answers={
            {"Latent heat","Nuclear fusion","Refractive index","Stock value"},
            {"Viscosity of ink","Capillary action phenomenon","Diffusion of ink through the blotting","Siphon action"},
            {"Fermi","Angstrom","Newton","Tesla"},
            {"Time","Distance","Light","Intensity of light"},
            {"2 minutes", "4 minutes","8 minutes","16 minutes"}
    };

    public String getAnswer1(int postion){
        String answer1;
        answer1=answers[postion][0];
        return answer1;
    }
    public String getAnswer2(int postion){
        String answer1;
        answer1=answers[postion][1];
        return answer1;
    }
    public String getAnswer3(int postion){
        String answer1;
        answer1=answers[postion][2];
        return answer1;
    }public String getAnswer4(int postion){
        String answer1;
        answer1=answers[postion][3];
        return answer1;
    }

    String[] rightAnswer={"Stock value","Capillary action phenomenon","Fermi","Distance","8 minutes"};

   public String getRightAnswers(int Postion){
       String rigtAnswer;
       rigtAnswer=rightAnswer[Postion];
       return rigtAnswer;
   }

}
