package com.gitanosandco.openagenda.agendaviewer.api;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.gitanosandco.openagenda.agendaviewer.util.LruBitmapCache;

/**
 * Singleton to hold the requestQueue
 */
public class RequestHolder {
    private static RequestHolder instance;
    private RequestQueue requestQueue;
    private ImageLoader imageLoader;

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

    public ImageLoader getImageLoader(Context context) {
        getRequestQueue(context);
        if (imageLoader == null) {
            imageLoader = new ImageLoader(this.requestQueue,
                    new LruBitmapCache());
        }
        return imageLoader;
    }
}
