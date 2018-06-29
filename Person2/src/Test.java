
public class Test {

	public static void main(String[] args) {

		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=16;
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person rino=new Person();
		rino.name="深澤梨乃";
		rino.age=26;
		System.out.println(rino.name);
		System.out.println(rino.age);



		taro.talk();
		taro.walk();
		taro.run();


		Robot aibo=new Robot();
		aibo.name="アイボ";
		System.out.println(aibo.name);

		Robot asimo=new Robot();
		asimo.name="アシモ";
		System.out.println(asimo.name);


		Robot pepper=new Robot();
		pepper.name="ペッパー";
		System.out.println(pepper.name);

		Robot doraemon=new Robot();
		doraemon.name="ドラエモン";
		System.out.println(doraemon.name);

	}
}
