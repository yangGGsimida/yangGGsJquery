package cn.suanfa;

public class Selection extends SortModel {
    public static void sort(Comparable[] a) {
        for(int i=0;i<a.length;i++) {
            int min=i;
            for(int j=i+1;j<a.length;j++)
                if(less(a[j],a[min])) min=j; 
                exch(a,i,min);//����Ԫ�صĴ���д����ѭ��֮�⣬ÿ�ֱض�����һ�Σ�һ���������鳤���ִ�
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date[] date=new Date[4];
        date[0]=new Date(1997,6,24);
        date[1]=new Date(1996,5,20);
        date[2]=new Date(1996,4,24);
        date[3]=new Date(1996,4,23);
        Selection.sort(date);
        Selection.show(date);
    }
    
    public static class Date implements Comparable<Date>{
        private final int day;
        private final int month;
        private final int year;
        
        public Date(int year,int month,int day) {
            this.day=day;
            this.month=month;
            this.year=year;
        }
        @Override
        public int compareTo(Date o) {
            if(this.year>o.year) return 1;
            if(this.year<o.year) return -1;
            if(this.month>o.month) return 1;
            if(this.month<o.month) return -1;
            if(this.day>o.day) return 1;
            if(this.day<o.day) return -1;
            return 0;
        }
        @Override
        public String toString() {
            return year+"/"+month+"/"+day;
        }
            
    }
}
