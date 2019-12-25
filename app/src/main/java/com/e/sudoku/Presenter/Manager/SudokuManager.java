package com.e.sudoku.Presenter.Manager;

import com.e.sudoku.R;
import com.e.sudoku.View.SpecialEditText;
import com.e.sudoku.View.SudokuActivity;

import java.util.ArrayList;

public class SudokuManager {
    // Variables
    private SudokuActivity activity;

    // Constructor
    public SudokuManager(SudokuActivity sudokuActivity) { setActivity(sudokuActivity); }

    /**
     * Create the array list of array lists for the activity
     * @return the array list of array lists of SpecialEditText blocks
     */
    public ArrayList<ArrayList<SpecialEditText>> createArray() {
        ArrayList<ArrayList<SpecialEditText>> blocks = new ArrayList<>();
        ArrayList<SpecialEditText> row = new ArrayList<>();
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block00));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block01));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block02));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block03));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block04));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block05));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block06));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block07));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block08));
        blocks.add(0, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block10));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block11));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block12));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block13));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block14));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block15));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block16));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block17));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block18));
        blocks.add(1, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block20));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block21));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block22));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block23));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block24));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block25));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block26));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block27));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block28));
        blocks.add(2, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block30));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block31));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block32));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block33));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block34));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block35));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block36));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block37));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block38));
        blocks.add(3, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block40));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block41));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block42));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block43));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block44));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block45));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block46));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block47));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block48));
        blocks.add(4, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block50));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block51));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block52));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block53));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block54));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block55));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block56));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block57));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block58));
        blocks.add(5, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block60));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block61));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block62));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block63));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block64));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block65));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block66));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block67));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block68));
        blocks.add(6, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block70));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block71));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block72));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block73));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block74));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block75));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block76));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block77));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block78));
        blocks.add(7, row);
        row.add(0, (SpecialEditText) getActivity().findViewById(R.id.block80));
        row.add(1, (SpecialEditText) getActivity().findViewById(R.id.block81));
        row.add(2, (SpecialEditText) getActivity().findViewById(R.id.block82));
        row.add(3, (SpecialEditText) getActivity().findViewById(R.id.block83));
        row.add(4, (SpecialEditText) getActivity().findViewById(R.id.block84));
        row.add(5, (SpecialEditText) getActivity().findViewById(R.id.block85));
        row.add(6, (SpecialEditText) getActivity().findViewById(R.id.block86));
        row.add(7, (SpecialEditText) getActivity().findViewById(R.id.block87));
        row.add(8, (SpecialEditText) getActivity().findViewById(R.id.block88));
        blocks.add(8, row);
        return blocks;
    }

    // Setters
    private void setActivity(SudokuActivity sudokuActivity) { this.activity = sudokuActivity; }

    // Getters
    private SudokuActivity getActivity() { return activity; }
}
