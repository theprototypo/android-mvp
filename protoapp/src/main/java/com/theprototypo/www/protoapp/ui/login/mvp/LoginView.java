package com.theprototypo.www.protoapp.ui.login.mvp;

/**
 * Created by walesadanto on 25/6/15.
 */
public interface LoginView {

    public enum ViewState {
        IDLE, LOGGING_IN, LOGIN_LATER, INPUT_INVITATION_CODE, SUCCESS, FAILURE, CANCEL, LOADING, ERROR
    }

    public enum ScreenState {
        SPLASH, LOGIN, LOGIN_FACEBOOK
    }

    public LoginModel doRetrieveModel();
    public void showState(ViewState state);


}
