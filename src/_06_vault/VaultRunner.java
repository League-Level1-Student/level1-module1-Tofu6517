package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault=new Vault();
		SecretAgent secretAgent=new SecretAgent();
		int i=secretAgent.findCode(vault);
		boolean correct=vault.tryCode(i);
		System.out.println(correct);
		
		
	}
}
class SecretAgent {
	int findCode(Vault v) {
		for(int i=0;i<1000000001;i++ ) {
			boolean correct=v.tryCode(i);
			if(correct) {
				return i;
			}
		}
		return -1;
	}
}
	
	
	

