package rauniyar.com.portfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Rauniyar on 11/13/2014.
 */
public class Resume extends Fragment {

    WebView webview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_resume, container, false);

        webview = (WebView) rootView.findViewById(R.id.resumeWebView);
        webview.getSettings().setJavaScriptEnabled(true);
        String pdfLink = "http://chandan-rauniyar.net/Content/Resume.pdf";
        webview.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfLink);
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());



        return rootView;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
       return onKeyDown(keyCode, event);

    }
}
