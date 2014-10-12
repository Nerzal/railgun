package net.k40s.railgun.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.example.games.basegameutils.GameHelper;

import net.k40s.railgun.Screens.RailgunMain;

public class AndroidLauncher extends AndroidApplication implements GameHelper.GameHelperListener, com.google.example.games.basegameutils.GoogleInterface {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        initialize(new RailgunMain(), config);
    }

    @Override
    public void onSignInFailed() {

    }

    @Override
    public void onSignInSucceeded() {

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public boolean getSignedIn() {
        return false;
    }

    @Override
    public void submitScore(int score) {

    }

    @Override
    public void submitAchievement(String id) {

    }

    @Override
    public void incrementAchievement(String id, int steps) {

    }

    @Override
    public void showScores() {

    }

    @Override
    public void getScoresData() {

    }

    @Override
    public boolean isConnected() {
        return false;
    }

    @Override
    public void showAchievements() {

    }
}
