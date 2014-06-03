package p288;

public class Room {

	boolean withinPlan(HeatingPlan plan) {
		return plan.withinPange(daysTempRange());
	}

	private TempRange daysTempRange() {
		return null;
	}

}
