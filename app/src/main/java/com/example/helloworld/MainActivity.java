package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText editName = findViewById(R.id.editName);
        //editName.getText().toString(); //convert into Java file

    }
    //outside one method you cannot recall functions from another
    //definizione botton, we define as the name of the previous botton
    public void onRegisterBtnClick (View view){

        //FIRST: we define the textView
        TextView txtFirstName = findViewById(R.id.txtFirstName);//findViewById(R), R = resources, inside we place the exact message
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        //SECOND WE DEFINE EDIT TEXT:
        EditText editTextFirstName = findViewById(R.id.edtTxtFirstName);
        EditText editTextLastName = findViewById(R.id.edtTxtLastName);
        EditText editTextEmail = findViewById(R.id.edtTxtEmail);
        EditText editTextPassword = findViewById(R.id.edtTxtPassword);

        txtFirstName.setText("First Name: " + editTextFirstName);
        txtLastName.setText("Last Name: " + editTextLastName);
        txtEmail.setText("Email address: " + editTextEmail);
        //txtFirstName.setText("First Name: " + editTextFirstName);




        // then we have the concatenation (having two texts together)
        //txtHello.setText("Hello " + editName.getText().toString()); //in this case I change the name of text(Può essere utilizzato )

        //EditText FirstName = findViewById(R.id.txtFirstName);

    }
}