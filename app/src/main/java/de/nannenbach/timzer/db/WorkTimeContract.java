package de.nannenbach.timzer.db;

import android.provider.BaseColumns;

/**
 * Created by toffer on 27.04.2017.
 */

public class WorkTimeContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private WorkTimeContract() {}

    /* Inner class that defines the table contents */
    public static class WorkTimeEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
