package com.milkywaylhy.ex44fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tv;
Myfragment myfragment;
FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.tv);
        //프레그먼트를 관리해주는 관리자 객체를 소환
        fragmentManager= getSupportFragmentManager();
        myfragment= (Myfragment) fragmentManager.findFragmentById(R.id.frag);
    }

    public void clickBtn(View view) {
        //My fragment의 TextView 글씨 변경하기
        //Myfragement 참조변수를 이용하여
        myfragment.tv.setText("Good");
        
        
    }
    //프레그먼트가 보여주는 fragment_my.xml 안에있는
    public void clickbtn2(View view){
        tv.setText("Hello");
    }
}