
public class SmartPhone extends Mp3Player{
	public void call(){
		System.out.println("電話");
	}
	//extends＝継承　　元からあるMp3PlayerをSmartphoneに継承するという意味
	public void mail(){
		System.out.println("メール");
	}

	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}
}
