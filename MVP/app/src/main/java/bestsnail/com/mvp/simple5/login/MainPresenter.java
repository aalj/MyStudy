package bestsnail.com.mvp.simple5.login;

import android.content.Context;

import bestsnail.com.mvp.simple5.framework.presenter.impl.MvpBasePresenter;
import bestsnail.com.mvp.utils.HttpUtils;
import bestsnail.com.mvp.simple5.login.MainView;


/**
 * P层
 * 
 * @author Dream
 *
 */
public class MainPresenter extends MvpBasePresenter<MainView> {

	private MainModel mainModel;

	public MainPresenter(Context context) {
		super(context);
		this.mainModel = new MainModel();
	}

	public void login(String username, String pwd) {
		this.mainModel.login(username, pwd, new HttpUtils.OnHttpResultListener() {

			@Override
			public void onResult(String result) {
				getView().onLoginResult(result);
			}
		});
	}

}
