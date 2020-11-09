import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class TestMyArrayList {
    public static void main(String[] args){
	TestMyArrayList test = new TestMyArrayList();

	System.out.print("testIsEmpty1 : ");
	if(test.testIsEmpty1() == true)
	    System.out.println("correct");
	else
	    System.out.println("incorrect"); 

	System.out.print("testIsEmpty2 : ");
	if(test.testIsEmpty2() == true)
	    System.out.println("correct");
	else
	    System.out.println("incorrect");


	System.out.print("testGet1 : ");
	if (test.testGet() == true)
		System.out.println("correct");
	else
		System.out.println("incorrect");


	System.out.print("testAdd1 : ");
	if(test.testAdd1() == true)
	    System.out.println("correct");
	else
	    System.out.println("incorrect");

	System.out.print("testEnsureCapacity : ");
	if(test.testEnsureCapacity())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testEquals1 : ");
	if(test.testEquals1())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testEquals2 : ");
	if(!test.testEquals2())
		System.out.println("correct");
	else
		System.out.println("incorrect");


	System.out.print("testSet1 : ");
	if(test.testSet1())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testSet2 : ");
	if(test.testSet2())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testAddWithArgs : ");
	if (test.testAddWithArgs())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testContains1 : ");
	if (test.testContains1())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testContains2 : ");
	if (test.testContains2())
		System.out.println("correct");
	else
		System.out.println("incorrect");


	System.out.print("testIndexOf1 : ");
	if(test.testIndexOf1())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testIndexOf2 : ");
	if(test.testIndexOf2())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testLastIndexOf : ");
	if(test.testLastIndexOf())
		System.out.println("correct");
	else
		System.out.println("incorrect");


	System.out.print("testRemoveInt : ");
	if(test.testRemoveInt())
		System.out.println("correct");
	else
		System.out.println("incorrect");


	System.out.print("testRemoveObject : ");
	if(test.testRemoveObject())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	System.out.print("testRemoveObject2 : ");
	if(test.testRemoveObject2())
		System.out.println("correct");
	else
		System.out.println("incorrect");

	}



    public boolean testIsEmpty1(){
	MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
	if(myArrayList.isEmpty() == true)
	    return true;
	else
	    return false;
    }
    
    public boolean testIsEmpty2(){
	MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
	myArrayList.add(1);
	if(myArrayList.isEmpty() == false)
	    return true;
	else
	    return false;
    }

    public boolean testAdd1(){
	MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
	myArrayList.add(1);
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(1);
	if(arrayList.equals(myArrayList))
	    return true;
	else
	    return false;
    }



    //Test pour la methode get()
	public boolean testGet() {
    	MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
    	myArrayList.add(1);
    	int mytest = myArrayList.get(0);
    	ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
    	int test = arrayList.get(0);
    	if (mytest == test)
    		return true;
    	else
    		return false;
	}


	//Methode pour tester ensureCapacity
	public boolean testEnsureCapacity(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		try{
			for (int i=0; i<20; i++){
				myArrayList.add(1);
			}
			return true;
		}
		catch (IndexOutOfBoundsException e){
			return false;
		}
	}

	//Methodes pour tester equals
	public boolean testEquals1(){
		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		MyArrayList<Integer> myArrayList2 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(2);
		myArrayList1.add(3);
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);

		return myArrayList1.equals(myArrayList2);
	}

	public boolean testEquals2(){
		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		MyArrayList<Integer> myArrayList2 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(2);
		myArrayList1.add(3);
		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(2);

		return myArrayList1.equals(myArrayList2);
	}

	//Methodes pour tester set()
	public boolean testSet1(){
		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		MyArrayList<Integer> myArrayList2 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(2);
		myArrayList1.add(3);
		myArrayList1.set(1,0);
		myArrayList2.add(1);
		myArrayList2.add(0);
		myArrayList2.add(3);

		return myArrayList1.equals(myArrayList2);
	}

	public boolean testSet2(){
		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(2);
		myArrayList1.add(3);
		Object retour = myArrayList1.set(1,0);
		return (retour.equals(2));
	}

	//Methode pour tester add(int position,Object o)
	public boolean testAddWithArgs(){
		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		MyArrayList<Integer> myArrayList2 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(3);
		myArrayList1.add(4);
		myArrayList1.add(1,2);

		myArrayList2.add(1);
		myArrayList2.add(2);
		myArrayList2.add(3);
		myArrayList2.add(4);

		return myArrayList1.equals(myArrayList2);
	}


	//Methodes pour tester contains
	public boolean testContains1(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(3);
		myArrayList.add(4);

		return myArrayList.contains(3);
	}
	public boolean testContains2() {
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(3);
		myArrayList.add(4);

		return !myArrayList.contains(2);
	}

	public boolean testIndexOf1(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(4);

		int result = myArrayList.indexOf(3);

		return result == 1;
	}

	public boolean testIndexOf2(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(4);

		int result = myArrayList.indexOf(2);

		return result == -1;
	}

	public boolean testLastIndexOf(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(4);

		int result = myArrayList.lastIndexOf(3);

		return result == 3;
	}

	public boolean testRemoveInt(){
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(4);

		myArrayList.remove(2);

		MyArrayList<Integer> myArrayList1 = new MyArrayList<Integer>();
		myArrayList1.add(1);
		myArrayList1.add(2);
		myArrayList1.add(3);
		myArrayList1.add(4);


    	return myArrayList.equals(myArrayList1);
	}

	public boolean testRemoveObject() {
		MyArrayList<String> myArrayList = new MyArrayList<String>();
		myArrayList.add("a");
		myArrayList.add("b");
		myArrayList.add("b");
		myArrayList.add("c");
		myArrayList.add("d");

		myArrayList.remove("b");

		MyArrayList<String> myArrayList1 = new MyArrayList<String>();
		myArrayList1.add("a");
		myArrayList1.add("b");
		myArrayList1.add("c");
		myArrayList1.add("d");


		return myArrayList1.equals(myArrayList);
	}


	public boolean testRemoveObject2(){
    	MyArrayList<String> myArrayList = new MyArrayList<String>();
    	myArrayList.add("a");
    	myArrayList.add("b");
    	myArrayList.add("b");
    	myArrayList.add("c");
    	myArrayList.add("d");

    	myArrayList.remove( "w");

    	MyArrayList<String> myArrayList1 = new MyArrayList<String>();
    	myArrayList1.add("a");
    	myArrayList1.add("b");
    	myArrayList1.add("c");
    	myArrayList1.add("d");


    	return !myArrayList1.equals(myArrayList);



	}





}
