package TemplateModel;

public class LolGame extends GameModel {

	@Override
	void initial() {
		// TODO Auto-generated method stub
		System.out.println("LOL打开游戏，检查文件，初始化游戏环境!");
	}

	@Override
	void playgame() {
		// TODO Auto-generated method stub
		System.out.println("LOL输入账号，开始游戏!");
	}

	@Override
	void endgame() {
		// TODO Auto-generated method stub
		System.out.println("LOL没人一起玩了，一直输，结束游戏!");
	}

}
