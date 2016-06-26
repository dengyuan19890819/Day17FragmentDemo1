package com.qf.xs.day17fragmentdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**--静态添加碎片
        1.定义类继承Fragment
        2.重写一些方法
        3.在布局中添加碎片--*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("print","MainActivity....onStop....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("print","MainActivity....onDestroy....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("print","MainActivity....onPause....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("print","MainActivity....onResume....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("print","MainActivity....onStart....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("print","MainActivity....onRestart....");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("print","MainActivity....onCreate....");
    }
}
