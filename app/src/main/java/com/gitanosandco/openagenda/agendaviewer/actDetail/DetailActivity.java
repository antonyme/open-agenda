package com.gitanosandco.openagenda.agendaviewer.actDetail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.gitanosandco.openagenda.agendaviewer.R;
import com.gitanosandco.openagenda.agendaviewer.model.Event;

public class DetailActivity extends AppCompatActivity {
    private Event event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv = (TextView) findViewById(R.id.a_detail_txtv_test);
        //TODO: retreive layout elements and fill with event details

        Event event = (Event) getIntent().getSerializableExtra("event");
        tv.setText(event.getTitle().getFr());

    }
}
