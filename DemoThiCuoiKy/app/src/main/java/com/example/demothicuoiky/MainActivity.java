package com.example.demothicuoiky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Button btSubmit;
    EditText fullname,username,birthday, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = findViewById(R.id.Password);
        birthday = findViewById(R.id.birthday);
        TextInputLayout birthdayWrapper = findViewById(R.id.birthdayWrapper);
        birthday.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() ==0) {
                    birthdayWrapper.setError("Bạn bắt buộc phải nhập ngày sinh");
                } else {
                    birthdayWrapper.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        username = findViewById(R.id.UserName);
        TextInputLayout usernameWrapper = findViewById(R.id.UserNameWrapper);
        username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() ==0) {
                    usernameWrapper.setError("Bạn bắt buộc phải nhập username, không ký tự đặc biệt, không có khoảng trắng");
                } else {
                    usernameWrapper.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        fullname = findViewById(R.id.Fullname);
        TextInputLayout fullnameWrapper = findViewById(R.id.Fullnamewrapper);
        fullname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() ==0) {
                    fullnameWrapper.setError("Bạn bắt buộc phải nhập Fullname");
                } else {
                    fullnameWrapper.setError(null);
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        btSubmit = findViewById(R.id.btnSubmit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
//                if(username.getText().toString()== null)  {
//                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_LONG).show();
//                }
//
//                if(password.getText().toString()== null)  {
//                    Toast.makeText(MainActivity.this, "Please enter your password", Toast.LENGTH_LONG).show();
//                }
// 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage("Đăng ký thành công");
// 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
                AlertDialog dialog = builder.create();
                dialog.show();
                setContentView(R.layout.trangchu1);
            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

}