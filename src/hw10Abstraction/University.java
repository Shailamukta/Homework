package hw10Abstraction;
// Interface can inherited with only other interface class.

// Interface do not inherited with other abstract or regular class.
//Interface can inherit with one or more than one other interface class.
//we use extends keyword to inheritance in interface.

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	public void gymnasium();

	public static void library() {

	}

}

//public University()-in Interface we can not create any constructor.
