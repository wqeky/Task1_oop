import java.util.HashMap;
import java.util.Map;
import java.util.*;

import empty.EmptyList;
import readonly.ReadOnlyListImp;
import writeonly.WriteOnlyList;
import writeonly.WriteOnlyMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Integer> ma = new HashMap<>();
        ma.put(0, 0);
        ma.put(0, 2);

        WriteOnlyMap<Integer, Integer> map = new WriteOnlyMap<>(ma);
        map.sort();
        System.out.println(map.size());
    }
}

