package com.kui.wxvideoeditt;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    String video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video= Environment.getExternalStorageDirectory().getPath()+ File.separator
                +"test"+File.separator+"a.mp4";

        video = "/storage/emulated/0/video_1550467218206.mp4";
        video = "/storage/emulated/0/DCIM/Camera/VID_20190218_135348.mp4";
        video = "/storage/emulated/0/srobort_video/0c078dee-e69e-4db5-870c-bb167a17654a.mp4";
        video = "/storage/emulated/0/srobort_video/4c09f67d-c667-4377-848c-2ffd2335b572.mp4";

        video = "/storage/emulated/0/DCIM/Camera/VID_20190218_173943.mp4";
        //video = "http://reachpass.oss-cn-hangzhou.aliyuncs.com/1193995b-1df3-48a0-ba4f-4daf605c8a17.mp4";
        Log.i("video","video===="+video);
    }


    public void click(View view){
        Intent intent=new Intent();
        intent.putExtra(EsayVideoEditActivity.PATH,video);
        intent.setClass(this,EsayVideoEditActivity.class);
        startActivity(intent);
    }

}
