package PropoTypeModel;


import java.util.HashMap;
import java.util.Map;

/*
 * 缓存类，里面包含充当数据库的集合,数据共享的集合
 */
public class ShapCache {
	
	public static Map<String, Shap> cache;
	static {
		cache = new HashMap<>();
	}
	
	public static Shap getShap(String type) {
		Shap shap = cache.get(type);
		return (Shap)shap.clone();//每次从数据库得到克隆对象
	}

	//模拟每次进行数据库查询后，都需要把数据传入集合中
	public static void loadcache() {
		
		Circle circle = new Circle("圆");
		circle.setId(1);
		cache.put("circle", circle);
		
		Rectangle rectangle = new Rectangle("矩形");
		rectangle.setId(1);
		cache.put("rectangle", rectangle);
	}
	
}
