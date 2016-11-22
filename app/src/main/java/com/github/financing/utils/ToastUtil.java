package com.github.financing.utils;


import android.content.Context;
import android.widget.Toast;


/**
 * Toast工具类
 */
public class ToastUtil {
    private static Toast mToast;

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param resid
     */
    public static void showShort(Context context, int resid) {
        // 解决Toast连点显示不及时的问题
        if (mToast == null) {
            if (context != null) {
                mToast = Toast.makeText(context, resid + "", Toast.LENGTH_SHORT);
            }
        } else {
            mToast.setText(resid);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param msg
     */
    public static void showShort(Context context, String msg) {
        // 解决Toast连点显示不及时的问题
        if (mToast == null) {
            if (context != null) {
                mToast = Toast.makeText(context, msg + "", Toast.LENGTH_SHORT);
            }
        } else {
            mToast.setText(msg);
            mToast.setDuration(Toast.LENGTH_SHORT);
        }
        mToast.show();
    }

    public static void showUiShort(final Context context, final String msg) {

        ThreadUtils.runUIThread(new Runnable() {
            @Override
            public void run() {
                // 解决Toast连点显示不及时的问题
                if (mToast == null) {
                    if (context != null) {
                        mToast = Toast.makeText(context, msg + "", Toast.LENGTH_SHORT);
                    }
                } else {
                    mToast.setText(msg);
                    mToast.setDuration(Toast.LENGTH_SHORT);
                }
                mToast.show();
            }
        });

    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param resid
     */
    public static void showLong(Context context, int resid) {
        if (mToast == null) {
            if (context != null) {
                mToast = Toast.makeText(context, resid + "", Toast.LENGTH_LONG);
            }
        } else {
            mToast.setDuration(Toast.LENGTH_LONG);
            mToast.setText(resid);
        }
        mToast.show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param msg
     */
    public static void showLong(Context context, String msg) {
        if (mToast == null) {
            if (context != null) {
                mToast = Toast.makeText(context, msg + "", Toast.LENGTH_LONG);
            }
        } else {
            mToast.setDuration(Toast.LENGTH_LONG);
            mToast.setText(msg);
        }
        mToast.show();
    }

}
