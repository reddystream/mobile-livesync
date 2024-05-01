package com.app.livesync.data.factory;

import android.content.Context;
import com.app.livesync.data.DBHelper;

public class DBHelperFactory {

    private static DBHelper dbHelperInstance;

    // Método para obter uma instância do DBHelper
    public static DBHelper getDBHelper(Context context) {
        if (dbHelperInstance == null) {
            dbHelperInstance = new DBHelper(context);
        }
        return dbHelperInstance;
    }
}
