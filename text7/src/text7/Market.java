package text7;

public class Market {
		//超市：超市的名字，超市仓库（商品的集合，数组）
			private String MarkName;//超市的名字
			private Prodeuct[] productArr;//超市仓库
			
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
			//买货，指定商品的名字
			Prodeuct sell(String name) {
				for(int i=0;i<productArr.length;i++) {
					if(productArr[i].getProName()==name) {
						return productArr[i];//返回该商品
					}
				}
				return null;
			}


		}

