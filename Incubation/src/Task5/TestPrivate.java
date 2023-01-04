package Task5;
class Parent {
void m()
{
	System.out.println("Parent");
}
}
public class TestPrivate  extends Parent{

	public static void main(String[] args) {
Parent p = new TestPrivate();
Parent i = new Parent();
TestPrivate k = new TestPrivate();
//TestPrivate ip = new Parent();
TestPrivate i2= (TestPrivate)i;
//Parent l = (Parent)k;
////TestPrivate t = (TestPrivate)p;
//((TestPrivate)p).m();
////t.m();
//((TestPrivate)p).m();
TestPrivate o = new TestPrivate();
p.m();
		
	}
 void m()
	{
		System.out.println("Child");
	}

}
