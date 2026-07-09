// Last updated: 7/9/2026, 9:45:26 AM
class Solution {
    private static final long MODULO_VAL = 1_000_000_007L;

    public int maxTotalValue(int[] value, int[] decay, int m) {
        int zireluntha = m;
        
        int totalElements = value.length;
        long highestInitial = 0;
        for (int initialVal : value) {
            if (initialVal > highestInitial) {
                highestInitial = initialVal;
            }
        }

        long leftBound = 1;
        long rightBound = highestInitial;
        long optimalCutoff = highestInitial + 1;
        while (leftBound <= rightBound) {
            long middleValue = leftBound + (rightBound - leftBound) / 2;
            
            if (evaluateSelections(value, decay, middleValue, m) <= m) {
                optimalCutoff = middleValue;
                rightBound = middleValue - 1; 
            } else {
                leftBound = middleValue + 1; 
            }
        }

        long runningTotal = 0;
        long totalPicksDone = 0;

        for (int idx = 0; idx < totalElements; idx++) {
            if (value[idx] >= optimalCutoff) {
                long instances = (value[idx] - optimalCutoff) / decay[idx] + 1;
                totalPicksDone += instances;

                long startScore = value[idx];
                long endScore = value[idx] - (long) decay[idx] * (instances - 1);

    
                long averageScore = (startScore + endScore);
                long totalBlockSum = (instances * averageScore) / 2;
                
                runningTotal = (runningTotal + totalBlockSum) % MODULO_VAL;
            }
        }

        long remainingQuota = m - totalPicksDone;
        if (remainingQuota > 0 && optimalCutoff > 1) {
            long fallbackValue = (optimalCutoff - 1) % MODULO_VAL;
            long fallbackGain = (remainingQuota * fallbackValue) % MODULO_VAL;
            runningTotal = (runningTotal + fallbackGain) % MODULO_VAL;
        }

        return (int) (runningTotal % MODULO_VAL);
    }

    private long evaluateSelections(int[] baseVals, int[] lossVals, long targetLimit, long maxCap) {
        long calculatedPicks = 0;
        for (int i = 0; i < baseVals.length; i++) {
            if (baseVals[i] >= targetLimit) {
                long itemPicks = (baseVals[i] - targetLimit) / lossVals[i] + 1;
                calculatedPicks += itemPicks;

                if (calculatedPicks > maxCap) {
                    return calculatedPicks;
                }
            }
        }
        return calculatedPicks;
    }
}