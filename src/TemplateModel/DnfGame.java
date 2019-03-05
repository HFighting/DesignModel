package TemplateModel;

public class DnfGame extends GameModel {

	@Override
	void initial() {
		System.out.println("dnf启动，检查文件！");
		
	}

	@Override
	void playgame() {
		System.out.println("dnf输入账号，开始游戏！");
		
	}

	@Override
	void endgame() {
		System.out.println("dnf疲劳刷完，活动刷完，结束游戏！");
		
	}

}
