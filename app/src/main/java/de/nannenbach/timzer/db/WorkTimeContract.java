package de.nannenbach.timzer.db;

import android.provider.BaseColumns;

/**
 * Created by toffer on 27.04.2017.
 */

public class WorkTimeContract {
    public static final String TABLE_NAME = "entry";
    public static final String COLUMN_NAME_DATE = "date";
    public static final String COLUMN_NAME_START = "start";
    public static final String COLUMN_NAME_END = "end";
    public static final String COLUMN_NAME_BREAK = "break";
    public static final String COLUMN_NAME_INTERRUPTION = "interruption";
    public static final String COLUMN_NAME_TRAVEL_TIME = "travel_time";
    public static final String COLUMN_NAME_STATUS = "status";

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private WorkTimeContract() {}

    /* Inner class that defines the table contents */
    public static class WorkTimeEntry implements BaseColumns {


    }
}
