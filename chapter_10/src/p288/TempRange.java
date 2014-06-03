package p288;

public class TempRange {

	public int getLow() {
		return 0;
	}

	public int getHigh() {
		return 0;
	}

	public boolean include(TempRange arg) {
		return (arg.getLow() >= this.getLow())
				&& arg.getHigh() <= this.getHigh();
	}

}
