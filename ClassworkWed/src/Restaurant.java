
public class Restaurant extends Business {
	private int rating;
	

	@Override // 4. not just signature, but rt & am (m declaration/header)
	public String getDescription() {
		return name + " -- " + address + "\n  Rating: " + rating;
		// 5. don't do this!
//	   return getDescription();
		// 6. this is good...
//	   return super.getDescription();
	}

//	 100. do this last...
	@Override
	public String toString() {
		return this.name + " is not a " + rating;
	}
}
