package com.e.sudoku.Presenter.Manager;

import android.util.Log;

import com.e.sudoku.R;
import com.e.sudoku.View.SpecialEditText;
import com.e.sudoku.View.SudokuActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class SudokuManager {
    private static final String TAG = "SUDOKU_MANAGER";
    // Variables
    private SudokuActivity activity;

    ArrayList <Integer> board = new ArrayList();
    ArrayList <Integer> row1 = new ArrayList<>();
    ArrayList <Integer> row2 = new ArrayList<>();
    ArrayList <Integer> row3 = new ArrayList<>();
    ArrayList <Integer> row4 = new ArrayList<>();
    ArrayList <Integer> row5 = new ArrayList<>();
    ArrayList <Integer> row6 = new ArrayList<>();
    ArrayList <Integer> row7 = new ArrayList<>();
    ArrayList <Integer> row8 = new ArrayList<>();
    ArrayList <Integer> row9 = new ArrayList<>();
    ArrayList <Integer> col1 = new ArrayList<>();
    ArrayList <Integer> col2 = new ArrayList<>();
    ArrayList <Integer> col3 = new ArrayList<>();
    ArrayList <Integer> col4 = new ArrayList<>();
    ArrayList <Integer> col5 = new ArrayList<>();
    ArrayList <Integer> col6 = new ArrayList<>();
    ArrayList <Integer> col7 = new ArrayList<>();
    ArrayList <Integer> col8 = new ArrayList<>();
    ArrayList <Integer> col9 = new ArrayList<>();
    ArrayList <Integer> box1 = new ArrayList<>();
    ArrayList <Integer> box2 = new ArrayList<>();
    ArrayList <Integer> box3 = new ArrayList<>();
    ArrayList <Integer> box4 = new ArrayList<>();
    ArrayList <Integer> box5 = new ArrayList<>();
    ArrayList <Integer> box6 = new ArrayList<>();
    ArrayList <Integer> box7 = new ArrayList<>();
    ArrayList <Integer> box8 = new ArrayList<>();
    ArrayList <Integer> box9 = new ArrayList<>();

    // Constructor
    public SudokuManager(SudokuActivity sudokuActivity) {
        addActivity(sudokuActivity);
        for (int i = 0; i < 81; i ++)
            board.add(0);
    }

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

    // Generate a solved board
    // TODO add a listener
    public void createBoard(ArrayList <Integer> newBoard) {
        // add a number at one of the cells that is free
        Random random = new Random();
        int randomIndex = random.nextInt(81);
        int randomNumber = random.nextInt(9);
        Log.e(TAG, randomIndex + " random INDEX");
        Log.e(TAG, randomNumber + " random NUMBER");
        board.set(randomIndex, randomNumber);
        Log.e(TAG, board.get(randomIndex).toString());
        setBoard();
    }

    // Set the rows and things from an updated board
    public void setBoard() {
        int length = 9;
        for (int i = 0; i < length; i++) {
            row1.set(i, board.get(i));
            row2.set(i, board.get(i + length ));
            row3.set(i, board.get(i + length * 2));
            row4.set(i, board.get(i + length * 3));
            row5.set(i, board.get(i + length * 4));
            row6.set(i, board.get(i + length * 5));
            row7.set(i, board.get(i + length * 6));
            row8.set(i, board.get(i + length * 7));
            row9.set(i, board.get(i + length * 8));

            col1.set(i, board.get(length * i));
            col2.set(i, board.get(length * i + 1));
            col3.set(i, board.get(length * i + 2));
            col4.set(i, board.get(length * i + 3));
            col5.set(i, board.get(length * i + 4));
            col6.set(i, board.get(length * i + 5));
            col7.set(i, board.get(length * i + 6));
            col8.set(i, board.get(length * i + 7));
            col9.set(i, board.get(length * i + 8));
        }

        int count = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++,count++, index++) {
                box1.set(index, board.get(count));
                box2.set(index, board.get(count + 27));
                box3.set(index, board.get(count + 54));
                box4.set(index, board.get(count + 3));
                box5.set(index, board.get(count + 30));
                box6.set(index, board.get(count + 57));
                box7.set(index, board.get(count + 6));
                box8.set(index, board.get(count + 33));
                box9.set(index, board.get(count + 60));
            }
            count += 6;
        }
    }

    // Make a board!
    public void addBoard() {
        int length = 9;
        for (int i = 0; i < length; i++) {
            row1.add(i, board.get(i));
            row2.add(i, board.get(i + length ));
            row3.add(i, board.get(i + length * 2));
            row4.add(i, board.get(i + length * 3));
            row5.add(i, board.get(i + length * 4));
            row6.add(i, board.get(i + length * 5));
            row7.add(i, board.get(i + length * 6));
            row8.add(i, board.get(i + length * 7));
            row9.add(i, board.get(i + length * 8));
            
            col1.add(i, board.get(length * i));
            col2.add(i, board.get(length * i + 1));
            col3.add(i, board.get(length * i + 2));
            col4.add(i, board.get(length * i + 3));
            col5.add(i, board.get(length * i + 4));
            col6.add(i, board.get(length * i + 5));
            col7.add(i, board.get(length * i + 6));
            col8.add(i, board.get(length * i + 7));
            col9.add(i, board.get(length * i + 8));
        }

        int count = 0;
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++,count++, index++) {
                box1.add(index, board.get(count));
                box2.add(index, board.get(count + 27));
                box3.add(index, board.get(count + 54));
                box4.add(index, board.get(count + 3));
                box5.add(index, board.get(count + 30));
                box6.add(index, board.get(count + 57));
                box7.add(index, board.get(count + 6));
                box8.add(index, board.get(count + 33));
                box9.add(index, board.get(count + 60));
            }
            count += 6;
        }

        Log.e(TAG, board.toString());
        Log.e(TAG, "rows");
        Log.e(TAG, row1.toString());
        Log.e(TAG, row2.toString());
        Log.e(TAG, row3.toString());
        Log.e(TAG, row4.toString());
        Log.e(TAG, row5.toString());
        Log.e(TAG, row6.toString());
        Log.e(TAG, row7.toString());
        Log.e(TAG, row8.toString());
        Log.e(TAG, row9.toString());
        Log.e(TAG, "columns");
        Log.e(TAG, col1.toString());
        Log.e(TAG, col2.toString());
        Log.e(TAG, col3.toString());
        Log.e(TAG, col4.toString());
        Log.e(TAG, col5.toString());
        Log.e(TAG, col6.toString());
        Log.e(TAG, col7.toString());
        Log.e(TAG, col8.toString());
        Log.e(TAG, col9.toString());
        Log.e(TAG, "boxes");
        Log.e(TAG, box1.toString());
        Log.e(TAG, box2.toString());
        Log.e(TAG, box3.toString());
        Log.e(TAG, box4.toString());
        Log.e(TAG, box5.toString());
        Log.e(TAG, box6.toString());
        Log.e(TAG, box7.toString());
        Log.e(TAG, box8.toString());
        Log.e(TAG, box9.toString());

        createBoard(new ArrayList<Integer>());
    }

    // Setters
    private void addActivity(SudokuActivity sudokuActivity) { this.activity = sudokuActivity; }

    // Getters
    private SudokuActivity getActivity() { return activity; }
}
