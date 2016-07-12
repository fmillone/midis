package org.hzbrainz;

/**
 * Created by frank on 7/11/2016.
 */
public enum Note {
    A,
    A_SHARP,
    B,
    C,
    C_SHARP,
    D,
    D_SHARP,
    E,
    F,
    F_SHARP,
    G,
    G_SHARP;

    private static Note[] vals = values();

    public Note noteFromStep(int step){
        return vals[(this.ordinal()+step) % vals.length];
    }
}
