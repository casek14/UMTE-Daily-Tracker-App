package com.example.casek.beta01;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button setGraphDay;
    private Button setGraphWeek;
    private Button setGraphMonth;
    private ImageButton showWorkGraph;
    private ImageButton showSportGraph;
    private ImageButton showSocialGraph;
    private ImageButton showSchoolGraph;
    private ImageButton addTime;
    private EditText mainTextField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setGraphDay = (Button) findViewById(R.id.btn_main_day);
        setGraphWeek = (Button) findViewById(R.id.btn_main_week);
        setGraphMonth = (Button) findViewById(R.id.btn_main_month);
        showWorkGraph = (ImageButton) findViewById(R.id.btn_main_work);
        showSportGraph = (ImageButton) findViewById(R.id.btn_main_sport);
        showSocialGraph = (ImageButton) findViewById(R.id.btn_main_social);
        showSchoolGraph = (ImageButton) findViewById(R.id.btn_main_school);

    }
}
