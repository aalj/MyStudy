package bestsnail.com.mvp.simple2;


import bestsnail.com.mvp.utils.HttpUtils;

/**
 * P层
 * 
 * @author Dream
 *
 */
public class MainPresenter {

	private MainView mainView;
	private MainModel mainModel;

	public MainPresenter(MainView mainView) {
		this.mainView = mainView;
		this.mainModel = new MainModel();
	}

	public void login(String username, String pwd) {
		this.mainModel.login(username, pwd, new HttpUtils.OnHttpResultListener() {

			@Override
			public void onResult(String result) {
				mainView.onLoginResult(result);
			}
		});
	}
}
