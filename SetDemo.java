class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class SetDemo {

	public static void main(String[] args) {

		String s1="hello";
		
		String s2="hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Emp e1 = new Emp(1,"sam");
		Emp e2 = new Emp(1,"sam");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
