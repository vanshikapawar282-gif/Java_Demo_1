package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp> {
	String name;
	int id;
	double sal;

	public Emp(String name, int id, double sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Emp o) {
		if (this.id > o.id) {
			return -1;
		} else if (this.id < o.id) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public class Main {
		public static void main(String[] args) {
			Emp emp1 = new Emp("tom", 11, 25000);
			Emp emp2 = new Emp("jerry", 12, 15000);
			Emp emp3 = new Emp("harry", 13, 30000);
			Emp emp4 = new Emp("peter", 14, 35000);

			List<Emp> emps = new ArrayList<Emp>();
			emps.add(emp1);
			emps.add(emp2);
			emps.add(emp3);
			emps.add(emp4);

			Iterator<Emp> iterator = emps.iterator();
			while (iterator.hasNext()) {
				Emp emp = iterator.next();
				System.out.println(emp);
			}

			Collections.sort(emps);
			System.out.println("----------------------------------");
			Iterator<Emp> iterator2 = emps.iterator();
			while (iterator2.hasNext()) {
				Emp emp = iterator2.next();
				System.out.println(emp);
			}
			System.out.println("---------------------------");

			Collections.sort(emps, new SalComperator());
			Iterator<Emp> iterator3 = emps.iterator();
			while (iterator3.hasNext()) {
				Emp emp = iterator3.next();
				System.out.println(emp);
			}
		}
	}
}