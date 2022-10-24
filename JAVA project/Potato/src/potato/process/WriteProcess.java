package potato.process;

import potato.process.command.AbsCommand;
import potato.util.InputString;

public class WriteProcess {

	public void WriteProcess() {
		AbsCommand command = new WriteCommand();
		int inputMenu;
		while(true) {
			System.out.println("======================");
			System.out.println("1. 판매 글쓰기");
			System.out.println("2. 글수정");
			System.out.println("3. 글삭제");
			System.out.println("======================");
			System.out.print("작업을 입력해주세요:>>");
			try {
				inputMenu = InputString.inputInt();
				
				command.command.get(inputMenu).process(); // 여기에... 이제 처리 해주시면 됩니다. 여기가 루프 돌아야 합니다.
			
				
				
				catch(Exception e) {
				System.out.println("작업에 오류가 발생하였습니다. 다시 시도해주세요.");
				continue;
			}
		}
	}
		
	
	}
		
	
		
		
				
	
}
