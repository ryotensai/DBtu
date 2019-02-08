package com.example.a172119.dbtu;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class AsyncHttpRequest extends AsyncTask<String, Void, String> {
    private Activity mActivity;

    public AsyncHttpRequest(Activity activity) {
        mActivity = activity;
    }

    @Override
    protected String doInBackground(String... params) {
        HttpURLConnection connection = null;
        StringBuilder sb = new StringBuilder();
        Log.e("aaa",params[0]);

        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();


            is.close();
        } catch (IOException e) {
            Log.e("ccc",e.toString());
            e.printStackTrace();

        } finally{//←←絶対にするやつ
            assert connection != null;

        }
        return sb.toString();
    }

    public void onPostExecute(String string) {
        ((TextView)mActivity.findViewById(R.id.textView)).setText(string);
    }

}