package com.example.on_luyen_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtname, edtpass;
    CheckBox chkluu;
    Button btndangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname = findViewById(R.id.edt_usename);
        edtpass = findViewById(R.id.edt_pass);
        chkluu = findViewById(R.id.chk_luu);
        btndangnhap = findViewById(R.id.btn_dang_nhap);

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtname.getText().toString();
                String pass = edtpass.getText().toString();

                if(name.equals("")| pass.equals("")){
                    Toast.makeText(MainActivity.this, "Nhap day du thong tin", Toast.LENGTH_SHORT).show();
                }else {

                }

            }
        });
    }
}