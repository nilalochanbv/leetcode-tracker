// Last updated: 7/9/2026, 9:47:02 AM

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<ClassInfo> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.gain(), a.gain()));

        for (int[] c : classes) {
            maxHeap.offer(new ClassInfo(c[0], c[1]));
        }


        for (int i = 0; i < extraStudents; i++) {
            ClassInfo best = maxHeap.poll();
            best.pass++;
            best.total++;
            maxHeap.offer(best);
        }

        double totalRatio = 0.0;
        while (!maxHeap.isEmpty()) {
            ClassInfo c = maxHeap.poll();
            totalRatio += (double) c.pass / c.total;
        }

        return totalRatio / classes.length;
    }

    private static class ClassInfo {
        int pass;
        int total;

        ClassInfo(int pass, int total) {
            this.pass = pass;
            this.total = total;
        }

        double gain() {
            double before = (double) pass / total;
            double after = (double) (pass + 1) / (total + 1);
            return after - before;
        }
    }
}
