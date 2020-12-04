package singletonpattern;

public class AppConfig {
	private AppConfig(){
		System.out.println("Hello World!!!");
		
	}
	private static AppConfig ac=null;
	public static AppConfig getInstance() {
		if(ac==null) {
			ac=new AppConfig();
		}
		return ac;
	}

}
