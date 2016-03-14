package com.theprototypo.www.protoapp.ui.login.mvp;

/**
 * Created by walesadanto on 23/6/15.
 */
public class LoginInteractorImpl implements LoginInteractor  {

    public LoginListener listener;

    public LoginInteractorImpl(LoginListener loginListener){
        this.listener = loginListener;
    }

}
