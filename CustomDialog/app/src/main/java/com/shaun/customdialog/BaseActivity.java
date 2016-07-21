package com.shaun.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Pomelo on 2016/7/21.
 */
public class BaseActivity extends AppCompatActivity {
    private Dialog mWaitDlg;
    private boolean mIsShowing;public void openWaitDialog() {
        if (mWaitDlg != null) return;
        mWaitDlg = DialogUtil.createLoadingDialog(this, "请稍候...");
        mWaitDlg.show();
    }
    public void openWaitDialog(String msg) {
        if (mWaitDlg != null) return;
        mWaitDlg = DialogUtil.createLoadingDialog(this, msg);
        mWaitDlg.show();
    }
    public void closeWaitDialog() {
        if (mWaitDlg == null) return;
        mWaitDlg.dismiss();
        mWaitDlg = null;
    }
}
