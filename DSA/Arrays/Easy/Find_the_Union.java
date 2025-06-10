import java.util.ArrayList;

class Find_the_Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> res = new ArrayList<>();

        int ptr1 = 0, ptr2 = 0;
        int len1 = nums1.length, len2 = nums2.length;

        while(ptr1 < len1 && ptr2 < len2){
            if(nums1[ptr1] < nums2[ptr2]){
                if(res.size() == 0 || res.get(res.size() - 1) < nums1[ptr1]){
                    res.add(nums1[ptr1]);
                }
                ptr1++;
            } else if(nums1[ptr1] > nums2[ptr2]){
                if(res.size() == 0 || res.get(res.size() - 1) < nums2[ptr2]){
                    res.add(nums2[ptr2]);
                }
                ptr2++;
            } else {
                if(res.size() == 0 || res.get(res.size() - 1) < nums1[ptr1]){
                    res.add(nums1[ptr1]);
                }
                ptr1++;
                ptr2++;
            }
        }

        if(ptr1 == len1) ptr1--;
        else ptr2--;

        if(ptr1 == len1 - 1){
            while(ptr2 < len2){
                if(res.get(res.size() - 1) < nums2[ptr2]){
                    res.add(nums2[ptr2]);
                }
                ptr2++;
            }
        } else {
            while(ptr1 < len1){
                if(res.get(res.size() - 1) < nums1[ptr1]){
                    res.add(nums1[ptr1]);
                }
                ptr1++;
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();

    }
}

/*
 * Readable code:

 class Find_the_Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> res = new ArrayList<>();

        int ptr1 = 0, ptr2 = 0;
        int len1 = nums1.length, len2 = nums2.length;

        while(ptr1 < len1 && ptr2 < len2){
            if(nums1[ptr1] < nums2[ptr2]){
                if(res.size() == 0 || res.get(res.size() - 1) < nums1[ptr1]){
                    res.add(nums1[ptr1]);
                }
                ptr1++;
            } else if(nums1[ptr1] > nums2[ptr2]){
                if(res.size() == 0 || res.get(res.size() - 1) < nums2[ptr2]){
                    res.add(nums2[ptr2]);
                }
                ptr2++;
            } else {
                if(res.size() == 0 || res.get(res.size() - 1) < nums1[ptr1]){
                    res.add(nums1[ptr1]);
                }
                ptr1++;
                ptr2++;
            }
        }

        while (ptr1 < len1) {
            if (res.isEmpty() || res.get(res.size()-1) < nums1[ptr1]) {
                res.add(nums1[ptr1]);
            }
            ptr1++;
        }

        while (ptr2 < len2) {
            if (res.isEmpty() || res.get(res.size()-1) < nums2[ptr2]) {
                res.add(nums2[ptr2]);
            }
            ptr2++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
 
    }
 }
 */