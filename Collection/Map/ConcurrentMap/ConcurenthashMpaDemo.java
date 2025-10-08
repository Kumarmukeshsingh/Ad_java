// package ConcurrentMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurenthashMpaDemo {
   public static void main(String[] args) {
      ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
      // java 7 -- segement based locking --> 16 segment --> smaller hashmap.
      // only the segment beging writeen to or read from is locked.
      //red: do not requred locking
      // write : lock

      // java 8 --> no segmentation
            //   --> compare -and -swap -approach - no locking execpt  resizing or collision
   }
}
