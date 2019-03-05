package FilterModel;

/*
 * 过滤器模式：在处理请求之前对请求进行相应的处理，然后才处理请求
 * 
 * 有多种过滤器，因此定义一个过滤器接口
 */
public interface Filter {
	public void execute(String request);
}
