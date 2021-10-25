package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {

    List<Integer> height = new ArrayList<>();


//    List<Integer> height = Arrays.asList(3,5,7);


    public void addHeight(int height)
    {
        this.height.add(height);
    };

public boolean isHeightsIncreasing(){
    int counter=0;
    int a= height.size();
    for (int i=1; i<a ;i++) {
        if (height.get(i)>height.get(i-1)) {
            counter++;
        }
    };
    if (counter == height.size()) { return true;} else { return false;}
}
}
