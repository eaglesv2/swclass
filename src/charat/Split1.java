package charat;

class Cafe1 {
	//private String pummok;
	private String type;
	private String size;
	private int price;
	private String branch;
	
	/*public Cafe1(String type, String size, int price, String branch) { //생성자
		this.type = type;
		this.size = size;
		this.price = price;
		this.branch = branch;
	}
	public Cafe1() { // default 생성자
		
	}*/
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String toString() {
		return type+ "의 사이즈가 " + size + "인 경우 가격은 " + price + "원이며 "
				+ branch + " 지점에서 판매합니다";
	}
	
}

public class Split1 {
/*	
	main()에
	String pummok = "coffee:big:1500:jongro";이 있을 때
	
	cafel 클래스를 사용하여 getter/setter 및 toString() 등을 작성한 후
	toString() 출력시 다음과 같이 출력되도록 프로그램을 작성하시오
	(단, 커피명:사이즈:가격:지점 을 의미하며
			cage1클래스의 필드는 앞의 4개를 만들어 사용한다)
	
	(출력 예)
	coffee의 사이즈가 big인 경우 가격은 1500원이며 
	jongro 지점에서 판매합니다
	
*/
	public static void main(String args[]) {
		//String pummok = "coffee:big:1500:jongro";
		//String pummok = "coffee.big.1500.jongro";
		String pummok = "coffee**big**1500**jongro";
		String[] pum = pummok.split(":");  //문자열이 "."으로 구분되어 있을 경우 "\\."
		                                        //"**"으로 구분되어 있을 경우 : "\\*\\*"
		
		//Cafe1 coffee = new Cafe1(pum[0],pum[1],Integer.valueOf(pum[2]),pum[3]);	
		Cafe1 coffee = new Cafe1();
		
		coffee.setType(pum[0]);
		coffee.setSize(pum[1]);
		coffee.setPrice(Integer.valueOf(pum[2]));
		coffee.setBranch(pum[3]);
		
		System.out.println(coffee);
		
	}
}
