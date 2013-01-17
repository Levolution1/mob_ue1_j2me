package at.azak;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;


public class ue1Midlet extends MIDlet {
	
    
	private Form form;
	private Display display;

	public ue1Midlet() {
		// TODO Auto-generated constructor stub
	     form = new Form("My First J2ME App");

	     String msg = "Hello World";

	     form.append(msg);

	     display = Display.getDisplay(this);

	     display.setCurrent(form);
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		 notifyDestroyed();

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

}
