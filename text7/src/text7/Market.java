package text7;

public class Market {
		//���У����е����֣����вֿ⣨��Ʒ�ļ��ϣ����飩
			private String MarkName;//���е�����
			private Prodeuct[] productArr;//���вֿ�
			
			public String getMarkName() {
				return MarkName;
			}
			public void setMarkName(String markName) {
				MarkName = markName;
			}
			public Prodeuct[] getProductArr() {
				return productArr;
			}
			public void setProductArr(Prodeuct[] productArr) {
				this.productArr = productArr;
			}
			//�����ָ����Ʒ������
			Prodeuct sell(String name) {
				for(int i=0;i<productArr.length;i++) {
					if(productArr[i].getProName()==name) {
						return productArr[i];//���ظ���Ʒ
					}
				}
				return null;
			}


		}

