package com.adjust.sdktesting;

import android.net.Uri;

/**
 * Created by pfms on 22/03/16.
 */
public interface OnDeeplinkResponseListener {
    boolean launchReceivedDeeplink(Uri deeplink);
}
