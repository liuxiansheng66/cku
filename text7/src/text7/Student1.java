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
	System.out.println("我叫"+name+" 身高"+lenth+" 芳龄"+age+" 性别"+sex);
	System.out.println("你好！");
}

void speak1() {
System.out.println("我现在叫"+name);
}
}
