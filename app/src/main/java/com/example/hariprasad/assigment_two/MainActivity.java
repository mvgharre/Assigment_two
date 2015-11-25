package com.example.hariprasad.assigment_two;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(Gravity.TOP);
        linearLayout.setOrientation(LinearLayout.VERTICAL);



        EditText label = new EditText(this);
        label.setText(" Title");
        label.setBackgroundColor(Color.GREEN);
        label.setTextSize(15);
        label.setInputType(InputType.TYPE_CLASS_TEXT);
        linearLayout.addView(label);

        TextView label2= new TextView(this);
        label2.setText("Summary");
        label2.setBackgroundColor(Color.CYAN);
        label.setTextSize(15);
        label2.setInputType(InputType.TYPE_CLASS_TEXT);
        linearLayout.addView(label2);


        EditText label3= new EditText(this);
        label3.setText("Closing Remarks");
        label3.setBackgroundColor(Color.RED);
        label3.setTextSize(15);
        label3.setInputType(InputType.TYPE_CLASS_TEXT);
        linearLayout.addView(label3);

//        EditText editText = new EditText(this);
//        editText.setBackgroundColor(Color.YELLOW);
//        editText.setInputType(InputType.TYPE_CLASS_TEXT);
//        linearLayout.addView(editText);




        setContentView(linearLayout);

    }
}
