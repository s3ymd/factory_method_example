interface Logger {
	void debug(String message);
}

class ConsoleLogger implements Logger {

	@Override
	public void debug(String message) {
		System.out.println(message);
	}

}

public class Main {
	public static Logger logger = new ConsoleLogger();

	public static void main(String[] args) {
		logger.debug("Xシステムの処理を開始します");
		new SubSystemA().main();
		new SubSystemB().main();
		new SubSystemC().main();
		logger.debug("Xシステムの処理が完了しました");
	}
}

class SubSystemA {
	public static Logger logger = new ConsoleLogger();

	public void main() {
		logger.debug("サブシステムAの処理を開始します");
		logger.debug("サブシステムAの処理が完了しました");
	}
}


class SubSystemB {
	public static Logger logger = new ConsoleLogger();

	public void main() {
		logger.debug("サブシステムBの処理を開始します");
		logger.debug("サブシステムBの処理が完了しました");
	}
}


class SubSystemC {
	public static Logger logger = new ConsoleLogger();

	public void main() {
		logger.debug("サブシステムCの処理を開始します");
		logger.debug("サブシステムCの処理が完了しました");
	}
}
