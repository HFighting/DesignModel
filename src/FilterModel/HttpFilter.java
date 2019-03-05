package FilterModel;

public class HttpFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("拦截Http请求");

	}

}
