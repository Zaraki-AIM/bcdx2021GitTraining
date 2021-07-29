package bcdx2021GitProject;

public class ConflictDemo {

	/*
	 * return true:OKワード,false:NGワード
	 * */
	public static boolean checkNickName(String nickName){

//<<<<<<< HEAD
//		boolean isOK = false;
//=======
		boolean isOK = true;
		System.out.println("惇平いつもありがとう！");
		System.out.println("じゅんぺいの優しさにいつも救われています！");
		System.out.println("これからも同居人としてかなり濃いお付き合いになると思いますが、");
		System.out.println("何卒よろしくお願い申し上げます。(#^^#)");
		int tekitounahensuu = 3;
//>>>>>>> team5
		//ここにNGワードを弾く処理を書く
//		String tekitounahensuu = "tekitounamojiretu";

		System.out.println("こちらこそ何卒よろしくお願い申し上げます。(#^^#)");


		return isOK;

	}
}
