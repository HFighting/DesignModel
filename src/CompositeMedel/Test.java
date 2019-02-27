package CompositeMedel;

public class Test {
	public static void main(String[] args) {
		Emploee CEO = new Emploee("李强", "CEO", 20000);
		Emploee HeadSale = new Emploee("张勇", "销售部老大", 10000);
		Emploee HeadMarket = new Emploee("赵四", "市场部老大", 10000);
		Emploee sale1 = new Emploee("张三", "销售", 5000);
		Emploee sale2 = new Emploee("王五", "CEO", 5000);
		Emploee sale3 = new Emploee("李其", "CEO", 5000);
		Emploee sale4 = new Emploee("萧条", "CEO", 5000);
		
		CEO.add(HeadSale);
		CEO.add(HeadMarket);
		HeadSale.add(sale1);
		HeadSale.add(sale2);
		HeadMarket.add(sale3);
		HeadMarket.add(sale4);
		
		System.out.println(CEO);
		for (Emploee subemploee : CEO.getEmploee()) {
			System.out.println(subemploee);
			for (Emploee sub : subemploee.getEmploee()) {
				System.out.println(sub);
			}
		}
	}
}
