package org.moban;

public class Test {

	public static void main(String[] args) {
		DodishTemplate dodishTemplate = new EggsWithTomato();
		dodishTemplate.docoock();
	}
}

/**　 
   	 定义一个操作中算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤。

	通俗点的理解就是 ：完成一件事情，有固定的数个步骤，但是每个步骤根据对象的不同，而实现细节不同；就可以在父类中定义一个完成该事情的总方法，
按照完成事件需要的步骤去调用其每个步骤的实现方法。每个步骤的具体实现，由子类完成。
*/