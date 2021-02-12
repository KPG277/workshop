package P1;

public class TestCaseLogin {

		boolean login(String un, String psd)
		{
			if(un=="Admin" && psd=="admin@123")
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		public static void main(String[] args) {
			TestCaseLogin l= new TestCaseLogin();
			l.login("Admin", "admin@123");
		}
	
		
	
	}


