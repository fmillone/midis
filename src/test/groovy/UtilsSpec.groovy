import org.hzbrainz.NoteType
import org.hzbrainz.Utils
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by frank on 7/11/2016.
 */
class UtilsSpec extends Specification {

    @Unroll
    void "it should return #expectedType for #note "() {
        given:
        when:
            NoteType actualType = Utils.noteFromHz(note)
        then:
            actualType == expectedType
        where:
            expectedType     | note
            NoteType.A       | 440.0
            NoteType.C       | 16.35
            NoteType.C_SHARP | 17.32
            NoteType.D       | 18.35
            NoteType.D_SHARP | 19.45
            NoteType.E       | 20.60
            NoteType.F       | 21.83
            NoteType.F_SHARP | 23.12
            NoteType.G       | 24.50
            NoteType.G_SHARP | 25.96
            NoteType.A       | 27.50
            NoteType.A_SHARP | 29.14
            NoteType.B       | 30.87
            NoteType.C       | 32.70
            NoteType.C_SHARP | 34.65
            NoteType.D       | 36.71
            NoteType.D_SHARP | 38.89
            NoteType.E       | 41.20
            NoteType.F       | 43.65
            NoteType.F_SHARP | 46.25
            NoteType.G       | 49.00
            NoteType.G_SHARP | 51.91
            NoteType.A       | 55.00
            NoteType.A_SHARP | 58.27
            NoteType.B       | 61.74
            NoteType.C       | 65.41
            NoteType.C_SHARP | 69.30
            NoteType.D       | 73.42
            NoteType.D_SHARP | 77.78
            NoteType.E       | 82.41
            NoteType.F       | 87.31
            NoteType.F_SHARP | 92.50
            NoteType.G       | 98.00
            NoteType.G_SHARP | 103.83
            NoteType.A       | 110.00
            NoteType.A_SHARP | 116.54
            NoteType.B       | 123.47
            NoteType.C       | 130.81
            NoteType.C_SHARP | 138.59
            NoteType.D       | 146.83
            NoteType.D_SHARP | 155.56
            NoteType.E       | 164.81
            NoteType.F       | 174.61
            NoteType.F_SHARP | 185.00
            NoteType.G       | 196.00
            NoteType.G_SHARP | 207.65
            NoteType.A       | 220.00
            NoteType.A_SHARP | 233.08
            NoteType.B       | 246.94
            NoteType.C       | 261.63
            NoteType.C_SHARP | 277.18
            NoteType.D       | 293.66
            NoteType.D_SHARP | 311.13
            NoteType.E       | 329.63
            NoteType.F       | 349.23
            NoteType.F_SHARP | 369.99
            NoteType.G       | 392.00
            NoteType.G_SHARP | 415.30
            NoteType.A       | 440.00
            NoteType.A_SHARP | 466.16
            NoteType.B       | 493.88
            NoteType.C       | 523.25
            NoteType.C_SHARP | 554.37
            NoteType.D       | 587.33
            NoteType.D_SHARP | 622.25
            NoteType.E       | 659.25
            NoteType.F       | 698.46
            NoteType.F_SHARP | 739.99
            NoteType.G       | 783.99
            NoteType.G_SHARP | 830.61
            NoteType.A       | 880.00
            NoteType.A_SHARP | 932.33
            NoteType.B       | 987.77
            NoteType.C       | 1046.50
            NoteType.C_SHARP | 1108.73
            NoteType.D       | 1174.66
            NoteType.D_SHARP | 1244.51
            NoteType.E       | 1318.51
            NoteType.F       | 1396.91
            NoteType.F_SHARP | 1479.98
            NoteType.G       | 1567.98
            NoteType.G_SHARP | 1661.22
            NoteType.A       | 1760.00
            NoteType.A_SHARP | 1864.66
            NoteType.B       | 1975.53
            NoteType.C       | 2093.00
            NoteType.C_SHARP | 2217.46
            NoteType.D       | 2349.32
            NoteType.D_SHARP | 2489.02
            NoteType.E       | 2637.02
            NoteType.F       | 2793.83
            NoteType.F_SHARP | 2959.96
            NoteType.G       | 3135.96
            NoteType.G_SHARP | 3322.44
            NoteType.A       | 3520.00
            NoteType.A_SHARP | 3729.31
            NoteType.B       | 3951.07
            NoteType.C       | 4186.01
            NoteType.C_SHARP | 4434.92
            NoteType.D       | 4698.63
            NoteType.D_SHARP | 4978.03
            NoteType.E       | 5274.04
            NoteType.F       | 5587.65
            NoteType.F_SHARP | 5919.91
            NoteType.G       | 6271.93
            NoteType.G_SHARP | 6644.88
            NoteType.A       | 7040.00
            NoteType.A_SHARP | 7458.62
            NoteType.B       | 7902.13


    }
}
