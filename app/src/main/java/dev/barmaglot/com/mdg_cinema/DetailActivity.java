/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.barmaglot.com.mdg_cinema;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Provides UI for the Detail page with Collapsing Toolbar.
 */
public class DetailActivity extends AppCompatActivity {
    private Utils utils;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        utils = new Utils();
        final int position = getIntent().getIntExtra("position", 1);
        Resources resources = getResources();
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); // посмотреть callback

        getSupportActionBar().setTitle(utils.getFilmArrayList().get(position).getFilmName());

        //TextView filmDescription = (TextView) findViewById(R.id.film_description);
        //filmDescription.setText(utils.getFilmArrayList().get(position).getFilmDescription() + " длинное описание очень. Длинннннооооооооооое описание описание. длинное-предлинное описание");

        TextView filmAge = (TextView) findViewById(R.id.film_age);
        filmAge.setText(String.valueOf(utils.getFilmArrayList().get(position).getSeanceList().get(0).getAge()) + "+");

        TextView filmDuration = (TextView) findViewById(R.id.film_duration);
        filmDuration.setText(String.valueOf(utils.getFilmArrayList().get(position).getFilmDuration()) + " мин");

        ImageView filmImage = (ImageView) findViewById(R.id.film_image);
        filmImage.setImageResource(utils.getFilmArrayList().get(position).getImage());
        filmImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                /*Intent intent = new Intent(context, YouTube.class);
                intent.putExtra("position",position);*/
                Intent intent = new Intent(context,YouTubeActivity.class);
                intent.putExtra("position",position);
                context.startActivity(intent);
            }
        });

    }

}
