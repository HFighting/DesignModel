package AppearenceModel;
//外观模式，对客户端隐藏复杂的系统，对外只保留接口，在接口种初始化系统所有的功能
public class Appearence {
	private CPU cpu;
	private Memory memory;
	public Appearence() {
		this.cpu = new CPU();
		this.memory = new Memory();
	}
	public void begin() {
		System.out.println("电脑开机");
	}
	public void shutdown() {
		System.out.println("电脑关机");
	}
}
