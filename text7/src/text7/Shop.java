package text7;
/* **��˭����**���ĸ������У���**����Ʒ��
 * **��˭����**���ĸ������У�������һ��
* ��ƷProduct����Ʒ����proName
* ���У����е����֣����вֿ⣨��Ʒ�ļ��ϣ����飩
* �����ߣ���������Ϊ����������������,��Ʒ���ƣ�
* �����ࣺ��ֵһЩ��Ʒ��������������
*    �жϣ�ָ����Ʒ���ڲ��ڸ�ֵ����Щ�������
    */
public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������Ʒ���󣬸���Ʒ������
		Prodeuct p1=new Prodeuct();
		Prodeuct p2=new Prodeuct();
		Prodeuct p3=new Prodeuct();
		Prodeuct p4=new Prodeuct();
		Prodeuct p5=new Prodeuct();
		p1.setProName("���ӻ�");
		p2.setProName("�����");
		p3.setProName("�յ�");
		p4.setProName("�����");
		p5.setProName("ϴ�»�");
		//�������ж��󣬸����и����֣����ֿ⸳ֵ
		Market m1=new Market();
		m1.setMarkName("��è");
		m1.setProductArr(new Prodeuct[] {p1,p2,p3,p4,p5});
		
		//�����˶��󣬸�ֵ����
		Person1 r1=new Person1();
		r1.setRname("����");
		
		Prodeuct result=r1.shopping(m1, "����");
		if(result!=null) {
			System.out.println(r1.getRname()+"��"+m1.getMarkName()+"����"+result.getProName());
		}
		else {
			System.out.println(r1.getRname()+"��"+m1.getMarkName()+"������һ��");
		}
	}

}
