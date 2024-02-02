package com.edu27;
class _Student_ {
	String name;
	int score;
	public _Student_(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	}
 class _Classroom_{
	 
	public String  registerStudent(_Student_ student){
		 String name =student.name;
		 int score = student.score;
		 int count=0;
			
			if ( score >=0 && score <=100) {
				
				for ( int i=0;i<name.length();i++) {
					if (name.charAt(i)>='A'  && name.charAt(i)<='Z') {
						count++;
					    if (count==name.length()) {
					    	System.out.println("Registered");
					}}
					
			
						else {
								System.out.println("Block Letters Needed");

				}}}
				
			else {
				System.out.println("Invalid Score");
}			return null;

	}
			
			public String studentCard(String card){
				
				
				int count=0;
				for ( int i=0;i<card.length();i++) {
					if (card.charAt(i)>=48  && card.charAt(i)<=57) {
						count++;
					
					if (count==card.length()) {
						return "Valid Card";
					}
					}
					else {
						return "Invalid Card";
					}

				}
				return null;

			}
 }
 
public class The_ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	_Student_ s1 = new _Student_("IT",45);
	_Classroom_ cm = new _Classroom_();
	cm.registerStudent(s1);		
	System.out.println(cm.studentCard("254"));
	
	}
}
 
