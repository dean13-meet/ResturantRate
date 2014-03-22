public abstract class ButtonCommands{
	Program p;
	ButtonCommands(Program p){
		this.p = p;
	}
	
	abstract void execute(int caseNum);
}

class empty extends ButtonCommands{

	empty(Program p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute(int caseNum) {
		// TODO Auto-generated method stub
		
	}
	
}
