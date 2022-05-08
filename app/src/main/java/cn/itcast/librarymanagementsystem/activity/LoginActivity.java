package cn.itcast.librarymanagementsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import cn.itcast.librarymanagementsystem.R;
import cn.itcast.librarymanagementsystem.helper.DBOpenHelper;
import cn.itcast.librarymanagementsystem.model.UserData;

public class LoginActivity extends AppCompatActivity {

    EditText Username;
    EditText Password;
    EditText Confirm;
    Button Login;
    Button Register;
    private DBOpenHelper mDBOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initData();
        ButtonListener();
    }
    public void ButtonListener(){
        Login.setOnClickListener(new View.OnClickListener() {
            String Usernames,Passwords,Confirms;
            @Override
            public void onClick(View view) {
                Usernames=Username.getText().toString().trim();
                Passwords=Password.getText().toString().trim();
                Confirms=Confirm.getText().toString().trim();
                if(!TextUtils.isEmpty(Usernames)&&!TextUtils.isEmpty(Passwords)){
                    ArrayList<UserData>data=mDBOpenHelper.getAllData();
                    boolean match=false;
                    boolean match2=false;
                    for(int i=0;i<data.size();i++){
                    }
                }
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
    public void initData(){
        Username=findViewById(R.id.et_username);
        Password=findViewById(R.id.et_password);
        Confirm=findViewById(R.id.et_confirm);
        Login=findViewById(R.id.btn_login);
        Register=findViewById(R.id.btn_register);
    }
}