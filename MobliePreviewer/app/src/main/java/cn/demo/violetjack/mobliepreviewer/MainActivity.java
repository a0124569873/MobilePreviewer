package cn.demo.violetjack.mobliepreviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * 输入网址，有历史记录
 * @author violetjack
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wvContent = (WebView) findViewById(R.id.wvContent);
        wvContent.loadUrl("www.baidu.com");
    }
}
