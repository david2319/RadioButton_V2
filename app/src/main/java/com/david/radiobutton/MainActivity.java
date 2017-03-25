package com.david.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    //private RadioButton rr, rv, ra;
    private RadioGroup rg;
    private RelativeLayout rl;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*rr = (RadioButton) findViewById(R.id.Rrojo);
        rv = (RadioButton) findViewById(R.id.Rverde);
        ra = (RadioButton) findViewById(R.id.Razul);*/


        rg =(RadioGroup) findViewById(R.id.radioGroup);
        rl =(RelativeLayout) findViewById(R.id.activity_main);
        rg.setOnCheckedChangeListener(this);//ponerlo a la escucha
    }

    @Override
    public void onCheckedChanged(RadioGroup rg, int checkedId) {//no funciona

        switch(checkedId){
            case R.id.Rrojo:
                color=Color.RED;
                break;

            case R.id.Rverde:
                color=Color.GREEN;
                break;

            case R.id.Razul:
                color=Color.BLUE;
                break;

            case R.id.Rblanco:
                color=Color.WHITE;
                break;
        }
    }

    public void ColorFondo(View vista){
        rl.setBackgroundColor(color);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem mi){

        int id = mi.getItemId();

        switch(id){
            case R.id.saludo:
                Toast.makeText(getApplicationContext(),
                        "Hola", Toast.LENGTH_SHORT).show();
            break;

            case R.id.salir:
                finish();
            break;

        }


        return true;
    }


    /*public void ColorFondo(View vista){//este metodo es igual que los dos métodos de arriba

        if(rr.isChecked()){

            rl.setBackgroundColor(Color.RED);

        }else if(rv.isChecked()){

            rl.setBackgroundColor(Color.GREEN);

        }else if(ra.isChecked()){

            rl.setBackgroundColor(Color.BLUE);
        }


    }*/


}
