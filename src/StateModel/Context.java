package StateModel;

public class Context {
	private State state;

	public Context() {
		super();
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
