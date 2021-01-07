import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class student {
	
	static class Student implements Comparable{
		String number;
		String name;
		int age;
		public Student(String number, String name, int age) {
			this.number = number;
			this.name = name;
			this.age = age;
		}
		public String getNumber() {
			return this.number;
		}
		public String getName() {
			return this.name;
		}
		public int getAge() {
			return this.age;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int compareTo(Object Z) {
			if(!(Z instanceof Student)) {
				throw new RuntimeException("不是Student对象");
				
			}
			Student L = (Student) Z;
			if(this.age > L.age) {
				return 1;
			}else if(this.age == L.age){
				return this.name.compareTo(L.name);
			}else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Set<Student> students = new TreeSet<Student>();
		while(true) {
			String number = input.next();
			if("exit".equals(number)) {
				break;
			}
			String name = input.next();
			int age = input.nextInt();
			Student S = new Student(number, name, age);
			students.add(S);
		}
		Iterator<Student> it = students.iterator();
		while(it.hasNext()) {
			Student student = (Student)it.next();
			System.out.println("name: "+ student.getName());
		}
	}

}
