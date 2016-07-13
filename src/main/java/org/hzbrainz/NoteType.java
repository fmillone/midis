package org.hzbrainz;

/**
 * Created by frank on 7/11/2016.
 */
public enum NoteType {
    
    C,
    C_SHARP,
    D,
    D_SHARP,
    E,
    F,
    F_SHARP,
    G,
    G_SHARP,
    A,
    A_SHARP,
    B;

    private static NoteType[] vals = NoteType.values();

    public NoteType noteFromStep(int step){
        int index = (this.ordinal()+step) % vals.length;
        return  vals[ index>=0? index : vals.length+index];
    }
}
