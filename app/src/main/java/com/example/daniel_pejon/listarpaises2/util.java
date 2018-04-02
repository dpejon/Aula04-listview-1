package com.example.daniel_pejon.listarpaises2;
import android.graphics.drawable.Drawable;
import android.content.Context;

import com.example.daniel_pejon.listarpaises2.R;

import java.lang.reflect.Field;


/**
 * Created by daniel_pejon on 28/03/2018.
 * RA 816114026
 */
public class util {
    public static Drawable getDrawable(Context context, String nome){

        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(nome);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
