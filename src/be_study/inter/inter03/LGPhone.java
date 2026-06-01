package be_study.inter.inter03;

public class LGPhone implements Callable, Connectable{

	public void call() {
		System.out.println("LGPhone call()");
	}
	public void connect() {
		System.out.println("LGPhone connect()");
	}
}
