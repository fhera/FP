package fp.utiles;

import java.util.Comparator;

public class Ordenes {

	public static <T extends Comparable<T>> void ordenar(T[] array,
			Comparator<T> cmp) {
		T temp;
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				T min;
				if (cmp == null) {
					min = min(array[j], array[j - 1]);
				} else {
					min = min(array[j], array[j - 1], cmp);
				}
				if (min.equals(array[j])) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static <T> T min(T e1, T e2, Comparator<T> cmp) {
		return cmp.compare(e1, e2) <= 0 ? e1 : e2;
	}

	public static <T extends Comparable<T>> T min(T e1, T e2) {
		return e1.compareTo(e2) <= 0 ? e1 : e2;
	}
	//TODO: Comprobar que funcione para max
	public static <T extends Comparable<T>> void max(T[] array,
			Comparator<T> cmp) {
		T temp;
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				T max;
				if (cmp == null) {
					max = max(array[j], array[j - 1]);
				} else {
					max = max(array[j], array[j - 1], cmp);
				}
				if (max.equals(array[j])) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static <T> T max(T e1, T e2, Comparator<T> cmp) {
		return cmp.compare(e1, e2) >= 0 ? e1 : e2;
	}

	public static <T extends Comparable<T>> T max(T e1, T e2) {
		return e1.compareTo(e2) >= 0 ? e1 : e2;
	}
	
}
