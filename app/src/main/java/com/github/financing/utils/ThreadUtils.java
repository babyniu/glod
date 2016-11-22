package com.github.financing.utils;

import android.os.Handler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUtils {

    private static ExecutorService service;

    /**
     * 创建一个线程池,发送消息,文件时启用
     */
    static {
        service = Executors.newFixedThreadPool(5);
    }

    public static void runInThread(Runnable r) {
        new Thread(r).start();
    }

    private static Handler handler = new Handler();

    public static void runUIThread(Runnable r) {
        handler.post(r);
    }

    public static void runInThread_Pool(Runnable r) {
        service.submit(r);
    }


}
