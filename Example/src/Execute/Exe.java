
package Execute;

import org.testng.annotations.Test;

import ActionsPack.ActionsClass;
import Rep.Brows;

public class Exe {
	@Test
	public static void execu() throws Exception 
	{
	
		Brows.browser();
		ActionsClass.Register();
		ActionsClass.Signin();
		ActionsClass.Home();
		ActionsClass.profileupdation();
	}

}
