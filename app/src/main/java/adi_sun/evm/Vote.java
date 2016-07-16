package adi_sun.evm;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Vote extends AppCompatActivity implements View.OnClickListener {
    TextView one, two, three, four, five;
    static String c1, c2, c3, c4, c5;
    RadioButton r1, r2, r3, r4, r5;
    RadioGroup rg;
    int isChecked;
    int count1,count2,count3,count4,count5;
    FloatingActionButton fab1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        Intent in = getIntent();
        Save save = new Save();
        r1 = (RadioButton) findViewById(R.id.radioButton1);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);
        r4 = (RadioButton) findViewById(R.id.radioButton4);
        r5 = (RadioButton) findViewById(R.id.radioButton5);
        rg=(RadioGroup)findViewById(R.id.RadioGroup);

        one = (TextView) findViewById(R.id.text1);
        one.setText(save.one);
        two = (TextView) findViewById(R.id.text2);
        two.setText(save.two);
        three = (TextView) findViewById(R.id.text3);
        three.setText(save.three);
        four = (TextView) findViewById(R.id.text4);
        four.setText(save.four);
        five = (TextView) findViewById(R.id.text5);
        five.setText(save.five);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this) ;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vote, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
        public void toNext(){
            Save save=new Save();
            save.getCount(count1,count2,count3,count4,count5);
            Intent ine=new Intent(this,Check.class);
            startActivity(ine);
        }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.fab:
             if(rg.getCheckedRadioButtonId()==-1) {
                 Snackbar.make(findViewById(R.id.main2), "Vote for one candidate", Snackbar.LENGTH_LONG).show();
             }
             else if (r1.isChecked()){
                 count1++;
                 toNext();

             }
             else if (r2.isChecked()){
                 count2++;
                 toNext();

             }
             else if (r3.isChecked()){
                 count3++;
                 toNext();

             }
             else if (r4.isChecked()){
                 count4++;
                 toNext();

             }
             else if (r5.isChecked()){
                 count5++;
                 toNext();

             }

             break;
     }
    }
}

