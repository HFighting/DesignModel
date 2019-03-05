package FilterModel;
/*
 * 过滤器管理器：用来管理过滤器链和目标对象方法（设置在哪个目标对象之前执行过滤器）
 * 因此，里面包含一个过滤器链,同时可以设置对哪个对象进行拦截
 * 设置拦截对象后，可以添加过滤器（在拦截之前执行的过滤器）
 * 最后管理器执行过滤
 */
public class FilterManager {
	private FilterChain chain;
	
	public FilterManager(TargetObject targetObject) {
		chain = new FilterChain();
		//需要对哪个目标对象设置过滤器
		chain.setTarget(targetObject);
	}
	//在过滤器链中添加过滤器
	public void add(Filter filter) {
		chain.addFilter(filter);
	}
	
	//过滤管理器执行请求是由过滤器链执行请求
	public void execute(String request) {
		chain.executes(request);
	}
}
