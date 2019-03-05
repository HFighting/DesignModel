package FrontControllerModel;
/*
 * 前端控制器模式：例如web中的前端控制器根据不同的请求，使用调度器处理进行对应的处理
 * 				  前端控制器还能验证身份信息，记录日志，跟踪请求等
 * 其包含一个调度器类，而调度器能对不同的请求进行处理，说明调度器类包含不同的请求类，所以能做到一一对应
 * 
 */
public class ControllerObject {
	
	private Dispatcher dispatcher;
	
	public ControllerObject() {
		dispatcher = new Dispatcher();
	}
	//控制器有处理请求的方法
	public void dealRequest(String request) {
		exp();
		mem(request);
		dispatcher.deal(request);
	}
	//控制器验证身份的方法
	public boolean exp() {
		System.out.println("身份验证正确");
		return true;
	}
	//控制器记录请求
	public void mem(String request) {
		System.out.println("the request is from:"+request);
	}
}
