		//use of this keyword
		//this maintain reference of current object 
package session3c;

public class demothis {
	int a,b;
		//demothis is a constructor
	demothis(int a,int b){
		//this.a refer here current object
		this.a=a;
		this.b=b;
		//checking passed value
		if(a==10&&b==15)
		System.out.println("testing reslt true");
		else
			System.out.println("false");
		
	}
		//method where object is passed
	void show(demothis obj){
		
		//maintaing reference of a and b
		
		System.out.println("value of this.a is \t" +this.a);
		System.out.println("value of this.b is \t" +this.b);
		System.out.println("value of obj.a is \t" +obj.a);
		System.out.println("value of obj.b is \t" +obj.b);
		
		this.a=obj.a+10;
		
		System.out.println("value of this.a is \t" +this.a);
		System.out.println("value of obj.a is \t" +obj.a);
		
		obj.a=obj.a+10;
		this.b=obj.b+20;
		
		System.out.println("value of this.b is \t" +this.b);
		System.out.println("value of obj.b is \t" +obj.b);
		
		obj.b=obj.b+20;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(this.a);
		System.out.println(this.b);
	
	}
	public static void main(String[] args) {
		//object creation with parameter
		demothis o1=new demothis(5,2);
		demothis o2=new demothis(6,3);
		//object passing
		o1.show(o2);//changes in o1 and passes parameter of o2
		

	}

}
