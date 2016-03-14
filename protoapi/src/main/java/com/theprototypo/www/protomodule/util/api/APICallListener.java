package com.theprototypo.www.protomodule.util.api;

import retrofit.RetrofitError;

/**
 * Created by walesadanto on 3/13/16.
 */
public interface APICallListener {

    void onAPICallSucceed(APICallManager.APIRoute route, RootResponseModel responseModel);
    void onAPICallFailed(APICallManager.APIRoute route, RetrofitError retrofitError);

}
