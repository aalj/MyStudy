package bestsnail.com.mvp.simple1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import bestsnail.com.mvp.R;
import bestsnail.com.mvp.utils.HttpTask;
import bestsnail.com.mvp.utils.HttpUtils;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	// 其实在Android当中，本身就是一个非常典型MVC架构
	// 在Android MVC中
	// M代表：数据
	// C代表: activity或者Fragment
	// V代表：视图
	// MVP适合大项目
	public void click(View v) {
		HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {

			@Override
			public void onResult(String result) {
				// 解析数据
				// 更新UI
			}
		});
		httpTask.execute("dream","123456","http://www.baidu.com");
	}

}
