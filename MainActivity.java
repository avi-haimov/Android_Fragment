package com.example.fragmentlesson2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String str1 , str2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager(); // שולף את הפרגמנט
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //מתחיל את הטרנזקציה

        //כעת נגדיר את האובייקט שנרצה לשים מעל הבור
        BlankFragmentOne blankFragmentOne = new BlankFragmentOne();//יוצרים את האובייקט שזה המסך הכחול מתוך המחלקה פרגמנט 1



        fragmentTransaction.add(R.id.frameCon , blankFragmentOne).commit(); //
        // שם את על הבור את התוכן של האוביקט כאשר פרמקון זה השם של האזור של הבור, המשתנה שבו שולטים על הבור



    }

    public void funSecFragment(TextView text1, TextView text2) {

        str1 = text1.getText().toString();
        str2 = text2.getText().toString();


        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        BlankFragmentTwo blankFragmentTwo = BlankFragmentTwo.newInstance(str1 , str2);

        //BlankFragmentTwo blankFragmentTwo = new BlankFragmentTwo();


        fragmentTransaction.replace(R.id.frameCon , blankFragmentTwo).commit();


    }
}