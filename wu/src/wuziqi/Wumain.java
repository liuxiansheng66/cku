package wuziqi;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Wumain extends JFrame{
	pan p = null;
	JMenuBar menuber = new JMenuBar();
	JMenu jm1 = new JMenu("ѡ��");
	JMenu jm2 = new JMenu("����");
	JMenu jm3 = new JMenu("����");
	JMenuItem jm1_1 = new JMenuItem("���¿�ʼ");
	JMenuItem jm1_2 = new JMenuItem(" ���а�");
	JMenuItem jm1_3 = new JMenuItem("�˳���Ϸ");
	JMenuItem jm2_1 = new JMenuItem("��������");
	JMenuItem jm2_2 = new JMenuItem("��������");
	JMenuItem jm3_1 = new JMenuItem("��������");
	public Wumain()
	{
		   p =new pan();
		   this.setSize(585,600);
		   this.setLocation(200,100);
		   this.add(p);
		   this.setResizable(false);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   jm1.add(jm1_1);
		   jm1.add(jm1_2);
		   jm1.add(jm1_3);
		   jm2.add(jm2_1);
		   jm2.add(jm2_2);
		   jm3.add(jm3_1);
		   menuber.add(jm1);
		   menuber.add(jm2);
		   menuber.add(jm3); 
		   this.setJMenuBar(menuber);
		   this.addMouseListener(p);
		   jm1_3.addActionListener(new ActionListener() {
//			�����鹹��
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		   jm1_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<p.row;i++){
					for(int j=0;j<p.col;j++){
						p.num[i][j] = 0;
					}
				}
				p.canSetqizi = true;
				p.qizi_num = 0;
				repaint();
			}
		});
		   jm2_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int n = r.nextInt(8);
				String qipan_name = "qipan"+n+".jpg";
				p.qipan_name = qipan_name;
				repaint();
			}
		});
		   jm2_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int n = r.nextInt(8);
				String qizi1_name = "c"+n+".png";
				String qizi2_name = "c"+(n+1)+".png";
				p.qizi1_name = qizi1_name;
				p.qizi2_name = qizi2_name;	
				repaint();
			}
		});
		   jm3_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg ="��������\n" +
						"1�����������;\n" +
						"2���γ�5��ͬɫ���Ӽ�ΪӮ;\n\n\n" +
						"     �����ˣ�������";
				JOptionPane.showMessageDialog(null, msg);
				
			}
		});
		   jm1_2.addActionListener(new ActionListener() {
		
			   public void actionPerformed(ActionEvent e) {
			String msg ="���а�\n" +
					"����      ����      ���\n";
			for(int i=0;i<p.paihanglist.size();i++)
			{
				paihangbang ph = p.paihanglist.get(i);
			      msg = msg+"   "+ph.getJushu()
			    		  +"          "+ph.getBushu()
			    		  +"          "+ph.getJieguo()+"\n";
			}
				JOptionPane.showMessageDialog(null, msg);
			   }
		});
		   this.setVisible(true);
	}
	public static void main(String[] args){
		Wumain w = new Wumain();
	}
}
