package lab5;

import java.util.Arrays;
import java.util.List;

public class TestNode {

	public static void main(String[] args) {
		Puzzle p = new Puzzle();
		p.readInput("/Users/admin/eclipse-workspace/ThucHanhAI/src/lab5/PuzzleMap.txt",
				"/Users/admin/eclipse-workspace/ThucHanhAI/src/lab5/PuzzleGoalState.txt");

		Node initialState = p.getInitialState();
		Node goalState = p.getGoalState();
		Node tmp = new Node(initialState);
		System.out.println("Test equal: " + initialState.equals(tmp));
		System.out.println("Print goal state:\n" + p.getGoalState());
		System.out.println("Print current state:\n" + p.getInitialState());
		System.out.println("H: " + initialState.getH());
		System.out.println("H1: " + p.computeH1(initialState));
		System.out.println("H2: " + p.computeH2(initialState));
//		System.out.println(Arrays.toString(initialState.getWhiteTilePosition()));
		Node re = p.moveWhiteTile(initialState, 'd');
//
		System.out.println("Test move white tile:\n" + re);
		System.out.println("IDK what is H?: " + re.getH());
		System.out.println(initialState);
//		System.out.println(Arrays.toString(re.getWhiteTilePosition()));
//		System.out.println(p.computeH(init, goal));

		System.out.println(p.getInitialState());
		System.out.println(p.getGoalState());

		List<Node> children = p.getSuccessors(initialState);
		System.out.println("Size: " + children.size());
		for (Node child : children) {
//		 System.out.println(child.getH()+" "+p.computeH(child) );
		}
		GreedySearchAlgo s = new GreedySearchAlgo();
		System.out.println(s.execute(p));
	}
}
