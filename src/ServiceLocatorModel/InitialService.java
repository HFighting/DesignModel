package ServiceLocatorModel;
/*
 * 初始化服务：用于第一次请求服务时查找到对应的服务
 */
public class InitialService {
	//查找服务
	public Object lookup(String request) {
		if (request.equalsIgnoreCase("service1")) {
			return new Service1(); 
		}else if (request.equalsIgnoreCase("service2")) {
			return new Service2();
		}
		return null;
	}
	
}
