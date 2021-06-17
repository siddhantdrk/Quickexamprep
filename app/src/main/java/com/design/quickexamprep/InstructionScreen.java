package com.design.quickexamprep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstructionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction_screen);

        WebView browser = findViewById(R.id.instruction_webview);
        browser.loadUrl("https://www.niu.edu/ems/quizfiles/quizInstrs.html");
        browser.setWebViewClient(new InstructionBrowser());

    }

    private class InstructionBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}