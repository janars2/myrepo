package org.somtest.poc;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
     
    {
	//changes in the branch
	//first commit
	//second commit
	//test commit
    	String filenamePrefix = "esa0000";
    	for(int i=22;i<164;i++){
			//changes from master branch
    		File file = new File("C:\\work\\10.6\\reporting_10.6\\ASOC-1529\\poc\\src\\main\\java\\org\\somtest\\poc\\"+filenamePrefix+i);
            if (!file.exists()) {
                try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
    	}
    	
    }
}
