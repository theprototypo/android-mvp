package com.theprototypo.www.protoapp.ui.login.mvp;

import com.theprototypo.www.protomodule.util.api.APICallListener;
import com.theprototypo.www.protomodule.util.api.APICallManager;
import com.theprototypo.www.protomodule.util.api.RootResponseModel;

import retrofit.RetrofitError;

/**
 * Created by walesadanto on 23/6/15.
 */
public class LoginPresenterImpl implements LoginPresenter, LoginListener, APICallListener {

    @Override
    public void presentState(LoginView.ViewState state) {

    }

    @Override
    public void onAPICallSucceed(APICallManager.APIRoute route, RootResponseModel responseModel) {

    }

    @Override
    public void onAPICallFailed(APICallManager.APIRoute route, RetrofitError retrofitError) {

    }
}
