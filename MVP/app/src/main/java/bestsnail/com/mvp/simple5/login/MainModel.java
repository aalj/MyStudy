package bestsnail.com.mvp.simple5.login;


import bestsnail.com.mvp.simple5.framework.model.impl.MvpBaseModel;
import bestsnail.com.mvp.utils.HttpTask;
import bestsnail.com.mvp.utils.HttpUtils;

/**
 * M层(数据、网络)
 * @author Dream
 *
 */
public class MainModel extends MvpBaseModel {
	
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
