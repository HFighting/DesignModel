package ServiceLocatorModel;

/*
 * 服务定位模式：
 * 想使用 JNDI 查询定位各种服务的时候。考虑到为某个服务查找 JNDI 的代价很高，
 * 服务定位器模式充分利用了缓存技术。在首次请求某个服务时，服务定位器在 JNDI 中查找服务，
 * 并缓存该服务对象。当再次请求相同的服务时，服务定位器会在它的缓存中查找，这样可以
 * 在很大程度上提高应用程序的性能。
 */
//服务接口，有多种服务
public interface Service {
	public void execute();
	public String getServerName();
}
