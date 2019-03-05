package FilterModel;
/*
 * 过滤器链：包含一系列过滤器，在处理请求之前需要执行的过滤器
 * 
 * list过滤器对象集
 * 添加过滤器方法
 * 按顺序执行过滤器方法，执行完后执行目标方法
 */

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
	private TargetObject target;
	
	//最后执行请求的目标对象，可以设置为哪个对象
	public void setTarget(TargetObject targetObject) {
		this.target = targetObject;
	}

	public void addFilter(Filter filter) {
		filters.add(filter);
	}
	//过滤器链执行请求后再执行目标方法
	public void executes(String request) {
		//按顺序执行过滤器链中的过滤器
		for (Filter filter : filters) {
			filter.execute(request);
		}
		//执行完后执行目标对象的方法
		target.execute(request);
	}
	
}
