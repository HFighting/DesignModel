package IteratorModel;

//迭代容器对象，其包含一个内部类
public class IteratorContain implements Contain {
	
	private String[] Name = {"张三","李四","王五","赵六"};
	
	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	class NameIterator implements Iterator {
		
		int index;
		
		public boolean hasNext() {
			if (index < Name.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (hasNext()) {
				return Name[index++];
			}
			return null;
		}
		
	}
}
