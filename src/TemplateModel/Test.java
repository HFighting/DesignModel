package TemplateModel;

public class Test {

	public static void main(String[] args) {
		GameModel dnf = new DnfGame();
		dnf.play();
		System.out.println("\n");
		GameModel lol = new LolGame();
		lol.play();

	}

}
