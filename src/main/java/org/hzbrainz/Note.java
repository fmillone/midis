package org.hzbrainz;

public class Note {
	private NoteType type;
	private Integer octave;

	private Note(NoteType type, int octave) {
		this.type = type;
		this.octave = octave;
	}
	
	@Override
	public String toString(){
		return type.toString()+octave.toString();
	}
	

	public static class Builder {
		double hz;

		public Builder(double hz) {
			this.hz = hz;
		}

		public Note build() {
			NoteType noteType = Utils.noteFromHz(this.hz);
			int octave = Utils.octaveFromHz(this.hz);
			return new Note(noteType, octave);
		}
	}
}
