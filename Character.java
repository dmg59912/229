package hashTable;

import java.util.*;

class Character{
	public static int TABLESIZE = 9;
	private String firstName;
	private String lastName;
	private int age;

	// Constructor: Do not touch
	public Character(String fn, String ln){
		firstName = fn;
		lastName = ln;
	}

	// Function key()
	// Should return the proper index to place the specific Character
	// into the hash table
	// Use the first letter of the last name and modulus to find the proper index
	public int key(){
		// for now, returns the ascii value of first character of last name
		int k = lastName.charAt(0);
		k = k % 9;
		return k;
	}

	// the details of the specific Character when you print it. Do not touch
	public String toString(){
		String str = "Last name: " + lastName;
		str += "\nFirst name: " + firstName;
		str += "\nHash Table Key: " + key();
		return str;
	}
	
	public String getLastName(){
		return lastName;
	}




	public static void main(String[] args){
		Character[] hashtable = new Character[TABLESIZE]; // empty hashtable


		//use this to test part 2!!! If it works, comment or delete
		Character s1 = new Character("r2", "Fett");
		//System.out.println(s1);


		//insert other code here!!!
		Scanner in = new Scanner(System.in);
		String first_name;
		String last_name;
		int total_key_inserted = 0;
		while( total_key_inserted <= TABLESIZE )
		{
			System.out.print("Last Name: ");
			last_name = in.nextLine();
			System.out.print("\nFirst Name: ");
			first_name = in.nextLine();
			System.out.println("\n-----------------");
			Character names = new Character(first_name,last_name);
			if (hashtable[names.key()] == null)
			{
				
				hashtable[names.key()] = names;
				++total_key_inserted;
			}
			else
				System.out.println("Error: Key already taken\n---------------------------");
				
			
		}
		System.out.println("Finish Hash Table");
		System.out.println("Last Name: ");
		last_name = in.nextLine();
		
		
	}


}















