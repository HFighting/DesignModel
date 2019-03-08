package PropoTypeModel;

public class Test {


	public static void main(String[] args) {
		ShapCache.loadcache();
		
		Shap circle = ShapCache.getShap("circle");
		System.out.println(circle.getId()+":"+circle.getType());
		
	}

}
