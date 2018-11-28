package qFilmStats;

import com.beust.jcommander.*;

public class QuickStats {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String argument : args) {
			if(isRecognized(argument)){
				char key = makeSwitchable(argument);
				switch (key) {
				case 'y':
					int year = Integer.parseInt(argument);
					break;

				default:
					break;
				}
			}
		}
	}

	private static char makeSwitchable(String argument) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static boolean isRecognized(String argument) {
		// TODO Auto-generated method stub
		return false;
	}

}
