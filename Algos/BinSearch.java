/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int end = n, start = 1;
        while(start < end){
            // https://stackoverflow.com/questions/17358806/fixing-binary-search-bug-from-bentleys-book-programming-pearls-writing-correc
            int middle = start + (end-start)/2;
            if(isBadVersion(middle))
                end = middle;
            else
                start = middle+1;
        }
        return start;
    }
}


//     Binary Search that was ill implemented... TLE    
//     int start = 1;
//         int end = n;
//         int middle = (end + start) / 2;
//         boolean isBad = false;
//         while (true){
//             if(isBadVersion(middle) && isBad == false){
//                 isBad = true;
//                 middle--;
//             }else if(!isBadVersion(middle) && isBad == true){
//                 return middle+1;
//             }else if(isBadVersion(middle) && isBad == true){
//                 middle--;
//             }else if(!isBadVersion(middle)){
//                 middle++;
//             }

    // Bruteforce method... TLE 
    // public int firstBadVersion(int n) {
    //     for( int i = 1; i <= n; i++){
    //         if (isBadVersion(i) == true)
    //             return i;
    //     }
    //     return 0;
    // }
