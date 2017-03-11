package com.hongri.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * develop分支修改 develop修改"1" develop修改"2" develop修改"3"
 * develop_20170315提交 20170315修改"1" 20170315修改"2" 20170315修改"3" 20170315修改"4"
 * develop_20170329修改 20170329修改"1" 20170329修改"2" 20170329修改"3" 20170329修改"4" 20170329修改"5" 20170329修改"6"
 * develop_20170415修改 20170415修改"1" 20170415修改"2"
 * develop_20170429修改 20170429修改"1" 20170429修改"2" 20170429修改"4"（error commit）
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
