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

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
        setContentView(R.layout.activity_detail);
        // Set Collapsing Toolbar layout to the screen
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Set title of Detail page
        // collapsingToolbar.setTitle(getString(R.string.item_title));


        int position = getIntent().getIntExtra("position", 1);
        Resources resources = getResources();

        toolbar.setTitle(utils.getFilmArrayList().get(position).getFilmName());

        TextView placeDetail = (TextView) findViewById(R.id.place_detail);
        placeDetail.setText(utils.getFilmArrayList().get(position).getFilmDescription());

        String[] placeLocations = resources.getStringArray(R.array.filmDescriptionLong);
        TextView placeLocation = (TextView) findViewById(R.id.place_location);
        placeLocation.setText(placeLocations[position]);

    }


}
