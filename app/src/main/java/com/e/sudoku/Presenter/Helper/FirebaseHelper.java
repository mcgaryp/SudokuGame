package com.e.sudoku.Presenter.Helper;

import com.e.sudoku.Presenter.Interface.LoadListener;
import com.e.sudoku.Presenter.Interface.SaveListener;
import com.google.firebase.firestore.FirebaseFirestore;

/**
 * Class: Assistant to a class to save and load saved games from Firebase. The usage is intended to
 *          be in the background while the user continues to do things on their phone.*/
public class FirebaseHelper {
    // Variables
    private final static String TAG = "FIREBASE_HELPER";
    private FirebaseFirestore database;

    // Constructor
    FirebaseHelper() { setDatabase(FirebaseFirestore.getInstance()); }

    /**
     * Save to the database
     * @param listener used to let the next class know if the save was a success of a fail.
     */
    public void save(SaveListener listener) {

    }

    /**
     * Load from the database
     * @param listener used to let the next class know if the load was a success or a fail.
     */
    public void load(LoadListener listener) {

    }

    // SETTERS
    private void setDatabase(FirebaseFirestore data) { this.database = data; }
    // GETTERS
    private FirebaseFirestore getDatabase() { return database; }
}
