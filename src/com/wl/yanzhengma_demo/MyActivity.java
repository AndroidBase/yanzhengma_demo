package com.wl.yanzhengma_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MyActivity extends Activity {

    private ImageView yanzhengma_img;
    private Button yanzhengma_huan;
    private EditText yanzhengma_val;
    private Code code;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);




        yanzhengma_img = (ImageView) findViewById(R.id.yanzhengma_img);
        yanzhengma_huan = (Button) findViewById(R.id.yanzhengma_huan);
        yanzhengma_val = (EditText) findViewById(R.id.yanzhengma_val);

        yanzhengma_img.setImageBitmap(code.getInstance().createBitmap());

        System.out.println("验证码："+code.getInstance().getCode());

        yanzhengma_huan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                yanzhengma_img.setImageBitmap(code.getInstance().createBitmap());
                System.out.println("验证码："+code.getInstance().getCode());
            }
        });
    }
}
