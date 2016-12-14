package jp.techacademy.hirotoshi.yoshioka.aisatsuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.app.TimePickerDialog;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int hourOfDay;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

     @Override
     public void onClick(View v) {
            if (v.getId() == R.id.button1){
                showTimePickerDialog();
            } else if (v.getId() == R.id.button2) {
                if (hourOfDay >=2 && hourOfDay <=9) {
                Log.d("UI_PARTS", "おはよう");
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("おはよう");
                } else if (hourOfDay >=10 && hourOfDay<=17) {
                    Log.d("UI_PARTS", "こんにちは");
                    TextView textView = (TextView) findViewById(R.id.textView);
                    textView.setText("こんにちは");
                } else if (hourOfDay ==1 || hourOfDay>17) {
                    Log.d("UI_PARTS", "こんばんは");
                    TextView textView = (TextView) findViewById(R.id.textView);
                    textView.setText("こんばんは");
                }
            }
        }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI_PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));
                        MainActivity.this.hourOfDay =  hourOfDay;
                    }
                },
                14, // 初期値（時間）
                32,  // 初期値（分）
                true);
        timePickerDialog.show();
    }
}
