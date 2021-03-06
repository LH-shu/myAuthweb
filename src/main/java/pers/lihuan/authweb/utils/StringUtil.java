package pers.lihuan.authweb.utils;

/**
 * @author Fancy
 */
public class StringUtil {
	
	public static boolean isBlank(String str){
		if(str == null || str.isEmpty() || str.replaceAll(" ", "").isEmpty()){
			return true;
		}
		return false;
	}
	
	public static boolean isBlank(String... strs){
		for(int i=0; i<strs.length; i++){
			if(isBlank(strs[i])){
				return false;
			}
		}
		return true;
	}
}
