package elements;

public class Intervalle {

	private int min;
	private int max;
	
	
	public Intervalle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**@param int min 
	 * @param int max 
	 * */
	public Intervalle(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}

	/**
	 * @return min
	 * */
	public int getMin() {
		return min;
	}

	/**
	 * @param min
	 * */
	public void setMin(int min) {
		this.min = min;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}
	
	
}
