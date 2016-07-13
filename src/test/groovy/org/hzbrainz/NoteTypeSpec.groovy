package org.hzbrainz

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by frank on 7/13/2016.
 */
class NoteTypeSpec extends Specification {
    @Unroll
    void "it should get an #expectedNote from #note"() {
        when:
            NoteType actualNote = note.noteFromStep(1)
        then:
            actualNote == expectedNote
        where:
            note             | expectedNote
            NoteType.A       | NoteType.A_SHARP
            NoteType.A_SHARP | NoteType.B
            NoteType.B       | NoteType.C
            NoteType.C       | NoteType.C_SHARP
            NoteType.C_SHARP | NoteType.D
            NoteType.D       | NoteType.D_SHARP
            NoteType.D_SHARP | NoteType.E
            NoteType.E       | NoteType.F
            NoteType.F       | NoteType.F_SHARP
            NoteType.F_SHARP | NoteType.G
            NoteType.G       | NoteType.G_SHARP
            NoteType.G_SHARP | NoteType.A

    }

    @Unroll
    void "it should get an #expectedNote from #note --negative steps"() {
        when:
            NoteType actualNote = note.noteFromStep(-1)
        then:
            actualNote == expectedNote
        where:
            note             | expectedNote
            NoteType.A_SHARP | NoteType.A
            NoteType.B       | NoteType.A_SHARP
            NoteType.C       | NoteType.B
            NoteType.C_SHARP | NoteType.C
            NoteType.D       | NoteType.C_SHARP
            NoteType.D_SHARP | NoteType.D
            NoteType.E       | NoteType.D_SHARP
            NoteType.F       | NoteType.E
            NoteType.F_SHARP | NoteType.F
            NoteType.G       | NoteType.F_SHARP
            NoteType.G_SHARP | NoteType.G
            NoteType.A       | NoteType.G_SHARP

    }

}
