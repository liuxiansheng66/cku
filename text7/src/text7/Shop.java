package text7;
/* **（谁）在**（哪个）超市，买到**（商品）
 * **（谁）在**（哪个）超市，白跑了一趟
* 商品Product：商品名字proName
* 超市：超市的名字，超市仓库（商品的集合，数组）
* 购买者：人名，行为：买东西（超市名称,商品名称）
* 测试类：赋值一些商品，超市名，人名
*    判断：指定商品，在不在赋值的这些里面出现
    */
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建了商品对象，给商品赋名字
		Prodeuct p1=new Prodeuct();
		Prodeuct p2=new Prodeuct();
		Prodeuct p3=new Prodeuct();
		Prodeuct p4=new Prodeuct();
		Prodeuct p5=new Prodeuct();
		p1.setProName("电视机");
		p2.setProName("电冰箱");
		p3.setProName("空调");
		p4.setProName("吹风机");
		p5.setProName("洗衣机");
		//创建超市对象，给超市赋名字，给仓库赋值
		Market m1=new Market();
		m1.setMarkName("天猫");
		m1.setProductArr(new Prodeuct[] {p1,p2,p3,p4,p5});
		
		//创建人对象，赋值人名
		Person1 r1=new Person1();
		r1.setRname("雯雯");
		
		Prodeuct result=r1.shopping(m1, "西瓜");
		if(result!=null) {
			System.out.println(r1.getRname()+"在"+m1.getMarkName()+"买到了"+result.getProName());
		}
		else {
			System.out.println(r1.getRname()+"在"+m1.getMarkName()+"白跑了一趟");
		}
	}

}
