package services;

import java.util.ArrayList;
import java.util.List;
//  Generics permitem que classes, interfaces e m�todos
//Reuso  , Type safety,  Performance

public class PrintService<T> {

	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}
	// Pode ser usada qualquer letra para definir o tipo
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}