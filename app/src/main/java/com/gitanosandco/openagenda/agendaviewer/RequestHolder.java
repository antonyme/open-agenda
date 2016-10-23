package com.gitanosandco.openagenda.agendaviewer;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Singleton to hold the requestQueue
 */
public class RequestHolder {
    private static RequestHolder instance;
    private RequestQueue requestQueue;

    private RequestHolder() {
    }

    public static synchronized RequestHolder getInstance() {
        if(instance == null) {
            instance = new RequestHolder();
        }
        return instance;
    }

    public RequestQueue getRequestQueue(Context context) {
        if(requestQueue == null) {
            requestQueue = Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }
}
