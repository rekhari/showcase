package rekhari;

import java.util.Collections;

/**
 * Created by ppcv on 10/27/2016.
 */
public class TimeToDegree {
    public static void main(String[] args) {
        getDegrees("6", "30");
        getDegrees("1", "30");
        getDegrees("12", "30");
        getDegrees("12", "55");
    }

    protected static void getDegrees(String hrStr, String minStr) {

        int hr = Integer.parseInt(hrStr);
        int min = Integer.parseInt(minStr);
        if (hr >= 12) {
            hr = 12 - hr;
        }
        double deg = (hr + min / 60.0) * 30 - 360 * min / 60.0;
        if (deg < 0) {
            deg = -1 * deg;
        }

        System.out.println("Time: " + hrStr + ":" + minStr + "Degrees:" + deg);
    }
}
