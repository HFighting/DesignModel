package ServiceLocatorModel;
/*
 * 服务定位器：主要用于定位具体的服务类，因此包含缓存类，初始类
 * 			   所有服务类共享服务定位器的缓存类集合
 */
public class ServiceLocator {
	private static ServiceCache cache;
	static {
		//所有服务定位器都共享这个集合
		cache = new ServiceCache();
	}
	//定位具体的服务类
	public Service getService(String request) {
		Service service = cache.getName(request);//从缓存集合中得到对应的服务
		if (service!=null) {//如果不是空，则说明找到了
			return service;
		}
		//如果返回的是空，则说明集合中没有相应的类
		InitialService initialService = new InitialService();
		Service service2 = (Service) initialService.lookup(request);
		if (service2!=null) {
			cache.addService(service2);
			System.out.println("create the new service:"+service2.getServerName());
			return service2;
		}else {
			System.out.println("没有相关的服务");
		}
		return null;
	}
	
}
