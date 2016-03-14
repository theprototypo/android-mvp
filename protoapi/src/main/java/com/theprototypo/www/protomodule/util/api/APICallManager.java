package com.theprototypo.www.protomodule.util.api;


import com.squareup.okhttp.OkHttpClient;

import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

public class APICallManager {

    public enum APIRoute {
        LOGINDIGIT, LOGINFACEBOOK, LOGIN, LOGINEMAIL,
        GETUSERS, GETUSER, POSTUSER, CONFIRMORDER,
        GETORDERS, GETORDER, POSTORDER,
        GETSTOCKS, GETSTOCK, POSTSTOCK, PUTUSER, GETCAMPAIGN, GETCAMPAIGNS,

        GETACCOUNTHISTORY, GETBALANCEINQUIRY, GETINQUIRYTRANSFERMEMBER, GETLOGIN, GETLOGOUT,
        GETPURCHASE, GETTRANSFERMEMBER
    }

    private static APICallManager instance;
    private RestAdapter restAdapter;
    private RestAdapter eCashRestAdapter;
    private RestAdapter blueMixRestAdapter;

    private String endPoint = "http://api.limakilo.id";
    private String blueMixEndPoint = "http://limakilo.mybluemix.net";
    private String eCashEndPoint = "https://api.apim.ibmcloud.com/ex-icha-fmeirisidibmcom-ecash-be/sb/emoney/v1";
    //    public static final String DEMO_AUTH = "EkhZMUG0";
    public static final String DEMO_AUTH = "VygphmZh";
    public APIRoute apiRoute;
//    public static Boolean usingMock = true;

    private static String authentification;
    private static String appVersion;

    private static String msisdn = "08562999635";
    private static String uid = "22";
    private static String token = "892210";
    private static String credentials;

    /**
     * Returns singleton class instance
     */
    public static APICallManager getInstance(String authentification) {
        if (instance == null) {
            synchronized (APICallManager.class) {
                if (instance == null) {
                    instance = new APICallManager();
                }
                instance.setAuthentification(authentification);
            }
        }
        return instance;
    }

    /**
     * Returns singleton class instance
     */
    public static APICallManager getInstance() {
        return getInstance(authentification);
    }

    public APICallManager() {
        OkHttpClient client = new OkHttpClient();
        client.setReadTimeout(30, TimeUnit.SECONDS);
        client.setConnectTimeout(30, TimeUnit.SECONDS);

        restAdapter = new RestAdapter.Builder()
                .setEndpoint(endPoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();

        blueMixRestAdapter = new RestAdapter.Builder()
                .setEndpoint(blueMixEndPoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();

        eCashRestAdapter = new RestAdapter.Builder()
                .setEndpoint(eCashEndPoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setClient(new OkClient(client))
                .build();
    }

    public String getAuthentification() {
        return authentification;
    }

    public void setAuthentification(String authentification) {
        this.authentification = authentification;
    }

    public static void setAppVersion(String appVersion) {
        APICallManager.appVersion = appVersion;
    }

    public static String getAppVersion() {
        return appVersion;
    }

    public static void setToken(String token) {
        APICallManager.token = token;
    }

}
