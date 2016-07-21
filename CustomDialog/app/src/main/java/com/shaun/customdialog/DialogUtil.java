package com.shaun.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Pomelo on 2016/7/21.
 */
public class DialogUtil {
    public static Dialog createLoadingDialog(Context context, String msg) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.loading_dialog, null);
        // 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);
        // 加载布局
        TextView msgTV = (TextView) v.findViewById(R.id.tv_msg);
        msgTV.setText(msg);
        Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);// 创建自定义样式dialog
        loadingDialog.setCancelable(false);// 可以用"返回键"取消
        loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        return loadingDialog;
    }
}
