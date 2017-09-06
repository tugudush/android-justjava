package com.tugudush.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static com.tugudush.justjava.R.id.price;
import static com.tugudush.justjava.R.id.qty;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    int coffees = 1;

    public void initialize() {
        TextView qty = (TextView) findViewById(R.id.qty);
        qty.setText(String.valueOf(coffees));
        int coffee_price = coffees * 5;
        TextView price = (TextView) findViewById(R.id.price);
        price.setText(NumberFormat.getCurrencyInstance().format(coffee_price));
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submit_order(View view) {
        /*int coffees = 2;
        display(coffees);
        displayPrice(coffees * 5);*/
    }

    public void increment(View view) {
        /*TextView qty = (TextView) findViewById(R.id.qty);
        String qty_string = qty.getText().toString();
        int coffees = Integer.parseInt(qty_string);*/
        coffees = coffees + 1;
        display(coffees);
        displayPrice(coffees * 5);
    } // end of public void increment(View view)

    public void decrement(View view) {
        /*TextView qty = (TextView) findViewById(R.id.qty);
        String qty_string = qty.getText().toString();
        int coffees = Integer.parseInt(qty_string);*/

        if (coffees <= 1) {
            finish();
            System.exit(0);
        } else {
            coffees = coffees - 1;
            display(coffees);
            displayPrice(coffees * 5);
        }
    } // end of public void decrement(View view)

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView qty = (TextView) findViewById(R.id.qty);
        qty.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView price = (TextView) findViewById(R.id.price);
        price.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
