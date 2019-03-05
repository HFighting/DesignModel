package FilterModel;

public class StrutsFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("拦截struts请求");
	}

}
