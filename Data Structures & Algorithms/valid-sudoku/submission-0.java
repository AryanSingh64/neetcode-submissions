class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        //creating actual hash
        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            cols[i]= new HashSet<>();
            boxes[i]= new HashSet<>();
        }

        //checking condition
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                //checking if its "."
                if(c=='.') continue;

                //check in row
                if(rows[i].contains(c)) return false;
                rows[i].add(c);
                if(cols[j].contains(c)) return false;
                cols[j].add(c);
                //using formulae for the box
                int boxIndex = (i/3)*3 + (j/3);

                if(boxes[boxIndex].contains(c)) return false;
                boxes[boxIndex].add(c);
            }
        }
        return true;
    }
}
