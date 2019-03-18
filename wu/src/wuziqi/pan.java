package wuziqi;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pan extends JPanel implements MouseListener{
	int i=0,j=0;
	int row = 15;
//	�����±�
	int col = 15;
//	�����ϱ�
	String qipan_name = "qipan1.jpg";
	String qizi1_name = "c1.png";
	String qizi2_name = "c2.png";
	int num[][] = new int[row][col];
//	0����ʾ��λ��Ϊ�գ�1����ʾ�����ӣ�2����ʾ������
	boolean canSetqizi = true;
//	����booleanֵ�������жϸ�λ���Ƿ�����
	int qizi_num = 0;
//	�����¼������
	List<paihangbang> paihanglist = new ArrayList();
//	���弯�ϣ������洢���а�
	public void paint(Graphics g){
		super.paint(g);
		Image img= new ImageIcon("img/"+qipan_name).getImage();
//		��������ͼƬ
		g.drawImage(img, 0, 0, 567, 567, this);
//		��������
		Image c1= new ImageIcon("img/"+qizi1_name).getImage();
		Image c2= new ImageIcon("img/"+qizi2_name).getImage();
		for(int i = 0;i<num.length;i++){
			for(int j = 0;j<num[i].length;j++){
				if(num[i][j] == 1)
				{
					g.drawImage(c1, i*35+20, j*35+20, 35, 35, this);
				}
				else if(num[i][j] == 2)
				{
					g.drawImage(c2, i*35+20, j*35+20, 35, 35, this);
				}
			}
//			�ػ�����
		}
//		�����������棨��ֹ��С����ԭ���ݶ�ʧ��
	}
	public int[] getLoc(int x,int y) {
		int count = 1;
//		��������������ڼ���������
		int[] wz1 = null;
		int[] wz2 = null;
//		�������飬�����洢Σ��λ��
		for(int i =x-1;i>=0;i--){
			if(num[i][y] == num[x][y])
			{
				count++;
			}
			else
			{
				if(num[i][y] == 0){
					wz1 = new int[]{i,y};
//					��ȡ��ߵ�Σ��λ������
				}
				break;
			}
		}
//		��
		for(int i =x+1;i<row;i++){
			if(num[i][y] == num[x][y])
			{
				count++;
			}else{
				if(num[i][y] == 0){
					wz2 = new int[]{i,y};
//					��ȡ�б�λ��Σ������
				}
				break;
			}
		}
//		��
		if(count>=3)
		{
			if(wz1 != null){
				return wz1;
//				�жϷ������Σ��λ��
			}else if(wz2 != null){
				return wz2;
//				�жϷ����ұ�Σ��λ��
			}else{
				return null;
			}
		}
//		����
		count = 1;
		wz1 = null;
		wz2 = null;
//		��ʼ�����в���
		for(int j =y-1;j>=0;j--){
			if(num[x][j] == num[x][y])
			{
				count++;
			}
			else
			{
				if(num[x][j] == 0){
					wz1 = new int[]{x,j};
				}
				break;
			}
		}
//		��
		for(int j =y+1;j<col;j++){
			if(num[x][j] == num[x][y])
			{
				count++;
			}else{
				if(num[x][j] == 0){
					wz2 = new int[]{x,j};
				}
				break;
			}
		}
//		��
		if(count>=3)
		{
			if(wz1 != null){
				return wz1;
			}else if(wz2 != null){
				return wz2;
			}else{
				return null;
			}
		}
//		����
		count = 1;
		wz1 = null;
		wz2 = null;
		for(int i =x-1,j =y-1;i>=0&&j>=0;i--,j--){
			if(num[i][j] == num[x][y])
			{
				count++;
			}
			else
			{
				if(num[i][j] == 0){
					wz1 = new int[]{i,j};
				}
				break;
			}
		}
//		����
		for(int i =x+1,j =y+1;i<row&&j<col;i++,j++){
			if(num[i][j] == num[x][y])
			{
				count++;
			}else{
				if(num[i][j] == 0){
					wz2 = new int[]{i,j};
				}
				break;
			}
		}
//		����
		if(count>=3)
		{
			if(wz1 != null){
				return wz1;
			}else if(wz2 != null){
				return wz2;
			}else{
				return null;
			}
		}
//		��������
		count = 1;
		wz1 = null;
		wz2 = null;
		for(int i =x-1,j =y+1;i>=0&&j<col;i--,j++){
			if(num[i][j] == num[x][y])
			{
				count++;
			}
			else
			{
				if(num[i][j] == 0){
					wz1 = new int[]{i,j};
				}
				break;
			}
		}
//		����
		for(int i =x+1,j =y-1;i<row&&j>=0;i++,j--){
			if(num[i][j] == num[x][y])
			{
				count++;
			}else{
				if(num[i][j] == 0){
					wz2 = new int[]{i,j};
				}
				break;
			}
		}
//		����
		if(count>=3)
		{
			if(wz1 != null){
				return wz1;
			}else if(wz2 != null){
				return wz2;
			}else{
				return null;
			}
		}
//		��������
		return null;
	}
	public boolean iswin(int x,int y){
		int count = 1;
		for(int i =x-1;i>=0;i--){
			if(num[i][y] == num[x][y])
			{
				count++;
			}
			else
			{
				break;
			}
		}
//		��
		for(int i =x+1;i<row;i++){
			if(num[i][y] == num[x][y])
			{
				count++;
			}else{
				break;
			}
		}
//		��
		if(count>=5)
		{
			return true;
		}
//		����
		count = 1;
		for(int j =y-1;j>=0;j--){
			if(num[x][j] == num[x][y])
			{
				count++;
			}
			else
			{
				break;
			}
		}
//		��
		for(int j =y+1;j<col;j++){
			if(num[x][j] == num[x][y])
			{
				count++;
			}else{
				break;
			}
		}
//		��
		if(count>=5)
		{
			return true;
		}
//		����
		count = 1;
		for(int i =x-1,j =y-1;i>=0&&j>=0;i--,j--){
			if(num[i][j] == num[x][y])
			{
				count++;
			}
			else
			{
				break;
			}
		}
//		����
		for(int i =x+1,j =y+1;i<row&&j<col;i++,j++){
			if(num[i][j] == num[x][y])
			{
				count++;
			}else{
				break;
			}
		}
//		����
		if(count>=5)
		{
			return true;
		}
//		��������
		count = 1;
		for(int i =x-1,j =y+1;i>=0&&j<col;i--,j++){
			if(num[i][j] == num[x][y])
			{
				count++;
			}
			else
			{
				break;
			}
		}
//		����
		for(int i =x+1,j =y-1;i<row&&j>=0;i++,j--){
			if(num[i][j] == num[x][y])
			{
				count++;
			}else{
				break;
			}
		}
//		����
		if(count>=5)
		{			
			return true;
		}
//		��������
		return false;
	}
//	�ж���Ӯ
	@Override
	public void mouseClicked(MouseEvent e) {
		if(canSetqizi){
			Graphics g = this.getGraphics();
			int checkusersuccess = 0;
//			��ʾ�Ƿ����ӳɹ�
			int x = e.getX();
			int y = e.getY();
//			��ȡ�������λ��
			Image c1= new ImageIcon("img/"+qizi1_name).getImage();
			int i = (x-25)/35;
			int j = (y-75)/35;
			if(num[i][j] != 0){
	             JOptionPane.showMessageDialog(null, "��λ�������ӣ�����������");
	             return;
//	             �ж����ӣ���ֹ�����¼��������´��¼�����
			}else{
				g.drawImage(c1, i*35+20, j*35+20, 35, 35, this);
//				�����������
				num[i][j] = 1;
//				�����鸶һ��ֵֻ����ʾ��λ��������
				checkusersuccess = 1;
//				��ʾ����ʾ
				qizi_num++;
//				��¼������Ӳ���
			}
			boolean b=iswin(i,j);
			if(b){
				JOptionPane.showMessageDialog(null, "��Ӯ�ˣ�");
				canSetqizi = false;
				paihangbang ph = new paihangbang();
				ph.setJushu(paihanglist.size()+1);
				ph.setBushu(qizi_num);
				ph.setJieguo("win");
				paihanglist.add(ph);
				return;
			}
//			����boolean�жϷ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
//			ʱ������������Ӻ�ĵȴ�
			Random r = new Random();
			Image c2 = new ImageIcon("img/"+qizi2_name).getImage();
//			���������ͼƬ
			do{
				int[] wz =getLoc(i, j);
				if(wz == null){
			i = r.nextInt(15);
			j = r.nextInt(15);
				}else{
					i=wz[0];
					j=wz[1];
				}
//			�������������
			}while(num[i][j] != 0);
			g.drawImage(c2, i*35+20, j*35+20, 35, 35, this);
			num[i][j] = 2;
			boolean d=iswin(i,j);
			if(d){
				JOptionPane.showMessageDialog(null, "�����ˣ�");
				canSetqizi = false;
				paihangbang ph = new paihangbang();
				ph.setJushu(paihanglist.size()+1);
				ph.setBushu(qizi_num);
				ph.setJieguo("fail");
				paihanglist.add(ph);
				return;
			}
//			�����������λ��;	
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
