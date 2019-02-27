package IteratorModel;

public class Test {

	public static void main(String[] args) {
		IteratorContain iteratorContain = new IteratorContain();
		for(Iterator iterator = iteratorContain.getIterator();iterator.hasNext();) {
			System.out.println((String)iterator.next());
		}			
	}
}
