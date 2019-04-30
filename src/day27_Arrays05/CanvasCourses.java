package day27_Arrays05;

public class CanvasCourses {
	public static void main(String[] args) {
		String str = "https://learn.cybertekschool.com/courses/147";

		// 147 -> Java programming
		// 204 -> Mentoring sessions
		// 149 -> SDLC
		// 152 -> QA Testing
		// 144 -> Team activity
		// 143 -> Welcome Kit
		String[] arr = str.split("/");
		int[] courseNum = { 147, 204, 149, 152, 144, 143 };

		String[] course = { "Java programming", "Mentoring sessions", "SDLC", "QA Testing", "Team activity",
				"Welcome Kit" };
		int value = Integer.parseInt(arr[arr.length - 1]);

		int index = 0;
		for (int i = 0; i < courseNum.length; i++) {
			if (courseNum[i] == value) {
				index = i;
			}
		}
		String result = value + " - " + course[index];
		System.out.println(result);
	}

}
