package com.javaex.ex05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //필드
    private EditText edtText;
    private Button btnGet;
    private Button btnSet;
    private TextView txtTitle;
    private Button btnVisible;
    private Button btnInVisible;
    private Button btnGone;

    //생성자


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", ""+view.getId());

                switch (view.getId()){
                    case R.id.btnGet:
                        Log.d("javaStudy", "btnGet 버튼클릭"+R.id.btnGet);
                        String str = edtText.getText().toString();
                        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();

                        break;

                    case R.id.btnSet:
                        Log.d("javaStudy", "btnSet 버튼클릭"+R.id.btnSet);
                        break;

                    case R.id.btnVisible:
                        Log.d("javaStudy", "btnVisible 버튼클릭"+R.id.btnVisible);
                        break;

                    case R.id.btnInVisible:
                        Log.d("javaStudy", "btnInVisible 버튼클릭"+R.id.btnInVisible);
                        break;

                    case R.id.btnGone:
                        Log.d("javaStudy", "btnGone 버튼클릭"+R.id.btnGone);
                        break;
                }




            }
        };

        edtText = (EditText) findViewById(R.id.edtDisplay);

        btnGet = (Button) findViewById(R.id.btnGet);
        btnGet.setOnClickListener(listener);

        btnSet = (Button) findViewById(R.id.btnSet);
        btnSet.setOnClickListener(listener);

        btnVisible = (Button) findViewById(R.id.btnVisible);
        btnVisible.setOnClickListener(listener);

        btnInVisible = (Button) findViewById(R.id.btnInVisible);
        btnInVisible.setOnClickListener(listener);

        btnGone = (Button) findViewById(R.id.btnGone);
        btnGone.setOnClickListener(listener);


    }
}