package collection;

class SMarket {
	private String sangpum;
	private int price;
	public SMarket(String sangpum, int price) {
		// TODO Auto-generated constructor stub
		this.sangpum = sangpum;
		this.price = price;
	}
	public SMarket() { //defualt 생성자
		
	}
	public String getSangpum() {
		return sangpum;
	}
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "상품이름은 " + sangpum + "이고 상품가격은 " + price + "원 입니다.";
	}
}


public class Collection3 {
	public static void main(String args[]) {
		
		/*(Q3)
		
		sangpum, price 필드가 있는 SMarket 클래스를 추가로 만드시오
		단, 생성자 2개, toString()도 만드시오
		
		(toString()으로 출력시 결과)
		상품이름은 우유이고 상품가격은 1000원 입니다.
		상품이름은 빵이고 상품가격은 2000원입니다.		
		 */
		
		SMarket milk = new SMarket("우유",1000);
		SMarket bread = new SMarket("빵",2000);
		
		System.out.println(milk);
		System.out.println(bread);
	}

}
