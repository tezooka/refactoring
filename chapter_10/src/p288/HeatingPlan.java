package p288;

public class HeatingPlan {

	private TempRange _range;

	boolean withinPange(TempRange roomRange) {
		return _range.include(roomRange);
	}

}
