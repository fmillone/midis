import org.hzbrainz.Note
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by frank on 7/11/2016.
 */
class UtilsSpec extends Specification {
    @Unroll
    void "it should get an #expectedNote from #note"() {
        when:
            Note actualNote = note.noteFromStep(1)
        then:
            actualNote == expectedNote
        where:
            note         | expectedNote
            Note.A       | Note.A_SHARP
            Note.A_SHARP | Note.B
            Note.B       | Note.C
            Note.C       | Note.C_SHARP
            Note.C_SHARP | Note.D
            Note.D       | Note.D_SHARP
            Note.D_SHARP | Note.E
            Note.E       | Note.F
            Note.F       | Note.F_SHARP
            Note.F_SHARP | Note.G
            Note.G       | Note.G_SHARP
            Note.G_SHARP | Note.A

    }
}
