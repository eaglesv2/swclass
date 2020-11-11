package BBang2; //객체생성 + 초기치

class BBang {
	private String type;
	private int price;
	
	public BBang(String type, int price) { //생성자
		// TODO Auto-generated constructor stub (constructor = 생성자)
		this.type = type;
		this.price = price;
	}
	public BBang() {
		// TODO Auto-generated constructor stub
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void eat() {
		System.out.println("빵을 맛있게 먹자"); //객체가 생성되면 기존에 생성된거에서 빌려가서 씀 / 메모리 영향 x
	}
	public String toString() {
		return type + "\t" + price + "원";
	}
}

public class Bakery_BBang {
	public static void main(String args[]) {
		BBang pizza = new BBang("피자빵",2000); //메소드 호출문과 유사
		BBang soboro = new BBang();
		BBang pat = new BBang("단팥빵",3000);
		//pizza.setType("피자빵");
		soboro.setType("소보루빵");
		//pizza.setPrice(2000);
		soboro.setPrice(1000);
		
		
		System.out.println(pizza.getType() + "\t" + pizza.getPrice() + "원");
		System.out.println(soboro.getType() + "\t" + soboro.getPrice() + "원");
		System.out.println(pat);
		pizza.eat();
		
	}
}
