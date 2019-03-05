package TemplateModel;

/*
 * 模板模式：一个抽象类中公开定义了执行它的方法的模板，一系列的子操作需要留给子类去实现，
 *  	       模板中只定义主干流程
 */
public abstract class GameModel {
	abstract void initial();
	abstract void playgame();
	abstract void endgame();
	/*
	 * 抽象类中的静态方法
	 * 	 	可以重载（方法名一样，参数不一样）
	 * 		不能重写（子类重写）
	 * 		不能覆盖（子类覆盖）
	 */
	public final void play() {
		initial();
		playgame();
		endgame();
	}
}
