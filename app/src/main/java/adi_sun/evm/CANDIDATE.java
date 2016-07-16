package adi_sun.evm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class CANDIDATE extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText c1, c2, c3, c4, c5;
    String cand1, cand2, cand3, cand4, cand5;
            int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);
        b1 = (Button) findViewById(R.id.candidatebutton);
        b1.setOnClickListener(this);
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }



    }

    public void hideKeyboard() {
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void onClick(View v) {
        c1 = (EditText) findViewById(R.id.can1);
        cand1 = c1.getText().toString();
        c2 = (EditText) findViewById(R.id.can2);
        cand2 = c2.getText().toString();
        c3 = (EditText) findViewById(R.id.can3);
        cand3 = c3.getText().toString();
        c4 = (EditText) findViewById(R.id.can4);
        cand4 = c4.getText().toString();
        c5 = (EditText) findViewById(R.id.can5);
        cand5 = c5.getText().toString();
        switch (v.getId()) {
            case R.id.candidatebutton:
                if (cand1.isEmpty()) {
                    hideKeyboard();
                    Snackbar.make(findViewById(R.id.main1), "Please type 1st candidate name", Snackbar.LENGTH_LONG).show();
                } else if (cand2.isEmpty()) {
                    hideKeyboard();
                    Snackbar.make(findViewById(R.id.main1), "Please type 2nd candidate name", Snackbar.LENGTH_LONG).show();
                } else if (cand3.isEmpty()) {
                    hideKeyboard();
                    Snackbar.make(findViewById(R.id.main1), "Please type 3rd candidate name", Snackbar.LENGTH_LONG).show();
                } else if (cand4.isEmpty()) {
                    hideKeyboard();
                    Snackbar.make(findViewById(R.id.main1), "Please type 4th candidate name", Snackbar.LENGTH_LONG).show();
                } else if (cand5.isEmpty()) {
                    hideKeyboard();
                    Snackbar.make(findViewById(R.id.main1), "Please type 5th candidate name", Snackbar.LENGTH_LONG).show();

                } else {
                    Save save=new Save();
                    save.getName(cand1, cand2, cand3, cand4, cand5);
                    Intent in = new Intent(this, MainActivity.class);
                    startActivity(in);

                }
        }

    }
}
