package adi_sun.evm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Check extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);
        Intent i=getIntent();
        b1=(Button)findViewById(R.id.check1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.check2);
        b2.setOnClickListener(this);

    }
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.check1:Intent in=new Intent(this,MainActivity.class);
                startActivity(in);

                break;
            case R.id.check2:Intent ine=new Intent(this,Result.class);
                startActivity(ine);


                break;

        }

    }
}
