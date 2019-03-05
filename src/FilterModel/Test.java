package FilterModel;

public class Test {

	public static void main(String[] args) {
		//先定义多个过滤器
		StrutsFilter strutsFilter = new StrutsFilter();
		HttpFilter httpFilter = new HttpFilter();
		//定义过滤管理器，同时绑定目标对象
		FilterManager filterManager = new FilterManager(new TargetObject());
		//添加过滤器
		filterManager.add(httpFilter);
		filterManager.add(strutsFilter);
		
		//定义客户端
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sentRequest("访问网站数据库");

	}

}
