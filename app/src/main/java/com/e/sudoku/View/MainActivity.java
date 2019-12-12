package com.e.sudoku.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.e.sudoku.Presenter.Manager.MainManager;
import com.e.sudoku.R;

public class MainActivity extends AppCompatActivity {
    // VARIABLES
    private MainManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = new MainManager();
    }

}
