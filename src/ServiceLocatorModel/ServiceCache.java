package ServiceLocatorModel;
/*
 * 服务缓存，包含了所有查询过的服务集合
 * 先是在缓存中查找，没找到则初始化服务
 * 
 * 缓存类只是做缓存的事，定位具体服务的事由其他类来做
 * 
 * 功能：添加缓存、得到对应名字的服务
 */

import java.util.ArrayList;
import java.util.List;

public class ServiceCache {
	
	private List<Service> services;
	/**
	 * @param services
	 */
	public ServiceCache() {
		this.services = new ArrayList<>();
	}
	
	//添加缓存服务
	public void addService(Service rservice) {
		boolean flag = true;
		//先在缓存集合中查找有没有重复的,如果有，则不添加
		for (Service service : this.services) {
			if (rservice.getServerName().equalsIgnoreCase(service.getServerName())) {
				flag = false;
			}
		}
		if (flag) {
			services.add(rservice);
		}
	}
	//得到对应名称的服务
	public Service getName(String request) {
		for (Service service : this.services) {
			if (service.getServerName().equalsIgnoreCase(request)) {
				System.out.println("get the service from cache:"+service.getServerName());
				return service;
			}
		}
		return null;
	}
	
}
