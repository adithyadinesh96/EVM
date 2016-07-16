package adi_sun.evm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button next;
    CheckBox check;
    EditText ename,eno;
    String name="",no="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=getIntent();
        next=(Button)findViewById(R.id.Button1);
        check=(CheckBox)findViewById(R.id.Checkbox1);
        next.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {
        ename=(EditText)findViewById(R.id.electoralname);
        eno=(EditText)findViewById(R.id.Electoralno);
        name= String.valueOf(ename.getText());
        no= String.valueOf(eno.getText());
        switch(v.getId()){
            case R.id.Button1:
                if(name.equals("")){

                    Snackbar.make(findViewById(R.id.main_content), "Please enter Electoral's name", Snackbar.LENGTH_LONG).show();

                }
                else if(no.equals("")){
                    Snackbar.make(findViewById(R.id.main_content), "Please enter Electoral's ID", Snackbar.LENGTH_LONG).show();
                }
               else if(check.isChecked()) {
                    Intent in = new Intent(this, Vote.class);
                        startActivity(in);


                }


                else {

                        View view = this.getCurrentFocus();
                        if (view != null) {
                            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    Snackbar.make(findViewById(R.id.main_content), "Please agree the terms and conditions", Snackbar.LENGTH_LONG).show();
                }
                    break;

            default:break;
        }

    }
}
