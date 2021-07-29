package bcdx2021GitProject;

public class ValidateTest {

	public static void main(String[] args)
	{

	}

	/*
	 * return true:OKワード,false:NGワード
	 * */
	public static boolean checkNickName(String nickName){

		boolean isOK = true;
		//ここにNGワードを弾く処理を書く
		if(nickName.contains("090")) isOK = false;
		if(nickName.contains("県")) isOK = false;
		if(nickName.contains("都")) isOK = false;
		if(nickName.contains("道")) isOK = false;
		if(nickName.contains("府")) isOK = false;
		if(nickName.contains("@")) isOK = false;
		
		return isOK;


}
}
