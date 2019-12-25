package com.e.sudoku.View;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.e.sudoku.Presenter.Manager.SudokuManager;
import com.e.sudoku.R;

import java.util.ArrayList;

public class SudokuActivity extends AppCompatActivity {
    // VARIABLES
    private static final String TAG = "SUDOKU_ACTIVITY";
    private SudokuManager manager;
    private ArrayList <ArrayList<SpecialEditText>> blocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
        manager = new SudokuManager(this);
        blocks = manager.createArray();
        manager.addBoard();
    }
}
