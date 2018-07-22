package com.muhaiminurabir.time_picker;

import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import com.codetroopers.betterpickers.timepicker.TimePickerBuilder;

public class MainActivity extends AppCompatActivity {

    Button send,timer;
    //inside oncreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send=(Button)findViewById(R.id.b1);

        send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showHourPicker();
                /*TimePickerBuilder tpb = new TimePickerBuilder()
                        .setFragmentManager(getSupportFragmentManager())
                        .setStyleResId(R.style.BetterPickersDialogFragment);
                tpb.show();*/

                /*TimePickerDialogFixedNougatSpinner tpd = new TimePickerDialogFixedNougatSpinner(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                    }
                }, Calendar.HOUR_OF_DAY, Calendar.MINUTE, false);
                tpd.show();*/
            }
        });
        timer=(Button)findViewById(R.id.timer);
        timer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }

    public void showHourPicker() {


        TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Light_Dialog_NoActionBar, myTimeListener, 0,0, true);
        timePickerDialog.setTitle("Choose hour:");
        timePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        timePickerDialog.show();
    }

}
