package text7;

public class Student1 {
private int lenth;
private String name;
private int age;
private char sex;

public int getLenth() {
	return lenth;
}

public void setLenth(int lenth) {
	this.lenth = lenth;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public char getSex() {
	return sex;
}

public void setSex(char sex) {
	this.sex = sex;
}

void speak() {
	System.out.println("�ҽ�"+name+" ���"+lenth+" ����"+age+" �Ա�"+sex);
	System.out.println("��ã�");
}

void speak1() {
System.out.println("�����ڽ�"+name);
}
}
