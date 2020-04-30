package studentpriorityqueue;

import java.util.Scanner;

public class PriorityQueue {
	    private Student[] data;
	    private int front,rear;
	    private int size;
	    Student ob=new Student();
	    public PriorityQueue(int size) {
	    	   this.size=size;
		        data =new Student[this.size];
		        front=-1;
		        rear=-1;
	    }
	    public void enqueue(Student object) {
		        if(!isFull()){
		            data[rear+1]=object;
		            rear++; 
		            front=0;
		            sorting(); 
		            System.out.println(object.getName()+ " is successfully inserted in queue ");
		        }
		        else {
		        	System.out.println("Overflow at : " +object.getName());
		        }
		        
	    }
	    boolean isFull(){
	    	   boolean response=false;
		        if(rear==size-1){
		            response=true;
		        }
		        return response;
	    }
	    public void dequeue() {
		        if(!isEmpty()){		        
		        	front++;
		        }
		        else
		        	System.out.println("Queue is emptied");
	    }
	    boolean isEmpty(){
			 boolean response=false;
		        if((front==-1 && rear==-1) || front==size){
		            response=true;
		        }
		        return response;
		}

	    public void sorting() {
			Student c;
			for(int i=0 ; i<rear;i++){                                                                //sorting descending
				for(int j=0; j<=rear-i-1;j++) {
				if(data[j+1].getCpi()>data[j].getCpi()) {                         
				c=data[j+1];
				data[j+1]=data[j];
				data[j]=c;
				}
			}
			}	
		}
	    
	    public void print() {
	    	if(front!=-1 && rear!=-1) {
	    	System.out.println("NAME\t\tROLL\t\tCPI");
	    	System.out.println("----------------------------------");
	    	for(int i=front;i<=rear;i++) {
	    		System.out.println(data[i].getName()+"\t\t"+data[i].getRoll()+"\t\t"+data[i].getCpi());
	    	}
	    	}
	    	else {
	    		System.out.println("sorry! none element is inserted till now");
	    	}
		}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		PriorityQueue pr=new PriorityQueue(5);
		for(int i=0;i<6;i++) {
			Student ob=new Student();
			ob.setName(sc.next());
			ob.setCpi(sc.nextDouble());
			ob.SetRoll(sc.nextInt());
			pr.enqueue(ob);
		}
		//pr.dequeue();
		//pr.dequeue();
		pr.print();
		//System.out.println("----------------------------------");
		//System.out.println("       AFTER DEQUEUE OPERATION    ");
		//System.out.println("----------------------------------");
		/*pr.dequeue();
		pr.dequeue();
		pr.dequeue();
		pr.dequeue();
		pr.dequeue();*/
		//pr.dequeue();
		//pr.print();
		

	}

}
/*
madan
4
60
mohan
8
63
udit
5
68
sid
10
67
jalan
8.4
56
 */
