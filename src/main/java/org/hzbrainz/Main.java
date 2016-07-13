package org.hzbrainz;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;
import org.jfugue.theory.ChordProgression;

public class Main {

    public static void main(String[] args){
        System.out.println("test");

        System.out.println(Utils.octaveFromHz(440.0));

        Player player = new Player();
        player.play("C4 D4 E4 F4 G4 A4 B4 C5");
        Pattern p1 = new Pattern("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq");
        Pattern p2 = new Pattern("V1 I[Flute] Rw     | Rw     | GmajQQQ  CmajQ");
        player = new Player();
        player.play(p1, p2);
        
        Note note = new Note.Builder(440.0).build();
        System.out.println(note.toString());
        


//		Pattern pattern = new ChordProgression("I IV V").distribute("7%6")
//				.allChordsAs("$0 $0 $0 $0 $1 $1 $0 $0 $2 $1 $0 $0").eachChordAs("$0ia100 $1ia80 $2ia80 $3ia80 $4ia100 $3ia80 $2ia80 $1ia80").getPattern()
//				.setInstrument("Acoustic_Bass").setTempo(100);
//		new Player().play(pattern);

//        Rhythm rhythm = new Rhythm()
//                .addLayer("O..oO...O..oOO..")
//                .addLayer("..S...S...S...S.")
//                .addLayer("````````````````")
//                .addLayer("...............+");
//        new Player().play(rhythm.getPattern().repeat(2));
        Rhythm rhythm1 = new Rhythm()
                .addLayer("O..oO...O..oOO..")
                .addLayer("..S.s.S.s.S...S.")
                .addLayer("````````````````")
                .addLayer("....+..........+");
        new Player().play(rhythm1.getPattern().repeat(4));
        //http://www.jfugue.org/examples.html
        //los comentarios en codigo están mal
    }
}
