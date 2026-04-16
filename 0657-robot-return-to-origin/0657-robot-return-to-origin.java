class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char n : moves.toCharArray()) {
            if (n == 'U') y++;
            else if (n == 'D') y--;
            else if (n == 'L') x--;
            else if (n == 'R') x++;
        }
        if (x == 0 && y == 0) {
            return true;
        } else {
            return false;
        }
    }
}
