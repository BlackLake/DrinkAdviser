package com.hfad.drinkadviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindDrinkActivity extends Activity {

    DrinkExpert expert = new DrinkExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_drink);
    }


    public void onClickFindDrink(View view)
    {

        TextView brands = (TextView)findViewById(R.id.brands);
        Spinner color = (Spinner)findViewById(R.id.color);


        String drinkType = String.valueOf(color.getSelectedItem());
        /*
        brands.setText(drinkType);
        */

        List<String> brandList = expert.getBrands(drinkType);

        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }

        brands.setText(brandsFormatted);
    }

}
