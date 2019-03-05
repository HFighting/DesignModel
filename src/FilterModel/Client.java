package FilterModel;
/*
 * 客户端发送请求，同时需要在执行具体方法之前进行拦截，因此需要绑定过滤器
 * 包含发送请求的方法
 * 包含绑定过滤管理器的方法
 */
public class Client {
	private FilterManager filterManager;
	//客户端绑定某个过滤管理器
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	//发送请求
	public void sentRequest(String request) {
		//由过滤管理器来执行请求
		filterManager.execute(request);
	}
	
}
