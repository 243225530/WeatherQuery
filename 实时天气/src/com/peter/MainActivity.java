package com.peter;

import org.json.JSONException;

import com.peter.domain.HeWeatherData;
import com.peter.net.NetWork;
import com.peter.net.utils.NetWorkUtils;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	//请求接口
	private String httpUrl = "http://apis.baidu.com/heweather/weather/free";
	//请求参数
	private String httpArg = "city=beijing";
	
	private Button btn;
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.btn);
		tv = (TextView) findViewById(R.id.tv);
	}
	
	public void fun(View view){
		new Thread(){
			public void run() {
				String response = NetWork.request(httpUrl, httpArg);
				try {
					HeWeatherData data = NetWorkUtils.parseJSONByGSON(response);
					int i = data.getDailyForecast().length;
//					Log.d("信息", response);
					Log.d("daily", ""+i);
					Log.d("daily", ""+data.getHourlyForecast().length);
//					System.out.println(data.getDailyForecast()[2].getCond().getTxt_d());
//					System.out.println(data.getSuggestion().getSport().getTxt());
				} catch (JSONException e) {
					e.printStackTrace();
				}
			};
		}.start();
		
	}
}
