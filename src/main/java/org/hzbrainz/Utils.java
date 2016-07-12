package org.hzbrainz;

/**
 * Created by frank on 7/11/2016.
 */
public class Utils {

    private static final double A_FREQUENCY = 440.0;
    private static final double CONSTANT = 1.05946309436;

    public static Note noteFromHz(double hz){
        int step = (int)(Math.log(hz/ A_FREQUENCY)/Math.log(CONSTANT));
        return Note.A.noteFromStep(step);
    }

}
