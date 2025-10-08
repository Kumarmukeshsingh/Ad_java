package ConcurrentMap;
// thrad safe

// synchronized
// probabilistic data structure thet allows for  effecient search insertion and deletion opreation
// 

import java.util.concurrent.ConcurrentSkipListMap;

public class concurrentSkipMap {
   public static void main(String[] args) {
      ConcurrentSkipListMap<Integer, String> skipListMap = new ConcurrentSkipListMap<>();
      skipListMap.put(10);
   }

}
