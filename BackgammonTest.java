public class BackgammonTest {
	public static void main(String[] args) {
		{
			BackgammonBoard a1 = new BackgammonBoard();
			a1.setPoint(3, 1, true);
			a1.setPoint(2, 2, false);
			a1.move(3, 2);
			if (a1.getPointCount(3) != 1) {
				System.out.println("BUG");
				System.exit(0);

			}

			{
				BackgammonBoard a2 = new BackgammonBoard();
				a2.setPoint(2, 1, false);
				a2.move(2, 1);
				if (a2.getPointCount(2) == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}

			{
				BackgammonBoard a3 = new BackgammonBoard();
				a3.setPoint(1, 1, true);
				a3.move(1, 2);
				if (a3.getPointCount(1) == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}

			{
				BackgammonBoard a4 = new BackgammonBoard();
				a4.setPoint(1, 1, false);
				a4.move(1, 9);
				if (a4.getPointCount(1) == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}
			
			{
				BackgammonBoard a5 = new BackgammonBoard();
				a5.setPoint(1, 1, false);
				a5.setPoint(2, 1, true);
				a5.move(1, 2);
				if (a5.getBarBlackCount() == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}

			{
				BackgammonBoard a6 = new BackgammonBoard();
				a6.setPoint(3, 1, true);
				a6.setPoint(2, 1, false);
				a6.move(3, 2);
				if (a6.getBarWhiteCount() == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}
			{
				BackgammonBoard a7 = new BackgammonBoard();
				a7.setPoint(2, 2, true);
				a7.move(2, 1);
				if (a7.getPointCount(1) == 2) {
					System.out.println("BUG");
					System.exit(0);
				}

			}
			{
				BackgammonBoard a8 = new BackgammonBoard();
				a8.setPoint(22, 1, false);
				a8.move(22, 24);
				if (a8.getPointCount(22) == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}

			{
				BackgammonBoard a9 = new BackgammonBoard();
				a9.setPoint(1, 1, true);
				a9.move(1, -1);
				if (a9.getPointCount(1) == 0) {
					System.out.println("BUG");
					System.exit(0);
				}

			}
			{
				BackgammonBoard a10 = new BackgammonBoard();
				a10.setPoint(3, 2, true);
				a10.move(3, 2);
				if (a10.getPointCount(2)==2||a10.getPointCount(2)==0||a10.getPointCount(3)==2||a10.getPointCount(3)==0) {
					System.out.println("BUG");
					System.exit(0);
				}
			}

			{
				BackgammonBoard a11 = new BackgammonBoard();
				a11.setPoint(3, 1, true);
				a11.setPoint(1, 1, false);
				a11.move(1, 3);
				if (a11.getPointBlack(3) == true) {
					System.out.println("BUG");
					System.exit(0);
				}
			}

			System.out.println("CORRECT");

		}

	}
}