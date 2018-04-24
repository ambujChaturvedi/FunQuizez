package com.example.user.funquizez;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Button answer_1,answer_2,answer_3,answer_4;
    TextView question;
    Questions questions=new Questions();
    int postion=0;
    int Score=0;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question=findViewById(R.id.question);
        answer_1=findViewById(R.id.answer1);
        answer_2=findViewById(R.id.answer2);
        answer_3=findViewById(R.id.answer3);
        answer_4=findViewById(R.id.answer4);
      updateQuestionsAndAnswers(questions.getQuestion(postion),
                questions.getAnswer1(0),questions.getAnswer2(0),
                questions.getAnswer3(0),questions.getAnswer4(0));

        answer_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                postion+=1;
                checkForCounter(postion);

                if(postion<5){
                    updateQuestionsAndAnswers(questions.getQuestion(postion),
                            questions.getAnswer1(postion),questions.getAnswer2(postion),
                            questions.getAnswer3(postion),questions.getAnswer4(postion));

                    checkForRightAnswer(answer_1.getText(),questions.getRightAnswers(postion));
                    Log.d(TAG, "onClick: getText"+answer_1.getText());
                }


            }
        });


        answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                postion+=1;
                checkForCounter(postion);

                if(postion<5){
                    updateQuestionsAndAnswers(questions.getQuestion(postion),
                            questions.getAnswer1(postion),questions.getAnswer2(postion),
                            questions.getAnswer3(postion),questions.getAnswer4(postion));

                    checkForRightAnswer(answer_1.getText(),questions.getRightAnswers(postion));
                }


            }
        });
         answer_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //showAlertDialog(postion);
                 postion+=1;
                 checkForCounter(postion);

                 if(postion<5){
                     updateQuestionsAndAnswers(questions.getQuestion(postion),
                             questions.getAnswer1(postion),questions.getAnswer2(postion),
                             questions.getAnswer3(postion),questions.getAnswer4(postion));

                     checkForRightAnswer(answer_1.getText(),questions.getRightAnswers(postion));
                 }
             }
         });


         answer_4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 postion+=1;
                 checkForCounter(postion);

                 if(postion<5){
                     updateQuestionsAndAnswers(questions.getQuestion(postion),
                             questions.getAnswer1(postion),questions.getAnswer2(postion),
                             questions.getAnswer3(postion),questions.getAnswer4(postion));

                     checkForRightAnswer(answer_1.getText(),questions.getRightAnswers(postion));
                 }
             }
         });


    }

    private void checkForRightAnswer(CharSequence text, String rightAnswers) {

        if(text.toString().equals(rightAnswers)){

            Score++;
            Log.d(TAG, "checkForRightAnswer: "+Score);

        }

    }

    private void updateQuestionsAndAnswers(String question1, String answer11, String answer12, String answer13,
                                           String answer14) {

        question.setText(question1);
        answer_1.setText(answer11);
        answer_2.setText(answer12);
        answer_3.setText(answer13);
        answer_4.setText(answer14);

        }

       public void checkForCounter(int value) {
           if (value == questions.questions.length) {
               AlertDialog.Builder builder=new AlertDialog.Builder(this);
               builder.setTitle("Finished");
               builder.setMessage("Your Score is "+Score);
               builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialogInterface, int i) {
                       finish();
                   }
               });
               builder.show();
           }


           }








}
