package com.sabbir.preneurlab.mentalhealth;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

/**
 * Created by Sabbir on 1/13/2018.
 */

public class RememberingChildhood extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remembering_childhood);

        //setting action bar icon and text properties
        Toolbar toolbar = findViewById(R.id.mCustomToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("  Mental Health");
        getSupportActionBar().setIcon(getDrawable(R.drawable.ic_action_name));
        toolbar.setTitleTextColor(getResources().getColor(R.color.iconTintColorFrontPageButton));


        // customizing the underline's color

        EditText editText = findViewById(R.id.editText);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        EditText editText4 = findViewById(R.id.editText4);


        editText.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText2.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText3.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
        editText4.getBackground().setColorFilter(getResources().getColor(R.color.blueColorForButton), PorterDuff.Mode.SRC_IN);
    }
}
