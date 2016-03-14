package com.theprototypo.www.protoapp.ui.login.mvp;

import com.theprototypo.www.protomodule.util.api.APICallListener;

/**
 * Created by walesadanto on 23/6/15.
 */
public interface LoginListener extends APICallListener {

    public enum ListenerCaller{
        DIGIT, FACEBOOK, LATER
    }

    public enum ListenerAction{
        FACEBOOK_AUTHORIZATION, DIGIT_LOGIN, LATER_LOGIN
    }

    public enum ListenerResult{
        SUCCESS, FAILURE, CANCEL
    }

}
