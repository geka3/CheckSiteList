package net.ukr.geka3;

public class Main {
	public static void main(String[] args) {
		FileList fl = new FileList();
		String[] arrayHttp = fl.getHttpList("listhtml.txt");
		for (String tempHttp : arrayHttp) {
			System.out.println(tempHttp);
			if (CheckHttp.checkHttp(tempHttp)) {
				System.out.println(" is available");
			} else {
				System.out.println(" is not available");
			}
			System.out.println();

		}

	}
}
