package gameeth.basiccalculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , buttonClear  , buttonEqual, buttonPoint ;

    TextView textView;

    private float valueOne ;
    private float valueTwo ;

    boolean addState, subState, multiState, divState;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_SHORT;

        textView = (TextView) findViewById(R.id.textView);


        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);

        buttonEqual = (Button) findViewById(R.id.button_equal);
        buttonAdd = (Button) findViewById(R.id.button_add);
        buttonSub = (Button) findViewById(R.id.button_sub);
        buttonMul = (Button) findViewById(R.id.button_mul);
        buttonDivision = (Button) findViewById(R.id.button_div);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonPoint = (Button) findViewById(R.id.button_point);


        button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"0";
                textView.setText(value);

            }
        });

        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"1";
                textView.setText(value);

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"2";
                textView.setText(value);

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"3";
                textView.setText(value);

            }
        });

        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"4";
                textView.setText(value);

            }
        });

        button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"5";
                textView.setText(value);

            }
        });

        button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"6";
                textView.setText(value);

            }
        });
        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"7";
                textView.setText(value);

            }
        });
        button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"8";
                textView.setText(value);

            }
        });

        button9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String value = textView.getText()+"9";
                textView.setText(value);

            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+".");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (textView == null){
                    textView.setText("");
                }
                else {
                    valueOne = Float.parseFloat(textView.getText().toString());
                    addState = true;
                    textView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (textView == null){
                    textView.setText("");
                }
                else {
                    valueOne = Float.parseFloat(textView.getText().toString());
                    subState = true;
                    textView.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (textView == null){
                    textView.setText("");
                }
                else {
                    valueOne = Float.parseFloat(textView.getText().toString());
                    multiState = true;
                    textView.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if (textView == null){
                    textView.setText("");
                }
                else {
                    valueOne = Float.parseFloat(textView.getText().toString());
                    divState = true;
                    textView.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                valueTwo = Float.parseFloat(textView.getText().toString());
                if (addState == true){
                    Float total = valueOne + valueTwo;
                    textView.setText(total.toString());
                    addState = false;

                }
                if(subState == true){
                    Float total = valueOne - valueTwo;
                    textView.setText(total.toString());
                    subState = false;

                }
                if(multiState == true){
                    Float total = valueOne * valueTwo;
                    textView.setText(total.toString());
                    multiState = false;

                }
                if(divState == true){
                    if(valueTwo > 0){
                        Float total = valueOne / valueTwo;
                        textView.setText(total.toString());

                    }
                    else{
                        Toast toast = Toast.makeText(context, "cannot divide by zero", duration);
                        toast.show();
                        textView.setText(null);
                    }
                    divState = false;
                }

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(null);
            }
        });


    }

}
