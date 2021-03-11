package com.dreamfly.ad;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;

import com.dreamfly.AdParam;
import com.dreamfly.st;
import com.vv.view.XXListener;
import com.zues.adsdk.api.HTAdSDK;

public class ADManager
{
    private static ADManager sInstance;

    public static ADManager getInstance()
    {
        if (sInstance == null)
        {
            sInstance = new ADManager();
        }
        return sInstance;
    }

    public ADManager()
    {
    }

    public void init(Application app, String aId, String sId, XXListener listener)
    {
        try
        {
            st.getInstance().initSDK(app, aId, "", listener);
            HTAdSDK.init(app, sId);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void callKPAd(Context context, String codeId, int sexType, ViewGroup view, XXListener listener)
    {
        st.getInstance().openKP(context, codeId, sexType, view, listener);
    }

    public void callCPAd(Context context, String codeId, int sexType, XXListener listener)
    {
        st.getInstance().openCP(context, codeId, sexType, listener);
    }

    public void callHFAd(Context context, String codeId, int sexType, ViewGroup view, XXListener listener)
    {
        st.getInstance().openHF(context, codeId, sexType, view, listener);
    }

    public void callNativeAd(Context context, String codeId, int sexType, AdParam param, XXListener listener)
    {
        st.getInstance().nativeAd(context, codeId, sexType, param, listener);
    }

    public void callVideoAd(Context context, String codeId, int sexType, XXListener listener)
    {
        st.getInstance().openVideo(context, codeId, sexType, listener);
    }

    public void activityOnResume(Context context)
    {
        st.getInstance().resume(context);
    }

    public void activityOnPause(Context context)
    {
        st.getInstance().pause(context);
    }

    public void appOnExit(Context context)
    {
        st.getInstance().destroy(context);
    }
}