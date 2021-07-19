package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    //Start of declerations of buttons, textviews, and etc.
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button plus;
    Button minus;
    Button divide;
    Button multiply;
    Button clear;
    Button enter;
    TextView display;
    ArrayList<String> compStorage;
    String a = "";
    Boolean pplus=false;
    Boolean thisCheck=false;
    StringTokenizer calculatons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Start of definitions of ids for buttons & textviews
        display=findViewById(R.id.textView3);
        display.setText("");
        one=findViewById(R.id.button11);
        two= findViewById(R.id.button12);
        three=findViewById(R.id.button13);
        four= findViewById(R.id.button14);
        five= findViewById(R.id.button15);
        six= findViewById(R.id.button16);
        seven= findViewById(R.id.button8);
        eight= findViewById(R.id.button9);
        nine= findViewById(R.id.button10);
        zero= findViewById(R.id.button19);
        minus= findViewById(R.id.button2);
        plus= findViewById(R.id.button);
        multiply= findViewById(R.id.button17);
        divide= findViewById(R.id.button4);
        clear= findViewById(R.id.button18);
        enter= findViewById(R.id.button21);
        one.setTextColor(Color.BLUE);
        two.setTextColor(Color.BLUE);
        three.setTextColor(Color.BLUE);
        four.setTextColor(Color.BLUE);
        five.setTextColor(Color.BLUE);
        six.setTextColor(Color.BLUE);
        seven.setTextColor(Color.BLUE);
        eight.setTextColor(Color.BLUE);
        nine.setTextColor(Color.BLUE);
        zero.setTextColor(Color.BLUE);
        clear.setTextColor(Color.YELLOW);
        enter.setTextColor(Color.YELLOW);
        plus.setTextColor(Color.RED);
        minus.setTextColor(Color.RED);
        divide.setTextColor(Color.RED);
        multiply.setTextColor(Color.RED);




//start of onCLick listener methods for all buttons

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"1";
                display.setText(x);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"2";
                display.setText(x);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"3";
                display.setText(x);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"4";
                display.setText(x);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"5";
                display.setText(x);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"6";
                display.setText(x);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"7";
                display.setText(x);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"8";
                display.setText(x);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"9";
                display.setText(x);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+"0";
                display.setText(x);
            }
        });
        //start of operator button methods
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+" - ";
                display.setText(x);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+" + ";
                display.setText(x);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+" X ";
                display.setText(x);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().equals("Error")){
                    display.setText("");
                }
                String x =display.getText()+" / ";
                display.setText(x);

            }
        });
        //clear method to clear display
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");

            }
        });

        //Enter method which computes numbers in display
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compStorage = new ArrayList<>();

                try {

                    display.setText(display.getText()+" ");
                    calculatons = new StringTokenizer((String)display.getText()," ");

                    while(calculatons.hasMoreTokens()) {
                        compStorage.add(calculatons.nextToken());




                    }
                    for (int i = 0; i < compStorage.size(); i++) {
                        if (compStorage.get(i).equals("/")) {
                            if(compStorage.get(i+1).equals("0")){
                                thisCheck=true;
                            }
                            compStorage.set(i - 1, Double.toString(Double.parseDouble(compStorage.get(i - 1)) / Double.parseDouble(compStorage.get(i + 1))));
                            compStorage.remove(i);
                           compStorage.remove(i);
                            i--;
                        }
                        if (compStorage.get(i).equals("X")) {
                            compStorage.set(i - 1, Double.toString(Double.parseDouble(compStorage.get(i - 1)) * Double.parseDouble(compStorage.get(i + 1))));
                            compStorage.remove(i);
                            compStorage.remove(i);
                            i--;
                        }

                    }
                    for (int i2 = 0; i2 < compStorage.size(); i2++) {
                        if (compStorage.get(i2).equals("+")) {
                            compStorage.set(i2 - 1, Double.toString(Double.parseDouble(compStorage.get(i2 - 1)) + Double.parseDouble(compStorage.get(i2 + 1))));
                            compStorage.remove(i2);
                            compStorage.remove(i2);
                            i2--;
                        }
                        if (compStorage.get(i2).equals("-")) {
                            compStorage.set(i2 - 1, Double.toString(Double.parseDouble(compStorage.get(i2 - 1)) - Double.parseDouble(compStorage.get(i2 + 1))));
                            compStorage.remove(i2);
                            compStorage.remove(i2);
                            i2--;
                        }
                    }

                    if(!thisCheck) {
                        display.setText(compStorage.get(0));
                    }
                    if(thisCheck){
                        display.setText("Try again. An error has occurred ");

                    }
                    compStorage.clear();

                }
                catch(Exception e) {
                    display.setText("Try again. An error has occurred ");
                    e.printStackTrace();
                    compStorage.clear();
                }




            }

        });


    }


}
