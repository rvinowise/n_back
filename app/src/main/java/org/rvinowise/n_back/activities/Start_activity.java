package org.rvinowise.n_back.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.games.Game;

import org.rvinowise.n_back.R;


public class Start_activity extends Activity
implements View.OnClickListener
{
    private static final int GAME_REQUEST = 1;

    @Override
    public void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        setContentView(R.layout.activity_start);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_start:
                on_start();
                break;
        }
    }

    private void on_start() {
        Intent game_intent = new Intent(this, Game_activity.class);
        startActivityForResult(game_intent, GAME_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case GAME_REQUEST:

                break;
        }
    }
}
