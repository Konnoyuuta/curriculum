package check;

import constants.Constants;


public class Check{
	
	//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
	//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	//なお、変数のアクセス修飾子は「private」とする。
	
	private static String firstName = "konnno";
	private static String lastName = "yuuta";

	public static void main(String[] args) { 
		

		
		
		printName(firstName,lastName);
		
		
		
	//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。

		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);	
			
		pet.introduce();

		
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		robotPet.introduce();

		
		
		
		
	}


//【Check.java】にてfirstNameとlastNameを引数で受け取って、
//連結して表示させるメソッド「printName」を作成しなさい。
//作成した関数のアクセス修飾子は「private」とする。
	private static void printName(String firstName, String lastName) {
	      	String printName = firstName + lastName;
	        System.out.println(printName);
	    }
				
			
	
		
}


