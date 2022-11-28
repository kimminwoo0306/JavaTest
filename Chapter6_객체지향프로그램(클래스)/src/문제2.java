// -food
class Food {
	String[] poster = new String[5];
	String title;
	double score;
	String addr1;
	String addr2;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String[] menu = new String[5];
}

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food = new Food();
		food.title = "조점례남문피순대";
		food.score = 4.3;
		food.addr1 = "전라북도 전주시 완산구 풍남문2길 39 남부시장";
		food.addr2 = "전라북도 전주시 완산구 전동3가 2-246 남부시장";
		food.tel = "063-232-5006";
		food.type = "탕/찌개/전골";
		food.price = "만원 미만";
		food.parking = "무료 주차 가능";
		food.time = "06:00 - 24:00";
	}

}
