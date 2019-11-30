import java.util.Scanner;
public class sum_ll {
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	 Node head;
	void insert(int data)
	{
		 Node newNode=new Node(data);
	       if(head==null)
	       {
	           head=newNode;
	           return;
	       }
	       Node current=head;
	       while(current.next!=null)
	       {
	           current=current.next;
	       }
	       current.next=newNode;
	       return;
	}
	 void display()
	{
		Node current=head;
	    while(current!=null)
			{
			    System.out.print(current.data+" ");
			   current=current.next;
			}
	}
    public static sum_ll sum(sum_ll li1,sum_ll li2)
    {
        Node current1=li1.head;
        Node current2=li2.head;
        int num1=0;
        int num2=0;
        int n=0;
        while(current1!=null)
        {
            num1=num1+current1.data*(int)Math.pow(10,n);
           current1=current1.next;
            n++;
        }
        n=0;
        while(current2!=null)
        {
            num2=num2+current2.data*(int)Math.pow(10,n);
            current2=current2.next;
           n++;
        }
        int num3=num1+num2;
        sum_ll li3=new sum_ll();
        int rem=0;
        while(num3!=0)
        {
            rem=num3%10;
            li3.insert(rem);
            num3=num3/10;
        }
        return li3;
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		sum_ll li=new sum_ll();
		sum_ll li1=new sum_ll();
		sum_ll li2=new sum_ll();
		System.out.println("Enter the amount of elements you want to enter in LL1 and LL2");
		int n=sc.nextInt();
		System.out.println("Enter the elements in LL1");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}

		System.out.println("Enter the elements in LL2");
		for(int i=0;i<n;i++)
		{
			li1.insert(sc.nextInt());
		}

		System.out.println("Sum of LinkedLists");
		li2=sum(li,li1);
		li2.display();
	}
}
