package com.example.hw2_kotlin

import androidx.fragment.app.DialogFragment
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class CustomDialogFragment : DialogFragment(R.layout.fraggg) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        val cancelbt : Button = view.findViewById(R.id.cancelBT);
        val submitbt : Button = view.findViewById(R.id.submitBT);
        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,"Thank you for rating us ", Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity()as MainActivity;
            dismiss()
        }
    }




    fun show(s: String) {

    }



}