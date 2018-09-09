
class testGeneric<T>
{
	T obj;
	
	testGeneric(T o)
	{
		this.obj=o;
	}
	
	T getValue()
	{
		return obj;
	}
	
	void showType()
	{
		System.out.println(obj.getClass().getName());
	}
}

public class GenericClassExample {
	
	public static void main(String[] args)
	{
		testGeneric<Integer> t = new testGeneric(66);
		
		t.getClass();
		System.out.println(t.getValue());
		
	    testGeneric<String> str = new testGeneric("Pulkit Garg");
		str.getClass();
		System.out.println(str.getValue());
	}
	
	

}
