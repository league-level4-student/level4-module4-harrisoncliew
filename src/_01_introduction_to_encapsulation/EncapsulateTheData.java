package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if(itemsReceived<0) {
			this.itemsReceived=0;
		} else {
			this.itemsReceived = itemsReceived;
		}
	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if(degreesTurned<0.0 || degreesTurned>360.0) {
			
		} else {
		this.degreesTurned = degreesTurned;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if(nomenclature.equals("")) {
			this.nomenclature = " ";
		} else {
		this.nomenclature = nomenclature;
		}
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if(memberObj instanceof String) {
			this.memberObj = new Object();
		} else {
		this.memberObj = memberObj;
		}
	}
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	@Test
	void testItemsReceived() {
		setItemsReceived(-1);
		assertEquals(0, getItemsReceived());
		setItemsReceived(8);
		assertEquals(8, getItemsReceived());
	}
	@Test
	void testDegreesTurned() {
		setDegreesTurned(90);
		assertEquals(90, getDegreesTurned());
		setDegreesTurned(450);
		assertEquals(90, getDegreesTurned());
		
	}
	@Test
	void testNomenclature() {
		setNomenclature("Hi this is a string variable now!!");
		assertEquals("Hi this is a string variable now!!", getNomenclature());
		setNomenclature("");
		assertEquals(" ", getNomenclature());
	}
	@Test
	void testMemberObj() {
		setMemberObj(20);
		assertEquals(20, getMemberObj());
		setMemberObj("This is a string");
		assertEquals(new Object(), getMemberObj());
	}
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
//		EncapsulateTheData e = new EncapsulateTheData();
//		e.testItemsReceived();
//		e.testDegreesTurned();
//		e.testMemberObj();
//		e.testNomenclature();
		
	}
}
