package cn.itcast.librarymanagementsystem.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import cn.itcast.librarymanagementsystem.R;

public class MainActivity extends AppCompatActivity {

    Button AddBook;
    Button SelectBook;
    Button DeleteBook;
    Button UpdateBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        ButtonListener();
    }
    public void initData(){
        AddBook=findViewById(R.id.btn_add);
        SelectBook=findViewById(R.id.btn_sel);
        DeleteBook=findViewById(R.id.btn_del);
        UpdateBook=findViewById(R.id.btn_upd);
    }
    public void ButtonListener(){
        AddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AddBookActivity.class);
                startActivity(intent);
            }
        });
        SelectBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SelBookActivity.class);
                startActivity(intent);
            }
        });
        DeleteBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DelBookActivity.class);
                startActivity(intent);
            }
        });
        UpdateBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,UpdBookActivity.class);
                startActivity(intent);
            }
        });
    }
}
