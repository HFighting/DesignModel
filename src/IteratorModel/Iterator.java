package IteratorModel;

/*
 * 迭代器模式：提供一种顺序访问容器中元素的方法，而无需暴露容器中的内部情况
 * 用于遍历聚合类
 */

//迭代器接口，用来迭代对象
public interface Iterator {
	public boolean hasNext();
	public Object next();
}
