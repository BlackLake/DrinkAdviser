package com.hfad.drinkadviser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by blacklake on 10/25/17.
 */

public class DrinkExpert {

    List<String> getBrands (String color)
    {
        List<String> brands= new ArrayList<>();
        if (color.equals("Red"))
        {
            brands.add("Cherry Juice");
        }
        if (color.equals("Blue"))
        {
            brands.add("Powerade");
        }
        return brands;
    }


}
