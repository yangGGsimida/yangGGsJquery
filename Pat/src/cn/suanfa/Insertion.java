package cn.suanfa;

public class Insertion extends SortModel {

	/*
	 * Äã¿´ÎÒÅ£Âğ£¿
	 * 
	 * @return dsadasd
	 */
	public static void sort(Comparable a[]) {
		for(int i=1;i<a.length;i++) {
			for(int j=i;j>0&&less(a[j],a[j-1]);j--) {
				exch(a,j,j-1);
			}
		}
	}
	
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Date[] date=new Date[4];
	        date[0]=new Date(1997,6,24);
	        date[1]=new Date(1996,5,20);
	        date[2]=new Date(1996,4,24);
	        date[3]=new Date(1996,4,23);
	        Insertion.sort(date);
	        Insertion.show(date);
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
