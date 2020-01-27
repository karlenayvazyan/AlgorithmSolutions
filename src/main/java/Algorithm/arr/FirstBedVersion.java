package Algorithm.arr;

public class FirstBedVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int pointer = n;
        while (pointer != 0) {

        }
        return -1;
    }
}

class VersionControl {
    protected boolean isBadVersion(int n) {
        if (n < 4) return false;
        return true;
    }
}