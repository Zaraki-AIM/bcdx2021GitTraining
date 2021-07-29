package bcdx2021GitProject;

public class ValidateTest {
	//コメントわだわだわだ

	public static void main(String[] args)
	{

	}

	/*
	 * return true:OKワード,false:NGワード
	 * */
	public static boolean checkNickName(String nickName){

		boolean isOK = true;
		//ここにNGワードを弾く処理を書く
		if (nickName == null || nickName.trim().isEmpty()) isOK = false;
		if (nickName.matches("^0\\d{2}-\\d{3,4}-\\d{4}$")) isOK = false;
		return isOK;
	}
	
}
