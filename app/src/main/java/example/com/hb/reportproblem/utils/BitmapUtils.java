package example.com.hb.reportproblem.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;

import java.io.ByteArrayOutputStream;

/**
 * Created by hung on 1/14/2018.
 */

public class BitmapUtils {
    public static String BitMapToString(Bitmap bitmap) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
        byte[] b = baos.toByteArray();
        String temp = Base64.encodeToString(b, Base64.DEFAULT);
        return temp;
    }

    /**
     * @param encodedString
     * @return bitmap (from given string)
     */
    public static Bitmap StringToBitMap(String encodedString) {
        try {
            byte[] encodeByte = Base64.decode(encodedString, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
            return bitmap;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, float degrees){
        Matrix matrix = new Matrix();

        matrix.postRotate(degrees);

        Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmap,
                bitmap.getWidth(),bitmap.getHeight(),true);

        Bitmap rotatedBitmap = Bitmap.createBitmap(scaledBitmap ,
                0, 0, scaledBitmap .getWidth(), scaledBitmap .getHeight(),
                matrix, true);
        return rotatedBitmap;
    }
}
