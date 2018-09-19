package com.example.albin.samplejava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox check1,check2;
    private RadioButton radi1;
    private Button bttn;
    private RadioGroup rgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCheckboxClick();
        radioButtonClickListener();
    }
    public void onButtonClick(View v){

//        sum of 2 numbers
        EditText a = findViewById(R.id.editText);
        EditText b =findViewById(R.id.editText2);
        TextView c =findViewById(R.id.textView3);
        int num1 = Integer.parseInt(a.getText().toString());
        int num2 = Integer.parseInt(b.getText().toString());
        final int sum = num1 + num2;
        c.setText(String.valueOf(sum));

//        toast function
        Toast.makeText(MainActivity.this,String.valueOf(sum),Toast.LENGTH_SHORT).show();
    }


    //    checkbox selection program select
    public void onCheckboxClick(){
        check1 = findViewById(R.id.checkBox);
        check2 = findViewById(R.id.checkBox2);
        Button btn = findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                if(check1.isChecked()){
                    result.append("abcd selected");
                }
                if (check2.isChecked()){
                    result.append("\nefgh is selected");
                }
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_SHORT).show();
            }

        });
    }

    //    radiobutton selection programme
    public void radioButtonClickListener(){
        bttn = findViewById(R.id.button3);
        rgp = findViewById(R.id.radiogroup);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selected_id = rgp.getCheckedRadioButtonId();
                radi1 = findViewById(selected_id);
                Toast.makeText(MainActivity.this,radi1.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}