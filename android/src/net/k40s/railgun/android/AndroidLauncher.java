package net.k40s.railgun.android;

import android.os.Bundle;
import android.view.WindowManager;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import net.k40s.railgun.RailgunMain;

import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;;
import com.google.example.games.basegameutils.GameHelper;
import com.google.example.games.basegameutils.GameHelper.GameHelperListener;

public class AndroidLauncher extends AndroidApplication implements GameHelperListener, com.google.example.games.basegameutils.GoogleInterface {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		initialize(new RailgunMain(), config);
	}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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
