package ni.edu.uca.acceso_a_datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Administrador on 14/11/2016.
 */

public class PeopleHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="people.db";
    private static final int DATABASE_Version=1;
    private static final String TEXT_TYPE="TEXT";
    private static final String INTERGER_TYPE="INTERGER";


    private static final String SQL_CREATE_PERSONA="" +
            "CREATE TABLE" + contrato.TABLA + "(" + contrato._ID +" "+ INTERGER_TYPE +"PRIMARY KEY ," + contrato.NOMBRE +" "+ TEXT_TYPE+","
                    +contrato.EDAD + " " + INTERGER_TYPE+")";

    public PeopleHelper(Context context){
        super(context,DATABASE_NAME,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PERSONA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private class contrato implements BaseColumns{
        static final String NOMBRE="nombre";
        static final String EDAD="edad";
        static final String TABLA="persona";


}
}
