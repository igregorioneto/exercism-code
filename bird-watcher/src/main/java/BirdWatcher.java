
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length == 0) {
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        int zero;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length) {
            for(int i = 0; i < birdsPerDay.length; i++) {
                sum += birdsPerDay[i];
            }
        } else {
            for(int i = 0; i < numberOfDays; i++) {
                sum += birdsPerDay[i];
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >=5) {
                count +=1;
            }
        }
        return count;
    }
}
