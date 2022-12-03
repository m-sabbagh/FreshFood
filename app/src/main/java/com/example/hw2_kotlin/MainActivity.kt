package com.example.hw2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val orderbt = findViewById<Button>(R.id.button)
        val radioGroup = findViewById<RadioGroup>(R.id.RatingRadioGroup)

        val radioGroup2 =findViewById<RadioGroup>(R.id.Radiogroup2)

        orderbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val selectedOption2: Int = radioGroup2.checkedRadioButtonId

            val radioButton = findViewById<RadioButton>(selectedOption)
            val radioButton2 = findViewById<RadioButton>(selectedOption2)

           receiveOrder(radioButton.text.toString() , radioButton2.text.toString())
//        }
        }
    }

//    override fun on
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
//    {
//        val orderbt= findViewById<Button>(R.id.button)
//        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
//        val radioGroup2 =view.findViewById<RadioGroup>(R.id.radioButton2)
//
//        orderbt.setOnClickListener {
//            val selectedOption: Int = radioGroup.checkedRadioButtonId
//            val selectedOption2: Int = radioGroup2.checkedRadioButtonId
//
//            val radioButton = view.findViewById<RadioButton>(selectedOption)
//            val radioButton2 = view.findViewById<RadioButton>(selectedOption2)
//
//            recieveBurgerChoice(radioButton.text.toString())
//            recieveBevengersChoice(radioButton2.text.toString())
//        }
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu to use in the action bar
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var dialog_var= CustomDialogFragment()
        when(item.itemId){

            R.id.item1 ->                    dialog_var.show(supportFragmentManager,"Custom Dialog")


            R.id.item2 -> AlertDialog.Builder(this)
                .setTitle("Contant Us")
                .setMessage("Email us via freshfood@foo.com")
                .setPositiveButton("Ok"){dialog, which ->
                }

                .show()
            R.id.item3 ->
                AlertDialog.Builder(this)
                    .setTitle("Our branches")
                    .setMessage("HASHMI AL SHAMALI\n" +
                            "Al Bathaa St – Amman, Jordan\n" +"\n" + "KHALDA\n" +
                            "Abed Sulayman St – Amman, Jordan ")
                    .setPositiveButton("Ok"){dialog, which ->
                    }

                    .show()
        }
        return true;
    }
    fun receiveOrder(burger: String , bevengers:String) {

val order = "You ordered a $burger burger with $bevengers"
        Toast.makeText(this, order, Toast.LENGTH_SHORT).show()


//        val ratingTv :TextView = findViewById(R.id.TVrating)
//        ratingTv.text=feedback
    }

}



