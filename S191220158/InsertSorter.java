package S191220158;

public class InsertSorter implements Sorter {
    
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swapWithoutShow(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private void swapAndShow(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
            for (int i = 1; i < a.length; i++) {
                int j=i-1;
                int temp=i;
                while((j>=0) && (a[i]<a[j])){
                    swapAndShow(j,j+1);
                    j--;
                    i--;
                }
                i=temp;
            }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}