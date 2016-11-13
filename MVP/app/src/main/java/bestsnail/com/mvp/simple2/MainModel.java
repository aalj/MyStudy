package bestsnail.com.mvp.simple2;


import bestsnail.com.mvp.utils.HttpTask;
import bestsnail.com.mvp.utils.HttpUtils;

/**
 * M层(数据、网络)
 * @author Dream
 *
 */
public class MainModel {
	
	public void login(String username,String pwd,final HttpUtils.OnHttpResultListener onHttpResultListener){
		HttpTask httpTask = new HttpTask(new HttpUtils.OnHttpResultListener() {

			@Override
			public void onResult(String result) {
				onHttpResultListener.onResult(result);
			}
		});
		httpTask.execute(username,pwd,"http://www.baidu.com");
	}
}
