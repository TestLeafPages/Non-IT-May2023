package week1.day1;

public class Mobile {

	public void sendSMS() {
		System.out.println("Hello Testleaf");
	}

	protected void allowVoiceCall() {
		System.out.println("Allow Voice Call");
	}

	private void takeVideo() {
		System.out.println("TakeVideo");

	}
	

	public static void main(String[] args) {
      //Create object for class
		Mobile mb=new Mobile();
		mb.allowVoiceCall();
		mb.sendSMS();
		mb.takeVideo();
		
	}

}
