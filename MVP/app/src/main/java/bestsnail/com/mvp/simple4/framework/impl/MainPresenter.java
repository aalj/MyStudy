package bestsnail.com.mvp.simple4.framework.impl;


import bestsnail.com.mvp.simple4.framework.AbsMvpPresenter;
import bestsnail.com.mvp.utils.HttpUtils;

/**
 * P层
 * 
 * @author Dream
 *
 */
public class MainPresenter extends AbsMvpPresenter<MainView> {

	private MainModel mainModel;

	public MainPresenter() {
		this.mainModel = new MainModel();
	}

	public void login(String username, String pwd) {
		this.mainModel.login(username, pwd, new HttpUtils.OnHttpResultListener() {

			@Override
			public void onResult(String result) {
				if (getView() != null) {
					getView().onLoginResult(result);
				}
			}
		});
	}

}
