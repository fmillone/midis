package org.hzbrainz;

/**
 * Created by frank on 7/11/2016.
 */
public class Utils {

    private static final double A_FREQUENCY = 440.0;
    private static final double C4_FREQUENCY = 261.6255653005986346778499935233047013;
    private static final double CONSTANT = 1.05946309436;
    private static final int TWO_POWER_FOUR = 16;


    public static NoteType noteFromHz(double hz){
        int step = (int)(Math.log(hz/ C4_FREQUENCY)/Math.log(CONSTANT));
        return NoteType.C.noteFromStep(step);
    }


    public static int octaveFromHz(double hz){
        return (int) (Math.log(hz/getPrimalFreq())/Math.log(2));
    }


    private static double getPrimalFreq() {
        return C4_FREQUENCY/ TWO_POWER_FOUR;
    }
}
