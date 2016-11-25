package com.gitanosandco.openagenda.agendaviewer.actDetail;


import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


import com.gitanosandco.openagenda.agendaviewer.R;

import com.gitanosandco.openagenda.agendaviewer.model.Event;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class DetailActivity extends AppCompatActivity {
    private Event event;
   // public static final String URL= "https://pixabay.com/static/uploads/photo/2014/04/03/10/11/soccer-ball-310065_640.png";
    public static  String URL;
    private ImageView imgImagen;

    private class CargaImagenes extends AsyncTask<String, Void, Bitmap> {

        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();

            pDialog = new ProgressDialog(DetailActivity.this);
            pDialog.setMessage("Loading Image");
            pDialog.setCancelable(true);
            pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pDialog.show();

        }

        @Override
        protected Bitmap doInBackground(String... params) {
            // TODO Auto-generated method stub
            Log.i("doInBackground" , "Go inn doInBackground");
            String url = params[0];
            Bitmap imagen = descargarImagen(url);
            return imagen;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            imgImagen.setImageBitmap(result);
            pDialog.dismiss();
        }
        private Bitmap descargarImagen (String imageHttpAddress){
            URL imageUrl = null;
            Bitmap imagen = null;
            try{
                imageUrl = new URL(imageHttpAddress);
                HttpURLConnection conn = (HttpURLConnection) imageUrl.openConnection();
                conn.connect();
                imagen = BitmapFactory.decodeStream(conn.getInputStream());
            }catch(IOException ex){
                ex.printStackTrace();
            }

            return imagen;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv = (TextView) findViewById(R.id.a_detail_txtv_test_name);
        //TODO: retreive layout elements and fill with event details

        Event event = (Event) getIntent().getSerializableExtra("event");
        tv.setText(event.getTitle().getFr());


        TextView tv1 = (TextView) findViewById(R.id.a_detail_txtv_test_descrip);
        if(event.getLongDescription()==null){
            tv1.setText("No description");
        }
        else{
            tv1.setText(event.getLongDescription().getFr());
        }

        TextView tv2 = (TextView) findViewById(R.id.a_detail_txtv_test_conditions);
        if(event.getConditions()==null){
            tv2.setText("No information about conditions");
        }
        else{
            tv2.setText(event.getConditions().getFr());
        }


        TextView tv3 = (TextView) findViewById(R.id.a_detail_txtv_test_city);
        if(event.getConditions()==null){
            tv3.setText("No information about the city");
        }
        else{
            tv3.setText(event.getAddress());
        }

       TextView tv4 = (TextView) findViewById(R.id.a_detail_txtv_test_date);
        if(event.getConditions()==null){
            tv4.setText("No information about dates");
        }
        else{
            tv4.setText(event.getFirstDate());
        }



        imgImagen = (ImageView)findViewById(R.id.imagen);
        URL=event.getThumbnail();
        CargaImagenes nuevaTarea = new CargaImagenes();
        nuevaTarea.execute(URL);


    }
}
