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

		if (nickName == null || nickName.trim().isEmpty()) {
			isOK = false;
		}
		
		if(	nickName.matches("^\\d{2,4}-\\d{2,4}-\\d{4}$")) {
			isOK = false;
		}
		
		if(	nickName.matches("^.{2,3}[都道府県]$")) {
			isOK = false;
		}
		
		String[] NGWord = {"うんこ",
				"ばか",
				"バカ",
				"馬鹿",
				"死ね",
				"タヒね",
				"SEX",
				"sex",
				"Sex",
				"殺す"} ;
		
		for(int i= 0;i < NGWord.length; i++) {
			if(nickName.matches(NGWord[i])) {
				isOK = false;
			}
		}
		
		return isOK;
	}
	
}
