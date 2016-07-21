package com.shaun.customdialog;

import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.btn_show_custom)
    Button showCusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_show)
    public void showDialog() {
        openWaitDialog();
        cancelDialog();
    }

    @OnClick(R.id.btn_show_custom)
    public void showCustomDialog() {
        openWaitDialog(showCusText.getText().toString());
        cancelDialog();
    }

    private void cancelDialog() {
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                closeWaitDialog();
            }
        }, 3000);
    }

}
