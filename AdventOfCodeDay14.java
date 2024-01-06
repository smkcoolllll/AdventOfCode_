public class AdventOfCodeDay14 {

    public static void main(String[] args) {
        String[] platformLayout = {
                "O....#....",
                "O.OO#....#",
                ".....##...",
                "OO.#O....O",
                ".O.....O#.",
                "O.#..O.#.#",
                "..O..#O..O",
                ".......O..",
                "#....###..",
                "#OO..#...."
        };

        int totalLoad = calculateTotalLoad(platformLayout);
        System.out.println("Total Load on North Support Beams: " + totalLoad);
    }

    private static int calculateTotalLoad(String[] platformLayout) {
        int totalLoad = 0;

        for (int i = 0; i < platformLayout.length; i++) {
            for (int j = 0; j < platformLayout[i].length(); j++) {
                if (platformLayout[i].charAt(j) == 'O') {
                    totalLoad += platformLayout.length - i;
                }
            }
        }

        return totalLoad;
    }
}
